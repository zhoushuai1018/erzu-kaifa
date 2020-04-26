package com.bw.pojo.Vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class CanpinVo {
    private Integer sid;
    private String qishu;
    private Integer tid;
    private double cjqian;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date fadate;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date kaidate;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date jdate;
    private Integer ren;


    private Integer yue;
    private Integer lid;
    private double xj;
    private double tj;
    private Integer cjxianzi;
    private double lilv;
}
