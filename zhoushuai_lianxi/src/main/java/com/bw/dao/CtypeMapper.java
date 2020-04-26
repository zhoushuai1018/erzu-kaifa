package com.bw.dao;

import com.bw.pojo.Vo.CanpinVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CtypeMapper {

   

    CanpinVo fuwu(@Param("tid") int tid);

    List getList();
}
