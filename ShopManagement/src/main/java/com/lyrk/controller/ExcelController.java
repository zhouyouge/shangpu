package com.lyrk.controller;

import com.alibaba.fastjson.JSON;
import com.lyrk.entity.Ashopprice;
import com.lyrk.entity.ExportData;
import com.lyrk.entity.ResponseResult;
import com.lyrk.service.AshopriceService;
import com.lyrk.util.FileUpload;
import com.lyrk.util.ObjectExcelRead;
import com.lyrk.util.ObjectExcelView;
import com.lyrk.util.PathUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class ExcelController {
	@Resource
	private AshopriceService ashopriceService;

	@RequestMapping(value="/importExcel",method= RequestMethod.GET)
	public ModelAndView getExcel(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("importExcel.ftl");
		return mv;
	}


	@RequestMapping(value="/importExcel",method= RequestMethod.POST)
	@ResponseBody
	public Object importExcel(@RequestParam(value="excel",required=false) MultipartFile file) throws Exception{
		ResponseResult rs=new ResponseResult();
		System.out.println("进入impotExcel");
		if(null!=file&&!file.isEmpty()){
			String filePath = PathUtil.getClasspath()+"uploadFiles/file/";//文件上传路径
			String fileName = FileUpload.fileUp(file, filePath, "userexcel");//执行上传
			//执行读excel操作,读出的数据导入LIST 1：从第2行开始， 0：从第A列开始 1：从第1个sheet开始
			List<ExportData> listPd =
			(List) ObjectExcelRead.readExcel(filePath,fileName,1,0,0);
			for(int i=0;i<listPd.size();i++){
				ExportData data = new ExportData();
				data=listPd.get(i);
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");//Date指定格式：yyyy-MM-dd HH:mm:ss:SSS
				Ashopprice ashopprice=new Ashopprice();
				try {
				ashopprice.setAnnual(simpleDateFormat.parse((String)data.get("var0")));
				ashopprice.setRentHoliday(Integer.parseInt((String)data.get("var1")));
				ashopprice.setSasacGuidedPrices(Double.valueOf((String)data.get("var2")));
				ashopprice.setMarketPrice(Double.valueOf((String)data.get("var3")));
				ashopprice.setMarketCompanyPricing(Double.valueOf((String)data.get("var4")));
				ashopprice.setMarketHistoryPrice(Double.valueOf((String)data.get("var5")));
				ashopprice.setNetworkHistoryPrice(Double.valueOf((String)data.get("var6")));
				ashopprice.setOutletCompanyPricing(Double.valueOf((String)data.get("var7")));
				ashopprice.setBoothNumber((String)data.get("var8"));
				ashopprice.setRent(Double.valueOf((String)data.get("var9")));
				ashopprice.setAshop_createtime(simpleDateFormat.parse((String)(data.get("var10"))));
				ashopprice.setAshop_updatetime(simpleDateFormat.parse((String)(data.get("var11"))));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				boolean flag =ashopriceService.addAshopprice1(ashopprice);
				if(!flag){
					rs.setData("数据导入失败");
					rs.setFlag(1);
					rs.setResult(false);
				}else{
					rs.setData("数据导入成功");
					rs.setFlag(2);
					rs.setResult(true);
				}
			}
		}
		return JSON.toJSONString(rs);
	}
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/exportExcel")
	public ModelAndView exportExcel(){
		//查询数据库数据
		List<Ashopprice> ashoppriceList = ashopriceService.getAshopirceList();//数据库表中的数据集合
		List<ExportData> dataList = new ArrayList<ExportData>();//用来封装recordList的excel数据集合
		//遍历，传值
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		for(Ashopprice ashop:ashoppriceList){
			ExportData vpd = new ExportData();
			vpd.put("var0",(simpleDateFormat.format(ashop.getAnnual())));  // String dateStr = simpleDateFormat.format(date);
			vpd.put("var1",String.valueOf(ashop.getRentHoliday()));
			vpd.put("var2",String.valueOf(ashop.getSasacGuidedPrices()));
			vpd.put("var3",String.valueOf(ashop.getMarketPrice()));
			vpd.put("var4",String.valueOf(ashop.getMarketCompanyPricing()));
			vpd.put("var5",String.valueOf(ashop.getMarketHistoryPrice()));
			vpd.put("var6",String.valueOf(ashop.getNetworkHistoryPrice()));
			vpd.put("var7",String.valueOf(ashop.getOutletCompanyPricing()));
			vpd.put("var8",ashop.getBoothNumber());
			vpd.put("var9",String.valueOf(ashop.getRent()));
			vpd.put("var10",(simpleDateFormat.format(ashop.getAshop_createtime())));
			vpd.put("var11",(simpleDateFormat.format(ashop.getAshop_updatetime())));
			dataList.add(vpd);
		}
		ObjectExcelView erv = new ObjectExcelView();
		Map<String,Object> dataMap = new HashMap<String,Object>();
		List<String> titles = new ArrayList<String>();
		titles.add("年度");
		titles.add("免租期");
		titles.add("国资委指导价");
		titles.add("周边市场价");
		titles.add("菜场公司定价");
		titles.add("菜场历史合同价");
		titles.add("网点历史合同价");
		titles.add("网点公司定价");
		titles.add("摊位号");
		titles.add("摊位租金");
		titles.add("创建时间");
		titles.add("修改时间");
		dataMap.put("titles",titles);
		dataMap.put("dataList",dataList);
		ModelAndView vi = new ModelAndView(erv,dataMap);
		return vi;
	}

	@RequestMapping(value="/importExcelss",method = RequestMethod.POST)
	public String  exportExcel(Model model) {
		return "importExcel.ftl";
	}
}
