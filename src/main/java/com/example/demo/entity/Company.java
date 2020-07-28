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

/**
 * <p>
 * 公司
 * </p>
 *
 * @author Jiesz
 * @since 2020-07-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("company_info")
@ApiModel(value="Company对象", description="公司")
public class Company extends Model<Company> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "公司id")
    @TableId(value = "companyId", type = IdType.AUTO)
    private Integer companyId;

    @ApiModelProperty(value = "公司名称")
    @TableField("companyName")
    private String companyName;

    @ApiModelProperty(value = "省份id")
    @TableField("provinceId")
    private String provinceId;

    @ApiModelProperty(value = "省份名称")
    @TableField("provinceName")
    private String provinceName;

    @ApiModelProperty(value = "城市id")
    @TableField("cityId")
    private String cityId;

    @ApiModelProperty(value = "城市名称")
    @TableField("cityName")
    private String cityName;

    @ApiModelProperty(value = "区县id")
    @TableField("areaId")
    private String areaId;

    @ApiModelProperty(value = "区县名称")
    @TableField("areaName")
    private String areaName;

    @ApiModelProperty(value = "组织id")
    @TableField("orgId")
    private Integer orgId;

    @TableField("insertTime")
    private LocalDateTime insertTime;

    @ApiModelProperty(value = "0-删除 1-正常")
    private Integer state;

    @ApiModelProperty(value = "更新时间")
    @TableField("updateTime")
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.companyId;
    }

}
