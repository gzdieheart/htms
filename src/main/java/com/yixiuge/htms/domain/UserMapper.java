package com.yixiuge.htms.domain;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
    @Select("select * from p_user where id = #{id}")
    public User getById(String id);

    @Options(useGeneratedKeys=true, keyProperty = "id")

    @Insert("insert into p_user(id, user_name, password) values(#{id},#{userName},#{age})")
    public String save(User user);
}