package com.carstop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("Park_Config")
public class ParkConfig {

    @TableField(value = "ID")
    private String id;

    /**
     * 应用名称
     */
    @TableField(value = "AppName")
    private String appName;

    /**
     * 应用密钥
     */
    @TableField(value = "AppKey")
    private String appKey;

    /**
     * 无感停车场密钥
     */
    @TableField(value = "ParkKey")
    private String parkKey;

    /**
     * 无感停车场名称
     */
    @TableField(value = "ParkName")
    private String parkName;

    /**
     * 无感停车场编号
     */
    @TableField(value = "parkNo")
    private String ParkNo;

    /**
     * 无感支付id
     */
    @TableField(value = "ParkBusscd")
    private String parkBusscd;

    /**
     * 支付密钥
     */
    @TableField(value = "PayKey")
    private String payKey;

    /**
     * 支付商户号
     */
    @TableField(value = "PayMacId")
    private String payMacId;

    /**
     * 创建时间
     */
    @TableField(value = "CreateTime")
    private Date createTime;

    /**
     * 是否开启第三方支付威富通、建行
     */
    @TableField(value = "IsOpen")
    private Integer isOpen;

    @TableField(value = "PlatForm")
    private Integer platForm;

    /**
     * 是否开启无感
     */
    @TableField(value = "IsOpenUpark")
    private Integer isOpenUpark;

    /**
     * 超时时间
     */
    @TableField(value = "TimeOut")
    private Integer timeOut;

    /**
     * 公众号密钥
     */
    @TableField(value = "AppSecret")
    private String appSecret;

    /**
     * 公众号ID
     */
    @TableField(value = "AppID")
    private String appID;

    /**
     * MD5Key
     */
    @TableField(value = "Md5Key")
    private String md5Key;

    @TableField(value = "WeChatBannerUrl")
    private String weChatBannerUrl;

    /**
     * 是否固定码
     */
    @TableField(value = "IsFixedCode")
    private Integer isFixedCode;

    /**
     * 是否开通电子发票
     */
    @TableField(value = "IsTicket")
    private Integer isTicket;

    /**
     * 发票税号
     */
    @TableField(value = "DutyNo")
    private String dutyNo;

    /**
     * 建行柜台号
     */
    @TableField(value = "TxtCode")
    private String txtCode;

}
