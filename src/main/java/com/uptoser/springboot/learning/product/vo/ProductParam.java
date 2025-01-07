package com.uptoser.springboot.learning.product.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "商品参数:ProductParam")
@Data
public class ProductParam {
    @ApiModelProperty(value = "商品名称" ,name = "name",example = "苹果电脑")
    private String name;
    @ApiModelProperty(value = "商品价格" ,name = "price",example = "13999")
    private String price;

}
