package com.luban.mall.service;

import com.luban.mall.domain.PortalMemberInfo;
/**
 * @description: 交易服务
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface UmsMemberCenterService {

    /**
     * 查询会员信息
     * @param memberId
     * @return
     */
    PortalMemberInfo getMemberInfo(Long memberId);
}
