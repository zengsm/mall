package com.order.domain;

import com.luban.mall.domain.OmsOrderItem;
import lombok.Data;

import java.util.List;


@Data
public class OrderDetail extends OmsOrder {

    private List<OmsOrderItem> itemList;

}
