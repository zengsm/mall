package com.luban.mall.domain;

import com.luban.mall.model.PmsProduct;
import com.luban.mall.model.PmsProductAttribute;
import com.luban.mall.model.PmsSkuStock;

import java.util.List;

/**
 * 购物车中选择规格的商品信息
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public class CartProduct extends PmsProduct {
    private List<PmsProductAttribute> productAttributeList;
    private List<PmsSkuStock> skuStockList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }
}
