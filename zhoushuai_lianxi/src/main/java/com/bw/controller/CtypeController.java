package com.bw.controller;

import com.bw.pojo.Vo.CanpinVo;
import com.bw.service.CtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CtypeController {
    @Autowired
    private CtypeService ss;

    @RequestMapping("list")
    public List list(){
        System.out.println("1111111");
        List list=ss.getlist();
        return list;
    }


    @RequestMapping("fuwu")
    public CanpinVo fuwu(int tid){
        System.out.println("1111111");
        CanpinVo list=ss.fuwu(tid);
        return list;
    }




}
