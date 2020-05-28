package com.lyrk.service.impl;


import com.lyrk.dao.CommercialactivitiesDao;
import com.lyrk.entity.Commercialactivities;
import com.lyrk.service.CommercialactivitiesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("CommercialactivitiesService")
public class CommercialactivitiesServiceImpl implements CommercialactivitiesService {

    @Resource
    private CommercialactivitiesDao commercialactivitiesDao;
    @Override
    public List<Commercialactivities> getCommer(Commercialactivities commer) {
        return commercialactivitiesDao.getCommer(commer);
    }
}
