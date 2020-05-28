package com.lyrk.service;

import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.Yusuan;

import java.util.List;

public interface YusuanService {
   /**
    * 1~6月预算数据
    * @param yusuan
    * @return
    */
   ResponseResult Yusuan1(Yusuan yusuan);

   /**
    * 6~12月预算数据
    * @param yusuan
    * @return
    */
   ResponseResult Yusuan2(Yusuan yusuan);
}
