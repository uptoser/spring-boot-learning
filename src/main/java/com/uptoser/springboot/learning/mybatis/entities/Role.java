package com.uptoser.springboot.learning.mybatis.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author Terry Roy
 * @since 2025-01-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "t_role" ,autoResultMap = true,resultMap = "roleMap")
@ApiModel(value="Role对象", description="")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;
    @ApiModelProperty(value = "角色名称" ,name = "roleName",example = "管理员")
    private String roleName;

    private String note;

    private Integer roleNo;

    //格式化LocalDateTime 不带最后会出现反序列化问题
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "GMT+8",shape = JsonFormat.Shape.STRING)
    private LocalDateTime createTime;
//    private Date createTime;

    @TableField(exist = false)
    private List<User> users;

}
