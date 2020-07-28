package com.example.demo.mapper;

import com.example.demo.entity.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 * 问题信息 Mapper 接口
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-08
 */
public interface QuestionMapper extends BaseMapper<Question> {
 /**
 * 获取列表
 */
 List<Question> list(Question entity);
}
