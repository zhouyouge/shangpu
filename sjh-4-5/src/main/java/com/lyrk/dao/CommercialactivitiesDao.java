package com.lyrk.dao;

import com.lyrk.entity.Commercialactivities;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("CommercialactivitiesDao")
public interface CommercialactivitiesDao {
    /**
     * 业态表全查
     * @param
     * @return
     */
    List<Commercialactivities> getCommer(Commercialactivities commer);
}
