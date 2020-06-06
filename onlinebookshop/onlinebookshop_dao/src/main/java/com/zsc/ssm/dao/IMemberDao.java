package com.zsc.ssm.dao;

import com.zsc.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IMemberDao {

    @Select("select * from member where id=#{id}")
    public Member findById(String id) throws Exception;

    @Update("update users set password='$2a$10$WxwOKkfmFwJDd2nv6MLaZOzW5TPt/OZE5dV8SuCjOMjkSlpjgHrpu' where username='zsc'")
    public int uptadeByname(String name) throws Exception;
}
