package com.bw.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Canpian {
    private Integer sid;
    private String qishu;
    private Integer tid;
    private double cjqian;
    private Date fadate;
    private Date kaidate;
    private Date jdate;
    private Integer ren;
}
