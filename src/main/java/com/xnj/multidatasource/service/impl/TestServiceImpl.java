package com.xnj.multidatasource.service.impl;

import com.xnj.multidatasource.entity.Test;
import com.xnj.multidatasource.mapper.TestMapper;
import com.xnj.multidatasource.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author NingkitTse
 * @since 2020-01-04
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
