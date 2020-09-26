package com.luban.mall.service.impl;

import com.luban.mall.dao.PortalMemberInfoDao;
import com.luban.mall.domain.PortalMemberInfo;
import com.luban.mall.service.UmsMemberCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
@Service
public class UmsMemberCenterServiceImpl implements UmsMemberCenterService {

    @Autowired
    private PortalMemberInfoDao portalMemberInfoDao;

    /**
     * 查询会员信息
     * @param memberId
     * @return
     */
    @Override
    public PortalMemberInfo getMemberInfo(Long memberId) {
        return portalMemberInfoDao.getMemberInfo(memberId);
    }
}
