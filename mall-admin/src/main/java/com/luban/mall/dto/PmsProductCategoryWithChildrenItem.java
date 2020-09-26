package com.luban.mall.dto;

import com.luban.mall.model.PmsProductCategory;

import java.util.List;

/**
 * Created on 2019/5/25.
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    private List<PmsProductCategory> children;

    public List<PmsProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategory> children) {
        this.children = children;
    }
}
