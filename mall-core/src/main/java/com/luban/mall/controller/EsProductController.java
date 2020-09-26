package com.luban.mall.controller;

import com.luban.mall.common.api.CommonPage;
import com.luban.mall.common.api.CommonResult;
import com.luban.mall.domain.EsProduct;
import com.luban.mall.common.api.CommonPage;
import com.luban.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * 搜索商品管理Controller
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
@Controller
@Api(tags = "EsProductController", description = "搜索商品管理")
@RequestMapping("/esProduct")
public class EsProductController {

    @Autowired
    private RestTemplate restTemplate;

    @ApiOperation(value = "简单搜索")
    @RequestMapping(value = "/search/simple", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<EsProduct>> search(@RequestParam(required = false) String keyword,
                                                      @RequestParam(required = false, defaultValue = "0") String pageNum,
                                                      @RequestParam(required = false, defaultValue = "10") String pageSize) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        map.add("keyword", keyword);
        map.add("pageNum", pageNum);
        map.add("pageSize", pageSize);
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
        try {
            ResponseEntity<CommonResult> result = restTemplate.postForEntity("http://localhost:8085/esProduct/search/simple",request,CommonResult.class);
            return result.getBody();
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return CommonResult.failed();
    }

}
