package com.example.demo.service.impl;

import com.example.demo.Entity.user;
import com.example.demo.Mapper.userMapper;
import com.example.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangyuexin
 * @since 2022-04-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<userMapper, user> implements UserService {

}
