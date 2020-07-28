package com.example.demo.entity;

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

/**
 * <p>
 * 客服信息
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AgentInfo对象", description="客服信息")
public class AgentInfo extends Model<AgentInfo> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "客服id")
    @TableId(value = "agentId", type = IdType.AUTO)
    private Integer agentId;

    @ApiModelProperty(value = "客服名称")
    @TableField("agentName")
    private String agentName;

    @ApiModelProperty(value = "openfire账号")
    private String username;

    @ApiModelProperty(value = "手机")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "组织id")
    @TableField("orgId")
    private Integer orgId;

    @ApiModelProperty(value = "0-未知 1-男 2-女")
    private Integer sex;

    @ApiModelProperty(value = "工号")
    @TableField("agentNo")
    private String agentNo;

    @ApiModelProperty(value = "添加时间")
    @TableField("insertTime")
    private LocalDateTime insertTime;

    @ApiModelProperty(value = "0-删除 1-正常 2-禁用")
    private Integer state;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "角色Id")
    @TableField("roleId")
    private Integer roleId;

    @ApiModelProperty(value = "真实姓名")
    @TableField("agentRealName")
    private String agentRealName;


    @Override
    protected Serializable pkVal() {
        return this.agentId;
    }

}
