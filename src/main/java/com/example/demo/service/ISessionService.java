package com.example.demo.service;

import com.example.demo.entity.Session;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;
/**
 * <p>
 * 会话信息 服务类
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-08
 */
public interface ISessionService extends IService<Session> {
/**
* 获取列表
*/
List<Session> list(Session entity);
}
