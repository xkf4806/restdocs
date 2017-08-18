package com.chinamobile.iot.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author xinj.xue
 * @description：
 * @date 2017-08-18 17:29
 **/
@Data
@ApiModel(value = "城市",description = "城市信息描述")
public class City {
    @ApiModelProperty(value = "城市名称")
    private String cityName;
    @ApiModelProperty(value = "所在省份")
    private String province;
}
