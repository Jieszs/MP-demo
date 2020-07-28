package com.example.demo.service.impl;

import com.example.demo.entity.AgentInfo;
import com.example.demo.mapper.AgentInfoMapper;
import com.example.demo.service.IAgentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客服信息 服务实现类
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-01
 */
@Service
public class AgentInfoServiceImpl extends ServiceImpl<AgentInfoMapper, AgentInfo> implements IAgentInfoService {

}
