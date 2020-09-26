package com.luban.mall.service.impl;

import com.luban.mall.service.OmsCompanyAddressService;
import com.luban.mall.mapper.OmsCompanyAddressMapper;
import com.luban.mall.model.OmsCompanyAddress;
import com.luban.mall.model.OmsCompanyAddressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created on 2019/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
