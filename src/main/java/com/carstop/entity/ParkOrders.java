package com.carstop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("Park_Orders")
public class ParkOrders {

    @TableField(value = "ID")
    private String id;

    @TableField(value = "OrderNo")
    private String orderNo;

    @TableField(value = "CarNo")
    private String carNo;

    @TableField(value = "ParkKey")
    private String parkKey;

    @TableField(value = "PayState")
    private Integer payState;

    @TableField(value = "PayTime")
    private Date payTime;

    @TableField(value = "CreateTime")
    private Date createTime;

    @TableField(value = "ExitId")
    private String exitId;

    @TableField(value = "ConnId")
    private String connId;

    @TableField(value = "Amount")
    private BigDecimal amount;

    @TableField(value = "PayUserOpenId")
    private String payUserOpenId;
}
