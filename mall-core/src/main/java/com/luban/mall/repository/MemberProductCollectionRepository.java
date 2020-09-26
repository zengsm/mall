package com.luban.mall.repository;

import com.luban.mall.domain.MemberProductCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 商品收藏Repository
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface MemberProductCollectionRepository extends MongoRepository<MemberProductCollection,String> {
    MemberProductCollection findByMemberIdAndProductId(Long memberId, Long productId);
    int deleteByMemberIdAndProductId(Long memberId,Long productId);
    List<MemberProductCollection> findByMemberId(Long memberId);
}
