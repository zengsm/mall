package com.luban.mall.domain;

import lombok.Data;

import java.util.List;


@Data
public class OrderDetail extends OmsOrder {

    private List<OmsOrderItem> itemList;

}
