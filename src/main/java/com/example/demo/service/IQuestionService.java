package com.example.demo.service;

import com.example.demo.entity.Question;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;
/**
 * <p>
 * 问题信息 服务类
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-08
 */
public interface IQuestionService extends IService<Question> {
/**
* 获取列表
*/
List<Question> list(Question entity);
}
