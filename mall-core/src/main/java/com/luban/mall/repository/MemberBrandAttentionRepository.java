package com.luban.mall.repository;

import com.luban.mall.domain.MemberBrandAttention;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 会员关注Repository
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface MemberBrandAttentionRepository extends MongoRepository<MemberBrandAttention,String> {
    MemberBrandAttention findByMemberIdAndBrandId(Long memberId, Long brandId);
    int deleteByMemberIdAndBrandId(Long memberId,Long brandId);
    List<MemberBrandAttention> findByMemberId(Long memberId);
}
