//package me.ibeyond.springboottest.product.model;
//
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//
//import java.util.List;
//
//@ApiModel(value = "复杂商品:Product")
//public class ComplexProduct {
//    @ApiModelProperty(value = "商品列表")
//    private List<Product> products;
//    @ApiModelProperty(value = "BANNER列表" )
//    private List<Banner> banners;
//    @ApiModelProperty(value = "通知的实体"  )
//    private Notice notice;
//    @ApiModelProperty(value = "页面状态" , notes = "1:商品页面，2:订单页面，3:购物车页面")
//    private int pageStatue;
//
//    @Override
//    public String toString() {
//        return "ComplexProduct{" +
//                "products=" + products +
//                ", banners=" + banners +
//                ", notice=" + notice +
//                ", pageStatue=" + pageStatue +
//                '}';
//    }
//
//    public List<Product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }
//
//    public List<Banner> getBanners() {
//        return banners;
//    }
//
//    public void setBanners(List<Banner> banners) {
//        this.banners = banners;
//    }
//
//    public Notice getNotice() {
//        return notice;
//    }
//
//    public void setNotice(Notice notice) {
//        this.notice = notice;
//    }
//
//    public int getPageStatue() {
//        return pageStatue;
//    }
//
//    public void setPageStatue(int pageStatue) {
//        this.pageStatue = pageStatue;
//    }
//}
