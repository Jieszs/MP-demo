package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.*;
import com.example.demo.mapper.AgentInfoMapper;
import com.example.demo.service.IAgentInfoService;
import com.example.demo.service.IGroupService;
import com.example.demo.service.IQuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    IAgentInfoService agentInfoService;
    @Resource
    IQuestionService questionService;
    @Resource
    AgentInfoMapper agentInfoMapper;
    @Resource
    IGroupService groupService;
    @Test
    void selectByEntity() {
        AgentInfo vo = new AgentInfo();
        vo.setOrgId(21);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.setEntity(vo);
        agentInfoService.list(queryWrapper);
    }

    @Test
    void selectByWrapper() {
        QueryWrapper queryWrapper = new QueryWrapper();
        //指定数据库中字段
        agentInfoService.list(queryWrapper);
    }

    @Test
    void saveByAR() {
        Company company = new Company();
        company.setCompanyName("公司名称");
        company.setOrgId(24);
        company.insert();
    }

    @Test
    void updateByAR() {
        Company company = new Company();
        company.setCompanyName("公");
        company.setCompanyId(155);
        company.updateById();
    }

    @Test
    void deleteByAR() {
        Session session = new Session();
        session.setSessionId("d0aa4a4daf8dd6b333901bade8af1606");
        session.deleteById();
    }

    @Test
    void pageByLambda() {
        LambdaQueryWrapper<Question> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.eq(Question::getOrgId, 21);
        IPage page = new Page(0, 5);
        IPage result = questionService.page(page, queryWrapper);
        System.out.println(result.getTotal());
        Question question = new Question();
        question.getOrgId();
}

    @Test
    void selectByCustom() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select("agentId", "agentName", "sex");
        queryWrapper.select(AgentInfo.class, Predicate.isEqual("agentId"));
        agentInfoService.list(queryWrapper);
        QueryWrapper queryWrapper1 = new QueryWrapper();
        queryWrapper1.select("count(1)", "orgId").groupBy("orgId");
        agentInfoService.list(queryWrapper1);
    }

    @Test
    void selectByInclude() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select(AgentInfo.class, Predicate.isEqual("agentId"));
        agentInfoService.list(queryWrapper);
    }

    @Test
    void updateByWrapper() {
        AgentInfo agentInfo = new AgentInfo();
        agentInfo.setAgentNo("t465");
        UpdateWrapper updateWrapper = new UpdateWrapper();
        updateWrapper.eq("agentId", 123);
        agentInfoService.update(agentInfo, updateWrapper);
    }

    @Test
    void updateByLambdaUpdateWrapper() {
        LambdaUpdateWrapper<AgentInfo> wrapper = Wrappers.lambdaUpdate();
        wrapper.eq(AgentInfo::getAgentId, 123).set(AgentInfo::getAgentNo, "t500");
        agentInfoService.update(wrapper);
    }

    @Test
    void updateByLambdaUpdateChainWrapper() {
        boolean result = new LambdaUpdateChainWrapper<AgentInfo>(agentInfoMapper)
                .eq(AgentInfo::getAgentId, 123)
                .set(AgentInfo::getAgentNo, "t123")
                .update();
        System.out.println(result);
    }

    /**
     * 批量添加回显id
     */
    @Test
    void testSaveList() {
        List<Group> groups = new ArrayList<>();
        for(int i=0;i<20;i++)
        {
            Group group = new Group().setGroupName("测试批量"+i);
            groups.add(group);
        }
        groupService.saveBatch(groups);
        groups.stream().map(group -> group.getGroupId()).forEach(System.out::print);
    }
}
