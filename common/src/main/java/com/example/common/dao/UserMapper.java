package com.example.common.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.common.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-12 10:45:50
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}

