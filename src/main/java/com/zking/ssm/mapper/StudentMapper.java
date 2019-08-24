package com.zking.ssm.mapper;

import com.zking.ssm.model.Student;
import com.zking.ssm.vo.StudentVo;

import java.util.List;

public interface StudentMapper {
    int add(Student student);
    int edit(Student student);

    int del(Student student);

    Student load(Student student);

    int deletAll(StudentVo studentVo);
    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> list(Student student);
}