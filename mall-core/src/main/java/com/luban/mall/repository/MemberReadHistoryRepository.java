package com.luban.mall.repository;

import com.luban.mall.domain.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 会员商品浏览历史Repository
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
