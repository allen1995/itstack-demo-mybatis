package org.allen.dao;

import org.allen.po.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserDao {

     User queryUserInfoById(Long id);

}
