package com.ls.demo.rpc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ls.demo.common.domain.City;
import com.ls.demo.rpc.service.DemoService;

/**
 * Created by lishuai on 2017/10/24.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    public City findCityByName(String cityName) {
        return new City(1L,2L,"温岭","是我的故乡");
    }
}

