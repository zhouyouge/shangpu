package com.lyrk.dao;


import com.lyrk.entity.Yusuan;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("YusuanDao")
public interface YusuanDao {
   List<Yusuan> Yusuan1(Yusuan yusuan);
   List<Yusuan> Yusuan2(Yusuan yusuan);
}
