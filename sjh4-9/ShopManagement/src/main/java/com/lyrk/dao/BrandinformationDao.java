package com.lyrk.dao;

import com.lyrk.entity.Brandinformation;
import com.lyrk.entity.BrandinformationParameter;
import com.lyrk.entity.Housingsource;

import java.util.List;

public interface BrandinformationDao {
    int addBrandinformation(Brandinformation brandinformation);

    int HouseSourceCount(BrandinformationParameter parameter);

    List<Brandinformation> queryBrandinformation(BrandinformationParameter parameter);

    Brandinformation toupdateBrandinformation(Brandinformation breakout);

    int updaetBrandinformation(Brandinformation brandinformation);

    int deleteBrandinformation(Brandinformation breakout);
}
