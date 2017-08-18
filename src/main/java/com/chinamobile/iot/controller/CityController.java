package com.chinamobile.iot.controller;

import com.chinamobile.iot.model.City;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author xinj.xue
 * @description：
 * @date 2017-08-18 17:32
 **/
@Api(value = "城市信息接口",description = "城市信息API接口",tags = "CityApi",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class CityController {

    @PostMapping(value = "/addCity",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "addCity",notes = "添加城市",tags = "v1.09",code = 300,nickname = "add_city")
    public City addCity(@RequestBody City city) {
        System.out.println("添加城市成功。。。");
        return city;
    }

    @GetMapping(value = "/getCity",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "getCity",notes = "获取城市",code = 202)
    public City getCity(@RequestParam("cityName") String cityName) {
        City city = new City();
        city.setCityName(cityName);
        city.setProvince("河北省");
        return city;
    }
}
