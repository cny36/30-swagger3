package com.cny.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : chennengyuan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class Product {
    private Long id;
    @ApiModelProperty(value = "商品名称",required = true)
    private String name;
    @ApiModelProperty(value = "商品价格",required = false)
    private Long price;
}
