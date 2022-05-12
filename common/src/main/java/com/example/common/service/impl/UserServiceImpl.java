package com.example.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.dao.UserMapper;
import com.example.common.entity.User;
import com.example.common.service.UserService;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-05-12 10:45:52
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

