package com.ls.demo.client.main;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ls.demo.common.domain.City;
import com.ls.demo.rpc.service.DemoService;

import org.springframework.stereotype.Component;

/**
 * 城市 Dubbo 服务消费者
 *
 * Created by bysocket on 28/02/2017.
 */
@Component
public class DemoConsumerService {

    @Reference(version = "1.0.0")
    DemoService cityDubboService;

    public void printCity() {
        String cityName="温岭";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}
