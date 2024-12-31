//package me.ibeyond.springboottest.product.web;
//
//import io.swagger.annotations.*;
//import me.ibeyond.springboottest.base.model.ResponseEntity;
//import me.ibeyond.springboottest.product.model.Product;
//import me.ibeyond.springboottest.product.vo.ProductParam;
//import org.springframework.beans.BeanUtils;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//@RestController
//@RequestMapping(value = "/product")
//@Api(description = "商品管理")
//public class ProductController {
//
//
//    @RequestMapping(value = "/products", method = RequestMethod.GET)
//    @ApiOperation(value = "获取商品列表")
//    @ApiImplicitParams({ @ApiImplicitParam(paramType = "form",  name = "id", value = "商品id", required = true) })
//    public ResponseEntity<List<Product>> getProducts( String id) {
//        List<Product> list = new ArrayList<>();
//        Product product = new Product();
//        product.setId("1");
//        product.setName("电脑");
//        product.setPrice("1233");
//        list.add(product);
//        list.add(product);
//        return new ResponseEntity<>(200, "这个增却", list);
//    }
//
//    @RequestMapping(value = "/products", method = RequestMethod.POST)
//    public ResponseEntity<Product> insertingProducts(@RequestBody ProductParam param) {
//        Product product = new Product();
//        BeanUtils.copyProperties(param,product);
//        product.setId(UUID.randomUUID().toString());
//        return new ResponseEntity<>(200, "陈工", product);
//    }
//}
