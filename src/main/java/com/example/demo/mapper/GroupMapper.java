package com.example.demo.mapper;

import com.example.demo.entity.Group;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 * 分组信息 Mapper 接口
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-09
 */
public interface GroupMapper extends BaseMapper<Group> {
 /**
 * 获取列表
 */
 List<Group> list(Group entity);
}
