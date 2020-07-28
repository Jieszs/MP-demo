package com.example.demo.mapper;

import com.example.demo.entity.Session;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 * 会话信息 Mapper 接口
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-08
 */
public interface SessionMapper extends BaseMapper<Session> {
 /**
 * 获取列表
 */
 List<Session> list(Session entity);
}
