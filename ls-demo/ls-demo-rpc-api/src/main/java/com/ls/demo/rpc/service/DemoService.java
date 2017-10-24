package com.ls.demo.rpc.service;

import com.ls.demo.common.domain.City;

/**
 * Created by lishuai on 2017/10/24.
 */
public interface DemoService {
    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
