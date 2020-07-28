package com.example.demo.service.impl;

import com.example.demo.entity.Group;
import com.example.demo.mapper.GroupMapper;
import com.example.demo.service.IGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;
/**
 * <p>
 * 分组信息 服务实现类
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-09
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GroupServiceImpl extends ServiceImpl<GroupMapper, Group> implements IGroupService {

 @Resource
 private GroupMapper mapper;
 /**
 * 获取列表
 */
 public List<Group> list(Group entity){
    return mapper.list(entity);
 }
}
