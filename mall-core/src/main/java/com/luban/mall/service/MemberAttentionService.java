package com.luban.mall.service;

import com.luban.mall.domain.MemberBrandAttention;

import java.util.List;

/**
 * 会员关注Service
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface MemberAttentionService {
    /**
     * 添加关注
     */
    int add(MemberBrandAttention memberBrandAttention);

    /**
     * 取消关注
     */
    int delete(Long memberId, Long brandId);

    /**
     * 获取用户关注列表
     */
    List<MemberBrandAttention> list(Long memberId);
}
