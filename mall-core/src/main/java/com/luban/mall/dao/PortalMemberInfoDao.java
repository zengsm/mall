package com.luban.mall.dao;

import com.luban.mall.domain.PortalMemberInfo;

/**
 * @description: 会员信息获取
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface PortalMemberInfoDao {
    /**
     * 查询会员信息
     * @param memberId
     * @return
     */
    PortalMemberInfo getMemberInfo(Long memberId);
}
