package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <p>
 * 会话信息
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("session")
@ApiModel(value="Session对象", description="会话信息")
public class Session extends Model<Session> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "客户会话id")
    @TableId(value = "sessionId", type = IdType.UUID)
    private String sessionId;

    @ApiModelProperty(value = "访客id")
    @TableField("visitorId")
    private String visitorId;

    @ApiModelProperty(value = "开始时间")
    @TableField("startTime")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "结束时间")
    @TableField("endTime")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "当前接待的客服id")
    @TableField("agentId")
    private Integer agentId;

    @ApiModelProperty(value = "持续时间")
    private Long duration;

    @ApiModelProperty(value = "组织id")
    @TableField("orgId")
    private Integer orgId;

    @ApiModelProperty(value = "1-机器人会话 2-人工会话")
    private Integer type;

    @ApiModelProperty(value = "2-客户 3-客服")
    @TableField("createType")
    private Integer createType;

    @ApiModelProperty(value = "1-会话超时 2-客服移除客户 4-访客关闭聊天页面 5-强制关闭")
    @TableField("closeType")
    private Integer closeType;

    @ApiModelProperty(value = "0-关闭 1-正常")
    private Integer state;

    @ApiModelProperty(value = "排队时间")
    @TableField("queueTime")
    private LocalDateTime queueTime;

    @ApiModelProperty(value = "排队耗时(毫秒)")
    @TableField("timeInQueue")
    private Integer timeInQueue;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "客服接起时间")
    @TableField("pickUpTime")
    private LocalDateTime pickUpTime;

    @ApiModelProperty(value = "上一个接待的客服id")
    @TableField("lastAgentId")
    private Integer lastAgentId;

    @ApiModelProperty(value = "渠道")
    private String channel;

    @ApiModelProperty(value = "1-有效会话 0-无效会话")
    @TableField("isValid")
    private Integer isValid;
/**
*  非数据库字段
*/
    @JsonIgnore
    @TableField(exist = false)
    private Integer Limit;
    @JsonIgnore
    @TableField(exist = false)
    private Integer offset;



    @Override
    protected Serializable pkVal() {
        return this.sessionId;
    }

}
