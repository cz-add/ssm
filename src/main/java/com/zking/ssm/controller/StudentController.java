package com.zking.ssm.controller;

//学生类
import com.zking.ssm.model.Student;
//学生接口
import com.zking.ssm.service.IStudentService;
//转josn
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @ModelAttribute
    public  void init(Model model){
        System.out.println("init");

        String[] className={"T220","最帅","最霸气"};
        model.addAttribute("className",className);

        //给springmvc的form标签提供数据，用于绑定
        Student student = new Student();
        model.addAttribute("student",student);
    }

    @RequestMapping("/toAdd")
    public  String toAdd(Model model){
        System.out.println("toAdd");
        return  "addStudent";
    }

    @RequestMapping("/toedit")
    public  String toedit(Model model,Student student){
        System.out.println("toedit");
        Student load = studentService.load(student);
        model.addAttribute("student",load);
        return  "editStudent";
    }
    @RequestMapping("/load")
    @ResponseBody
    public JsonData load(Student student){
        System.out.println("load");
        Student load = studentService.load(student);
        JsonData jsonData=new JsonData();
        jsonData.setResult(load);
        return  jsonData;
    }
    @RequestMapping("/add")
    @ResponseBody
    public  JsonData add(Model model, @Validated(Student.ValidateGroups.Add.class) Student student, BindingResult bindingResult){
       JsonData jsonData=new JsonData();
       if(bindingResult.hasErrors()){
           List<FieldError> fieldErrorList=bindingResult.getFieldErrors();
           Map<String,Object> errors=new HashMap<String, Object>();
           for (FieldError e:fieldErrorList){
               errors.put(e.getField(),e.getDefaultMessage());
           }
           jsonData.setCode(-1);
           jsonData.put("errors",errors);
       }else{
           studentService.add(student);
           jsonData.setCode(0);
           model.addAttribute("message","学生新增成功");
       }
        return  jsonData;
        }

    @RequestMapping("/edit")
    public  String edit(Model model,@Validated(Student.ValidateGroups.Edit.class) Student student, BindingResult bindingResult){
        System.out.println("edit");
        System.out.println(student);
        studentService.edit(student);
        if(bindingResult.hasErrors()){
            System.out.println("服务器端校验不通过");
            return "editStudent";
        }else{
            System.out.println("服务器端校验通过");
        }
        model.addAttribute("message","学生修改成功");
        return  "index";
    }
    @RequestMapping("/del")
    public  String del(){
        System.out.println("del");
        return  null;
    }
}
