package com.luban.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.luban.mall.dao.PortalProductCommentDao;
import com.luban.mall.common.api.CommonResult;
import com.luban.mall.mapper.PmsCommentMapper;
import com.luban.mall.mapper.PmsCommentReplayMapper;
import com.luban.mall.model.PmsComment;
import com.luban.mall.model.PmsCommentReplay;
import com.luban.mall.model.UmsMember;
import com.luban.mall.domain.PmsCommentParam;
import com.luban.mall.service.PortalProductCommentService;
import com.luban.mall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
/**
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
@Service
public class PortalProductCommentServiceImpl implements PortalProductCommentService {
    @Autowired
    private PortalProductCommentDao productCommentDao;

    @Autowired
    private UmsMemberService memberService;

    @Autowired
    private PmsCommentMapper pmsMapper;

    @Autowired
    private PmsCommentReplayMapper replayMapper;

    /**
     * 获取评论列表
     * @param productId
     * @return
     */
    @Override
    public CommonResult<List<PmsCommentParam>> getCommentList(Long productId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return CommonResult.success(productCommentDao.getCommentList(productId));
    }

    /**
     * 用户评价
     * @param pmsComment
     * @return
     */
    @Override
    public Integer insertProductComment(PmsComment pmsComment) {
        UmsMember member = memberService.getCurrentMember();
        //判断一下当前用户是否购买过当前评论的商品
        Integer status = productCommentDao.selectUserOrder(member.getId(), pmsComment.getProductId());
        if(status > 0){
            pmsComment.setCreateTime(new Date());
            pmsComment.setShowStatus(0);
            pmsComment.setMemberNickName(member.getNickname());
            pmsComment.setMemberIcon(member.getIcon());
            return pmsMapper.insert(pmsComment);
        }
        return -1;
    }

    /**
     * 用户评价回复
     * @param reply
     * @return
     */
    @Override
    public Integer insertCommentReply(PmsCommentReplay reply) {
        UmsMember member = memberService.getCurrentMember();
        reply.setCreateTime(new Date());
        reply.setMemberNickName(member.getNickname());
        reply.setMemberIcon(member.getIcon());
        reply.setType(0);
        return replayMapper.insert(reply);
    }
}
