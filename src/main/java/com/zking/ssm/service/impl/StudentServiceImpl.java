package com.zking.ssm.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.mapper.StudentMapper;
import com.zking.ssm.model.Student;
import com.zking.ssm.service.IStudentService;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    public StudentServiceImpl() {
    }


    @Override
    public int add(Student student) {
       int s= studentMapper.add(student);
       Integer id= student.getSid();
        return s;
    }

    @Override
    public Student load(Student student) {
        return studentMapper.load(student);
    }

    @Override
    public int del(Student student) {
        return studentMapper.del(student);
    }

    @Override
    public int edit(Student student) {
        return studentMapper.edit(student);
    }

    @Override
    public List<Student> list(Student student,PageBean pageBean) {
//       if(null!=pageBean&&pageBean.isPagination()){
//           PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
//       }
        List<Student> studentList = studentMapper.list(student);
        System.out.println(studentList.getClass());
//        if(null!=pageBean&&pageBean.isPagination()){
//            PageInfo pageInfo=new PageInfo(studentList);
//            pageBean.setTotal(pageInfo.getTotal()+"");
//        }

        return studentList;
    }

    @Override
    public int deleteAll(StudentVo studentVo) {
        return studentMapper.deletAll(studentVo);
    }
}
