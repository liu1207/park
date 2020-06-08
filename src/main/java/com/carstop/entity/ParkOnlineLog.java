package com.carstop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("Park_OnlineLog")
public class ParkOnlineLog {

    @TableField(value = "ConnectionId")
    private String connectionId;

    @TableField(value = "ExitId")
    private String exitId;

    @TableField(value = "ParkNo")
    private String parkNo;

    @TableField(value = "JoinTime")
    private Date joinTime;

    @TableField(value = "ID")
    private Integer id;

}
