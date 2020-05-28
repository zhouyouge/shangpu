package com.lyrk.service;


import com.lyrk.entity.CommercialPage;
import com.lyrk.entity.CommercialParameter;
import com.lyrk.entity.Commercialactivities;
import com.lyrk.entity.ResponseResult;

import java.util.List;

public interface CommercialactivitiesService {
    /**
     * 业态表全查
     * @param
     * @return
     */
    CommercialPage getCommer(CommercialParameter parameter);
    /**
     * 查询分页的总数据条数
     */
    int queryCommercialCount(CommercialParameter parameter);
    /**
     * 修改回显
     */
    ResponseResult toUpdateCommercialactivities(Commercialactivities commercialactivities);
    /**
     * 修改
     */
    ResponseResult updateCommercial(Commercialactivities commercialactivities);
    /**
     * 删除业态信息
     */
    ResponseResult deleteCommercial(Commercialactivities commercialactivities);
    /**
     *删除业态信息前查询
     */

    ResponseResult deleteQian(Commercialactivities commercialactivities);
/*    int getBooth(Commercialactivities commercialactivities);
    int getTenement(Commercialactivities commercialactivities);
    int getBrandInformation(Commercialactivities commercialactivities);*/

    /**
     * 添加业态
     */
    ResponseResult  addCommercial(Commercialactivities commercialactivities);
}
