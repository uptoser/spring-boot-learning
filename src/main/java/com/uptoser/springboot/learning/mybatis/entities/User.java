package com.uptoser.springboot.learning.mybatis.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.uptoser.springboot.learning.mybatis.enumeration.GenderEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @author Terry Roy
 * @since 2025-01-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "t_user",autoResultMap = true,resultMap = "userMap")
@ApiModel(value="User对象", description="")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;
    @ApiModelProperty(value = "用户名称" ,example = "小红")
    private String userName;

    private String realName;
    @ApiModelProperty(value = "性别" ,example = "1")
    private GenderEnum sex;

    private String mobile;

    private String email;

    private String note;

    @TableField(exist = false)
    private List<Role> roles;

}
