package com.example.demo.service;

import com.example.demo.entity.Group;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;
/**
 * <p>
 * 分组信息 服务类
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-09
 */
public interface IGroupService extends IService<Group> {
/**
* 获取列表
*/
List<Group> list(Group entity);
}
