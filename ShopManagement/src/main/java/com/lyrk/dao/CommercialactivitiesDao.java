package com.lyrk.dao;

import com.lyrk.entity.CommercialPage;
import com.lyrk.entity.CommercialParameter;
import com.lyrk.entity.Commercialactivities;
import com.lyrk.entity.ResponseResult;
import org.springframework.stereotype.Repository;

import javax.xml.ws.Response;
import java.util.List;

@Repository("CommercialactivitiesDao")
public interface CommercialactivitiesDao {
    /**
     * 业态表全查
     * @param
     * @return
     */
    List<Commercialactivities> getCommer(CommercialParameter parameter);
    /**
     * 查询分页的总数据条数
     */
    int queryCommercialCount(CommercialParameter parameter);
    /**
     * 修改回显
     */
    Commercialactivities toUpdateCommercialactivities(Commercialactivities commercialactivities);
    /**
     * 修改
     */
    int updateCommercial(Commercialactivities commercialactivities);
    /**
     * 删除业态信息
     */
    int deleteCommercial(Commercialactivities commercialactivities);
    /**
     *删除业态信息前查询
     */
    int getBooth(Commercialactivities commercialactivities);
    int getTenement(Commercialactivities commercialactivities);
    int getBrandInformation(Commercialactivities commercialactivities);

    /**
     * 添加业态
     */
    int addCommercial(Commercialactivities commercialactivities);
}
