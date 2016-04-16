package com.haoyifen.mySSMTemplate.service;

import com.haoyifen.mySSMTemplate.dao.UserMapper;
import com.haoyifen.mySSMTemplate.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by haoyifen on 2016/3/19 0019.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public User getUserById(int userId){
        return this.userMapper.selectByPrimaryKey(userId);
    }
}
