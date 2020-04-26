package com.bw.service.impl;

import com.bw.dao.CtypeMapper;
import com.bw.pojo.Vo.CanpinVo;
import com.bw.service.CtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CtypeServiceImpl implements CtypeService {
    @Autowired
    private CtypeMapper mapper;

    @Override
    public List getlist() {

        return mapper.getList();
    }

    @Override
    public CanpinVo fuwu(int tid) {
        return mapper.fuwu(tid);
    }
}
