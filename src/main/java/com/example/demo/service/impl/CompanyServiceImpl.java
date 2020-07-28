package com.example.demo.service.impl;

import com.example.demo.entity.Company;
import com.example.demo.mapper.CompanyMapper;
import com.example.demo.service.ICompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司 服务实现类
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-07
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
