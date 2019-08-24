package com.zking.ssm.service;

import com.zking.ssm.model.Student;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.vo.StudentVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IStudentService {
    /**
     * 增加
     *
     * @param student
     * @return
     */
    int add(Student student);

    /**
     * 根据id查询
     *
     * @param student
     * @return
     */
    //只读
    @Transactional(readOnly = true)
    Student load(Student student);

    /**
     * 删除
     *
     * @param student
     * @return
     */
    int del(Student student);

    /**
     * 修改
     *
     * @param student
     * @return
     */
    int edit(Student student);

    /**
     * 查询所有
     *
     * @param student
     * @return
     */
    @Transactional(readOnly = true)
//只读
    List<Student> list(Student student, PageBean pageBean);

    int deleteAll(StudentVo studentVo);
}
