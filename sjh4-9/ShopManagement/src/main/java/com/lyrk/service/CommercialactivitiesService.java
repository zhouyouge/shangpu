package com.lyrk.service;


import com.lyrk.entity.Commercialactivities;

import java.util.List;

public interface CommercialactivitiesService {
    /**
     * 业态表全查
     * @param user
     * @return
     */
    List<Commercialactivities> getCommer(Commercialactivities user);
}
