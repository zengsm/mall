package com.luban.mall.dao;

import com.luban.mall.model.UmsPermission;
import com.luban.mall.model.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户角色管理自定义Dao
 * @Author: 伯乐
 * @Date: 2019/5/17
 */
public interface UmsRolePermissionRelationDao {
    /**
     * 批量插入角色和权限关系
     */
    int insertList(@Param("list")List<UmsRolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);
}
