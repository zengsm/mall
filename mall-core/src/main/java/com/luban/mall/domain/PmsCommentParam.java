package com.luban.mall.domain;

import com.luban.mall.model.PmsComment;
import com.luban.mall.model.PmsCommentReplay;
import lombok.Data;
import java.util.List;

/**
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
@Data
public class PmsCommentParam extends PmsComment {
    private List<PmsCommentReplay> pmsCommentReplayList;
}
