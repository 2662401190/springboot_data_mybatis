package com.bdqn.springboot_data_mybatis.bean;

/**
 * @author 贺威
 * @create 2018-12-04 22:47
 */
public class department {

    private Integer id;

    private String departmentName;

    public department() {
    }

    public department(Integer id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
