package com.lyrk.controller;



import com.alibaba.fastjson.JSON;
import com.lyrk.entity.*;
import com.lyrk.service.BankAccountService;
import com.lyrk.service.BillService;
import com.lyrk.service.BreakOutService;
import com.lyrk.service.ContractService;
import com.lyrk.util.EmptyUtils;
import com.lyrk.util.RandomNumer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class BreakOutController {
    @Resource
    private BreakOutService breakOutService;
    @Resource
    private ContractService contractService;
    @Resource
    private BankAccountService bankAccountService;
    @Resource
    private BillService billService;

  @Transactional
  @ResponseBody
  @RequestMapping(value = "/addBreakOut",method = RequestMethod.POST)
  public Object addBreakOut(Test breakout) throws ParseException {
      ResponseResult rs=new ResponseResult();
      if(EmptyUtils.isNotEmpty(breakout)){
          if(EmptyUtils.isNotEmpty(breakout.getBreakoutName())){
              /*String aa="cc";*/
              String code = RandomNumer.getFourRandom(5);//得到一个3位的随机数据
              //String cc=aa+code;
              Integer aaa=Integer.valueOf(code);
              breakout.setBrcoding(aaa);
              boolean flag=breakOutService.addBreak(breakout);
              Townercontract townercontract=new Townercontract();
              townercontract.setBreakoutName(breakout.getBreakoutName());
              townercontract.setComanyPhone(breakout.getComanyPhone());
              townercontract.setCompanyAddress(breakout.getCompanyAddress());
              townercontract.setComparyTitle(breakout.getComparyTitle());
              boolean townercontrac=contractService.addContract(townercontract);
              BankAccount bankAccount = new BankAccount();
              bankAccount.setBankaccount(breakout.getBankaccount());
              bankAccount.setBankaccount2(breakout.getBankaccount2());
              bankAccount.setBankName(breakout.getBreakoutName());
              bankAccount.setBankrownum(breakout.getBankrownum());
              bankAccount.setBankName2(breakout.getBankName2());
              bankAccount.setBankrownum2(breakout.getBankrownum2());
              bankAccount.setBreakId(breakout.getBreakoutName());
              bankAccountService.addBankAccount(bankAccount);
              Bill_informationExpression bill = new Bill_informationExpression();
              bill.setBreakoutName(breakout.getBreakoutName());
              bill.setBankName(breakout.getBankName1());
              Date date=new Date();
              SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
              String format = sdf.format(date);
              Date parse = sdf.parse(format);
              bill.setBill_createtime(parse);
              bill.setBill_updatetime(parse);
              bill.setBillingName(breakout.getBillingName());
              bill.setBillAddress(breakout.getBillAddress());
              bill.setBillAccount(breakout.getBillAccount());
              bill.setBillPhone(breakout.getBillPhone());
              bill.setRatepayerNumber(breakout.getRatepayerNumber());
              bill.setBreakoutName(breakout.getBreakoutName());
              bill.setRent_taxRate(breakout.getRent_taxRate());
              billService.addBill(bill);
              rs.setData("添加成功");
              rs.setFlag(1);
              rs.setResult(true);
          }else{
              rs.setData("分场名称为空");
              rs.setFlag(2);
              rs.setResult(false);
          }
      }else{
          rs.setData("传参为空");
          rs.setFlag(3);
          rs.setResult(false);
      }
      return JSON.toJSONString(rs);
  }
    //分页查询
    @RequestMapping(value = "queryBreakOutList",method = RequestMethod.POST)
    public String queryBreakOutList (BreakParameter page,Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(page)){
            BreakPage breakPage=breakOutService.queryBreakOutList(page);
            if(EmptyUtils.isNotEmpty(breakPage.getBreakoutList())){
                rs.setData(breakPage);
                rs.setResult(true);
                rs.setFlag(1);
            }else{
                rs.setData("获取集合为空");
                rs.setResult(false);
                rs.setFlag(2);
            }
        }else{
            rs.setData("获取集合为空");
            rs.setResult(false);
            rs.setFlag(2);
        }
        model.addAttribute("articleList",rs);
        return "articleQuancha";
    }
    //合同分页查询
    @RequestMapping(value = "queryTownercontractList",method = RequestMethod.POST)
    public String queryTownercontractList (ContractParameter page,Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(page)){
            ContractPage breakPage=contractService.queryContractList(page);
            if(EmptyUtils.isNotEmpty(breakPage.getContractList())){
                rs.setData(breakPage);
                rs.setResult(true);
                rs.setFlag(1);
            }else{
                rs.setData("获取集合为空");
                rs.setResult(false);
                rs.setFlag(2);
            }
        }else{
            rs.setData("获取集合为空");
            rs.setResult(false);
            rs.setFlag(2);
        }
        model.addAttribute("queryTownercontractList",rs);
        return "queryTownercontractList";
    }
    //银行分页查询
    @RequestMapping(value = "queryBankAccountList",method = RequestMethod.POST)
    public String queryBankAccountList (BankAccountParameter page,Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(page)){
            BankAccountPage breakPage=bankAccountService.queryBankAccountList(page);
            if(EmptyUtils.isNotEmpty(breakPage.getBankAccountList())){
                rs.setData(breakPage);
                rs.setResult(true);
                rs.setFlag(1);
            }else{
                rs.setData("获取集合为空");
                rs.setResult(false);
                rs.setFlag(2);
            }
        }else{
            rs.setData("获取集合为空");
            rs.setResult(false);
            rs.setFlag(2);
        }
        model.addAttribute("queryBankAccountList",rs);
        return "queryBankAccountList";
    }
    //开票分页查询
    @RequestMapping(value = "queryBillinformationExpressionList",method = RequestMethod.POST)
    public String queryBillinformationExpressionList (BillParameter page,Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(page)){
            BillPage breakPage=billService.queryBillList(page);
            if(EmptyUtils.isNotEmpty(breakPage.getBillList())){
                rs.setData(breakPage);
                rs.setResult(true);
                rs.setFlag(1);
            }else{
                rs.setData("获取集合为空");
                rs.setResult(false);
                rs.setFlag(2);
            }
        }else{
            rs.setData("获取集合为空");
            rs.setResult(false);
            rs.setFlag(2);
        }
        model.addAttribute("queryBillinformationExpressionList",rs);
        return "queryBillinformationExpressionList";
    }
    //删除分场信息
    @RequestMapping(value = "deleteBreakOut",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBreakOut(@Param("breakoutName") String  breakoutName, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(breakoutName)){
                Breakout breakout=new Breakout();
                breakout.setBreakoutName(breakoutName);
                rs=breakOutService.deleteBreakOut(breakout);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSON(rs);
    }
    //删除甲方合同信息
    @RequestMapping(value = "deleteTownercontract",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteTownercontract(@Param("breakId") Integer breakId, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(breakId)){
                Townercontract breakout=new Townercontract();
                breakout.setBreakId(breakId);
                rs=contractService.deleteContract(breakout);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSON(rs);
    }
    //删除银行信息
    @RequestMapping(value = "delete1BankAccount",method = RequestMethod.POST)
    @ResponseBody
    public Object delete1BankAccount(@Param("bankId") Integer bankId, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(bankId)){
                BankAccount breakout=new BankAccount();
                breakout.setBankId(bankId);
                rs=bankAccountService.deleteBankAccount(breakout);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSON(rs);
    }
    //删除开票信息
    @RequestMapping(value = "deleteBillinformation",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBillinformation(@Param("billId") Integer billId, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(billId)){
                Bill_informationExpression breakout=new Bill_informationExpression();
                breakout.setBillId(billId);
                rs=billService.deleteBill(breakout);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSON(rs);
    }

    //显示一铺一价修改的界面
    @ResponseBody
    @RequestMapping(value = "updateBreakShow",method = RequestMethod.POST)
    public Object updateBreakShow(@Param("breakoutName") String  breakoutName,Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(breakoutName)){
                Test test=new Test();
                Breakout breakout=new Breakout();
                breakout.setBreakoutName(breakoutName);
                rs=breakOutService.toUpdateBreakOut(breakout);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONString(rs);
    }
    //显示甲方合同修改的界面
        @ResponseBody
        @RequestMapping(value = "updateTownercontract",method = RequestMethod.POST)
        public Object updateTownercontract(@Param("breakId") Integer  breakId,Model model,HttpSession session) {
            ResponseResult rs=new ResponseResult();
            User user=(User)session.getAttribute("user");
            if(EmptyUtils.isNotEmpty(user)){
                if(EmptyUtils.isNotEmpty(breakId)){
                    Townercontract breakout=new Townercontract();
                    breakout.setBreakId(breakId);
                    rs=contractService.toUpdateContractOut(breakout);
                }else{
                    rs.setData("传参为空");
                    rs.setResult(false);
                    rs.setFlag(4);
                }
            }else{
                rs.setData("用户未登录");
                rs.setResult(false);
                rs.setFlag(5);
            }
            return JSON.toJSONString(rs);
    }
    //显示银行修改的界面
    @ResponseBody
    @RequestMapping(value = "updateBankAccount",method = RequestMethod.POST)
    public Object updateBankAccount(@Param("bankId") Integer  bankId,Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(bankId)){
                BankAccount breakout=new BankAccount();
                breakout.setBankId(bankId);
                rs=bankAccountService.toUpdateBankAccountOut(breakout);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONString(rs);
    }
    //显示开票修改的界面
    @ResponseBody
    @RequestMapping(value = "updateBillinformation",method = RequestMethod.POST)
    public Object updateBillinformation(@Param("billId") Integer  billId,Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(billId)){
                Bill_informationExpression breakout=new Bill_informationExpression();
                breakout.setBillId(billId);
                rs=billService.toUpdateBillOut(breakout);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONString(rs);
    }

    //修改一铺一价信息
    @ResponseBody
    @RequestMapping(value = "updateBreakOut",method = RequestMethod.POST)
    public Object updateBreakOut(Breakout  breakout, Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(breakout)){
                if(breakout.getBreakoutName()!=""){
                    rs=breakOutService.updateBreakOut(breakout);
                }
                if(breakout.getBreakId()!=null){
                    Townercontract townercontract=new Townercontract();
                    townercontract.setBreakId(breakout.getBreakId());
                    townercontract.setBreakoutName(breakout.getBreakoutNamee());
                    townercontract.setComanyPhone(breakout.getComanyPhone());
                    townercontract.setCompanyAddress(breakout.getCompanyAddress());
                    townercontract.setComparyTitle(breakout.getComparyTitle());
                    rs=contractService.updateContractOut(townercontract);
                }
                if(breakout.getBankId()!=null){
                    BankAccount bankAccount=new BankAccount();
                    bankAccount.setBankId(breakout.getBankId());
                    bankAccount.setBankaccount(breakout.getBankaccount());
                    bankAccount.setBankaccount2(breakout.getBankaccount2());
                    bankAccount.setBankName(breakout.getBankName());
                    bankAccount.setBankName2(breakout.getBankName2());
                    bankAccount.setBankrownum(breakout.getBankrownum());
                    bankAccount.setBankrownum2(breakout.getBankrownum2());
                    bankAccount.setBreakId(breakout.getBreakIdd());
                    rs=bankAccountService.updateBankAccountOut(bankAccount);
                }
                if(breakout.getBillId()!=null){
                    Bill_informationExpression bill=new Bill_informationExpression();
                    bill.setBillId(breakout.getBillId());
                    bill.setBreakoutName(breakout.getBreakoutNameee());
                    bill.setBankName(breakout.getBankNamee());
                    bill.setBillAccount(breakout.getBillAccount());
                    bill.setBillAddress(breakout.getBillAddress());
                    bill.setBillingName(breakout.getBillingName());
                    bill.setBillPhone(breakout.getBillPhone());
                    bill.setRatepayerNumber(breakout.getRatepayerNumber());
                    bill.setRent_taxRate(breakout.getRent_taxRate());
                    rs=billService.updateBillOut(bill);
                }
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONString(rs);
    }

}
