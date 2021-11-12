package com.wh.lawliet.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 什么？我是真滴帅
 *
 * @author WuHao on 10:26 2021/11/11
 */
@Data
@Table(name = "common_admin")
public class Admin {
    /**
     * id
     */
    @Id
    @JSONField(serializeUsing = ToStringSerializer.class)
    @ApiModelProperty(value = "主键id")
    private Long id;

    /**
     * 账号
     */
//    @JSONField(name = "admin_account")
    @ApiModelProperty(value = "账号")
    private String adminAccount;

    /**
     * 名称
     */
    @ApiModelProperty(value = "管理员名称")
    private String adminName;

    /**
     * 密码
     */
    @ApiModelProperty(value = "管理员密码")
    private String adminPassword;

    /**
     * 创建时间
     */
//    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private Data createTime;
}
