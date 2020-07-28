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
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <p>
 * 分组信息
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("group_info")
@ApiModel(value="Group对象", description="分组信息")
public class Group extends Model<Group> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分组id")
    @TableId(value = "groupId", type = IdType.AUTO)
    private Integer groupId;

    @ApiModelProperty(value = "分组名称")
    @TableField("groupName")
    private String groupName;

    @ApiModelProperty(value = "组织id")
    @TableField("orgId")
    private Integer orgId;

    @ApiModelProperty(value = "插入时间")
    @TableField("insertTime")
    private LocalDateTime insertTime;

    @ApiModelProperty(value = "0-删除 1-正常")
    private Integer state;
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
        return this.groupId;
    }

}
