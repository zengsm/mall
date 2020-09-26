package com.luban.mall.service;

import com.luban.mall.common.api.CommonResult;
import com.luban.mall.model.PmsComment;
import com.luban.mall.model.PmsCommentReplay;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface PortalProductCommentService {
    /**
     * 获取评论列表
     * @param productId
     * @param pageNum
     * @param pageSize
     * @return
     */
    CommonResult getCommentList(Long productId,Integer pageNum,Integer pageSize);

    /**
     * 用户评价
     * @param pmsComment
     * @return
     */
    @Transactional
    Integer insertProductComment(PmsComment pmsComment);

    /**
     * 用户评价回复
     * @param replay
     * @return
     */
    @Transactional
    Integer insertCommentReply(PmsCommentReplay replay);

}
