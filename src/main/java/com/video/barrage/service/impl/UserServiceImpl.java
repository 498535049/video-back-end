package com.video.barrage.service.impl;

import com.video.barrage.entity.User;
import com.video.barrage.mapper.UserMapper;
import com.video.barrage.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuyz
 * @since 2019-11-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
