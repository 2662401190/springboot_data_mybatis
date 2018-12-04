package com.bdqn.springboot_data_mybatis.bean;

/**
 * @author 贺威
 * @create 2018-12-04 22:47
 */
public class employee {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer dId;
    private department department;

    public employee() {
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public employee(Integer id, String lastName, String email, Integer gender, Integer dId, com.bdqn.springboot_data_mybatis.bean.department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.dId = dId;
        this.department = department;
    }

    public com.bdqn.springboot_data_mybatis.bean.department getDepartment() {
        return department;
    }

    public void setDepartment(com.bdqn.springboot_data_mybatis.bean.department department) {
        this.department = department;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
}
