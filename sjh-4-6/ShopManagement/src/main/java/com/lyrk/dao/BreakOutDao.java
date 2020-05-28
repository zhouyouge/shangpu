package com.lyrk.dao;


import com.lyrk.entity.BreakParameter;
import com.lyrk.entity.Breakout;
import com.lyrk.entity.Test;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("BreakOutDao")
public interface BreakOutDao   {
  /* int addBreak(Breakout Breakout);*/
  int addBreak(Test Breakout);

    int queryCount( BreakParameter parameter);

    List<Breakout> queryBreakOutList( BreakParameter parameter);

    Breakout toUpdateBreakOut(Breakout Breakout);

 int updateBreakOut(Breakout breakout);

 int deleteBreakOut(Breakout breakout);
}
