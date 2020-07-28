package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <p>
 * 问题信息
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("question_info")
@ApiModel(value="Question对象", description="问题信息")
public class Question extends Model<Question> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "问题id")
    @TableId(value = "questionId", type = IdType.AUTO)
    private Integer questionId;

    @ApiModelProperty(value = "问题")
    private String question;

    @ApiModelProperty(value = "答案")
    private String answer;

    @ApiModelProperty(value = "父级id(0-父亲)")
    @TableField("parentId")
    private Integer parentId;

    @ApiModelProperty(value = "组织id")
    @TableField("orgId")
    private Integer orgId;

    @ApiModelProperty(value = "分类id")
    @TableField("typeId")
    private Integer typeId;

    @ApiModelProperty(value = "状态（1正常0删除）")
    @TableLogic
    private Boolean state;

    @ApiModelProperty(value = "插入时间")
    @TableField("insertTime")
    private LocalDateTime insertTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("updateTime")
    private LocalDateTime updateTime;
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
        return this.questionId;
    }

}
