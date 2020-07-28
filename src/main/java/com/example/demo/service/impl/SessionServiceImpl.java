package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.demo.entity.Session;
import com.example.demo.mapper.SessionMapper;
import com.example.demo.service.ISessionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;
/**
 * <p>
 * 会话信息 服务实现类
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-08
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SessionServiceImpl extends ServiceImpl<SessionMapper, Session> implements ISessionService {

 @Resource
 private SessionMapper mapper;
 /**
 * 获取列表
 */
 public List<Session> list(@Param(Constants.WRAPPER) Session entity){
    return mapper.list(entity);
 }
}
