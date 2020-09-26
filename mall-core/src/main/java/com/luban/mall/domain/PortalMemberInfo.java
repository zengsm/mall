package com.luban.mall.domain;

import com.luban.mall.model.UmsMember;
import com.luban.mall.model.UmsMemberLevel;
import lombok.Data;

/**
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
@Data
public class PortalMemberInfo extends UmsMember {
    private UmsMemberLevel umsMemberLevel;
}
