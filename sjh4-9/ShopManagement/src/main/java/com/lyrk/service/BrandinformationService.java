package com.lyrk.service;

import com.lyrk.entity.Brandinformation;
import com.lyrk.entity.BrandinformationPage;
import com.lyrk.entity.BrandinformationParameter;
import com.lyrk.entity.ResponseResult;

public interface BrandinformationService {
    ResponseResult addBrandinformation(Brandinformation brandinformation);

    BrandinformationPage queryBrandinformation(BrandinformationParameter parameter);

    ResponseResult toupdateBrandinformation(Brandinformation breakout);

    ResponseResult updaetBrandinformation(Brandinformation brandinformation);

    ResponseResult deleteBrandinformation(Brandinformation breakout);
}
