package com.cny.swagger.controller;

import com.cny.swagger.dto.CommonResult;
import com.cny.swagger.dto.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author : chennengyuan
 */
@Slf4j
@RestController
@RequestMapping("/product")
@Api(tags = "商品模块")
public class ProductController {

    @ApiOperation("根据ID获取商品信息")
    @GetMapping("/v1/getById")
    public CommonResult<Product> getById(@ApiParam(name = "id",value = "商品ID标识") @RequestParam("id") Long id) {
        Product product = new Product(id, "product-name", 999L);
        return new CommonResult<>(200, "success", product);
    }


    @ApiOperation("新增商品")
    @PostMapping("/v1/addProduct")
    public CommonResult<Void> addProduct(Product product) {
        log.info("商品新增成功：{}", product);
        return new CommonResult<>(200, "success", null);
    }

}
