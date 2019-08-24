package com.zking.ssm.service;

import com.zking.ssm.model.Student;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.vo.StudentVo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.Format;
import java.util.List;

import static org.junit.Assert.*;

public class IStudentServiceTest extends BaseTestCase{
    @Autowired
    private  IStudentService studentService;
    private Student student;
    private StudentVo studentVo;

    @Override
    public void setUp() {
        super.setUp();
        studentVo=new StudentVo();
        student=new Student();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() throws Exception {
        student.setSname("小飞龙");
        student.setRemark("很胸闷");
        student.setAge(19);
        int rowCount = studentService.add(student);
        System.out.println(rowCount);
        System.out.println(student.getSid());
    }

    @Test
    public void load() throws Exception {
        student.setSid(10);
        Student s = studentService.load(student);
        System.out.println(s);
        System.out.println("xxxxxxxxxxxx");
         s = studentService.load(student);
         System.out.println(s);
    }

    @Test
    public void del() throws Exception {
    }

    @Test
    public void edit() throws Exception {
    }

    @Test
    public void list() throws Exception {
        pageBean.setRows(3);
        List<Student> studentList = studentService.list(student,pageBean);
        for (Student s:studentList) {
            System.out.println(s);
        }
        System.out.println(pageBean);
    }

    @Test
    public void delAll() throws Exception {
        studentVo.setSids(new Integer[] {11,12});
        int rowCount = studentService.deleteAll(studentVo);
        System.out.println(rowCount);
    }

}