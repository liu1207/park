package com.carstop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("Park_CarRecords")
public class ParkCarRecords {

    @TableField(value = "ID")
    private String id;

    @TableField(value = "CarNo")
    private String carNo;

    @TableField(value = "InTime")
    private Date inTime;

    @TableField(value = "OutTime")
    private Date outTime;

    @TableField(value = "ParkKey")
    private String parkKey;

    @TableField(value = "ExitId")
    private String exitId;
}
