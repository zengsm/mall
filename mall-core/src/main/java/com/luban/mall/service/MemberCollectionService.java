package com.luban.mall.service;

import com.luban.mall.domain.MemberProductCollection;

import java.util.List;

/**
 * 会员收藏Service
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface MemberCollectionService {
    int addProduct(MemberProductCollection productCollection);

    int deleteProduct(Long memberId, Long productId);

    List<MemberProductCollection> listProduct(Long memberId);
}
