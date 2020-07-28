package com.example.demo.service.impl;

import com.example.demo.entity.Question;
import com.example.demo.mapper.QuestionMapper;
import com.example.demo.service.IQuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;
/**
 * <p>
 * 问题信息 服务实现类
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-08
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements IQuestionService {

 @Resource
 private QuestionMapper mapper;
 /**
 * 获取列表
 */
 public List<Question> list(Question entity){
    return mapper.list(entity);
 }
}
