package com.zking.ssm.vo;

import com.zking.ssm.model.Student;

public class StudentVo extends Student {
    private  Integer[] sids;

    public StudentVo() {
    }

    public Integer[] getSids() {
        return sids;
    }

    public void setSids(Integer[] sids) {
        this.sids = sids;
    }
}
