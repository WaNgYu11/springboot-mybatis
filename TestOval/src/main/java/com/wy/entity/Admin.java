package com.wy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangyu
 * @Date: 2022/09/09/9:51
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {


    @TableField("adminId")
    private Integer adminId;
    @TableField("adminCode")
    private String adminCode;
    @TableField("adminName")
    private String adminName;
    @TableField("adminPwd")
    private String adminPwd;
    @TableField("adminPic")
    private String adminPic;


}
