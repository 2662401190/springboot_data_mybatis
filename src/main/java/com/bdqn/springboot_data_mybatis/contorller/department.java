package com.bdqn.springboot_data_mybatis.contorller;

import com.bdqn.springboot_data_mybatis.mapper.DepartmentMapper;
import com.bdqn.springboot_data_mybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 贺威
 * @create 2018-12-06-9:22
 */
@RestController
public class department {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/hello/{id}")
    public Map hello(@PathVariable("id") Integer id){
        Map<String,Object> s = new HashMap();
        ;
        s.put("ss",departmentMapper.getdepartmentId(id));
        return s;
    }


    @GetMapping("/emp/{id}")
    public Map emp(@PathVariable("id") Integer id) {
        Map<String,Object> s = new HashMap();
        ;
        s.put("ss", employeeMapper.getemployeeId(id));
        return s;
    }
}
