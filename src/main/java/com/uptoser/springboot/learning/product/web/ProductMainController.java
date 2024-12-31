//package me.ibeyond.springboottest.product.web;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import me.ibeyond.springboottest.base.model.ResponseEntity;
//import me.ibeyond.springboottest.product.model.*;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/product")
//@Api(description = "商品管理")
//public class ProductMainController {
//
//
//    @RequestMapping(value = "/products/complex", method = RequestMethod.GET)
//    @ApiOperation(value = "获取复杂商品首页")
//    public ResponseEntity<ComplexProduct> getProducts() {
//        //创建返回实体
//        ComplexProduct complexProduct = new ComplexProduct();
////        创建产品列表
//        List<Product> list = new ArrayList<>();
//        Product product = new Product();
//        product.setId("11");
//        product.setName("电脑1");
//        product.setPrice("12331");
//        list.add(product);
//        list.add(product);
//        complexProduct.setProducts(list);
////        加入BANNER列表
//        List<Banner> list1 = new ArrayList<>();
//        Banner banner = new Banner();
//        banner.setId("1");
//        banner.setUrl("http://www.baidu.com");
//        Advert advert = new Advert();
//        advert.setUrl("这里是广告的地址哦");
//        banner.setAdvert(advert);
//        list1.add(banner);
//        list1.add(banner);
//        complexProduct.setBanners(list1);
////        加入通知
//        Notice notice = new Notice();
//        notice.setContext("这个是最新的同通知");
//        notice.setId("1");
//        complexProduct.setNotice(notice);
//        //这是页面状态
//        complexProduct.setPageStatue(3);
//        return new ResponseEntity<>(200, "复杂页面返回成功", complexProduct);
//    }
//
//
//}
