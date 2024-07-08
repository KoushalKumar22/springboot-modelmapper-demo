package com.Ptacises.ModelMapper.Controller;

import com.Ptacises.ModelMapper.DTO.StudentDto;
import com.Ptacises.ModelMapper.Entity.StudentLogin;
import com.Ptacises.ModelMapper.Repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StudentController {

    @Autowired
    StudentRepository srepo;

    @Autowired
    ModelMapper studentConfigration;

    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }

    @PostMapping("/save")
//    public String save(@RequestBody StudentDto studentDto){
//
//        StudentLogin s=new StudentLogin();
//        s.setName(studentDto.getName());
//        s.setId(studentDto.getStd());
//        srepo.save(s);
//        return "Data Saved";
//    }
    public StudentDto save(@RequestBody StudentDto studentDto){
        StudentLogin s=new StudentLogin();
        studentConfigration.map(studentDto,s);
        srepo.save(s);
        return studentDto;
    }
    @GetMapping("/all")
//    public List<StudentDto> findAll(){
//
//        return srepo.findAll().stream().map(studentLogin -> {
//            StudentDto studentDto=new StudentDto();
//            studentDto.setName(studentLogin.getName());
//            studentDto.setStd(studentLogin.getStd());
//            return studentDto;
//        }).collect(Collectors.toList());
//    }
    public List<StudentDto> findall(){
        return srepo.findAll()
                .stream()
                .map(studentLogin -> studentConfigration
                        .map(studentLogin, StudentDto.class))
                .collect(Collectors.toList());
    }
}
