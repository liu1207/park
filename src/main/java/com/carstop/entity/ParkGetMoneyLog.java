package com.carstop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("Park_GetMoneyLog")
public class ParkGetMoneyLog {

    @TableField(value = "ID")
    private String id;

    /**
     * 链接号
     */
    @TableField(value = "ConnectionId")
    private String connectionId;

    /**
     * 车场编号
     */
    @TableField(value = "ParkNo")
    private String parkNo;

    /**
     * 车牌号码
     */
    @TableField(value = "CarNum")
    private String carNum;

    /**
     * 金额
     */
    @TableField(value = "Amount")
    private BigDecimal amount;

    /**
     * 出口ID
     */
    @TableField(value = "ExitId")
    private String exitId;

    /**
     * 创建时间
     */
    @TableField(value = "CreateTime")
    private Date createTime;

    /**
     * 进场时间
     */
    @TableField(value = "InTime")
    private String inTime;

    /**
     * 停车时间
     */
    @TableField(value = "StopTime")
    private String stopTime;

    /**
     * 是否在场
     */
    @TableField(value = "IsInCarStop")
    private Integer isInCarStop;

}
