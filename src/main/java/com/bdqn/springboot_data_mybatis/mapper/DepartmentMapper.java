package com.bdqn.springboot_data_mybatis.mapper;

import com.bdqn.springboot_data_mybatis.bean.department;
import org.apache.ibatis.annotations.Select;

/**
 * @author 贺威
 * @create 2018-12-06-9:08
 */

public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    public department getdepartmentId(Integer id);


}
