package com.luban.mall.service.impl;

import com.luban.mall.service.CmsPrefrenceAreaService;
import com.luban.mall.mapper.CmsPrefrenceAreaMapper;
import com.luban.mall.model.CmsPrefrenceArea;
import com.luban.mall.model.CmsPrefrenceAreaExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created on 2019/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
