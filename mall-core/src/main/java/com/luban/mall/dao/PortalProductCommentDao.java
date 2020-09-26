package com.luban.mall.dao;

import com.luban.mall.domain.PmsCommentParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface PortalProductCommentDao {

    List<PmsCommentParam> getCommentList(Long productId);

    Integer selectUserOrder(@Param("userId") Long userId, @Param("productId") Long productId);
}
