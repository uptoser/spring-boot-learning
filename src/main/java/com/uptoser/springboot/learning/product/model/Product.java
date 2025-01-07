package com.uptoser.springboot.learning.product.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "商品:Product")
@Data
public class Product {
    @ApiModelProperty(value = "商品ID" ,name = "id" ,notes = "aaa")
    private String id;
    @ApiModelProperty(value = "商品名称" ,name = "name" )
    private String name;
    @ApiModelProperty(value = "商品价格" ,name = "price" )
    private String price;

}
