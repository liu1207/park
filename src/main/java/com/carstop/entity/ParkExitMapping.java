package com.carstop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Map;

@Data
@TableName("Park_ParkExitMapping")
public class ParkExitMapping {

    @TableField(value = "ID")
    private String id;

    @TableField(value = "OutId")
    private String outId;

    @TableField(value = "ParkID")
    private String parkID;
}
