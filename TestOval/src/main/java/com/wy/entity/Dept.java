package com.wy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Author: wangyu
 * @Date: 2022/09/09/14:58
 */
@Data
public class Dept {


    @TableId("deptId")
    private Integer deptId;
    @TableField("deptName")
    private String deptName;

}
