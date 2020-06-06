package com.zsc.ssm.service;

import com.zsc.ssm.domain.Role;
import com.zsc.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    List<UserInfo> findAll() throws Exception;

    void save(UserInfo userInfo) throws Exception;

    UserInfo findById(String id) throws Exception;

    List<Role> findOtherRoles(String userId) throws Exception;

    void addRoleToUser(String userId, String[] roleIds);

    UserInfo findByUsername(String name) throws Exception;

    void deleteUserById(String userId)throws Exception;
}
