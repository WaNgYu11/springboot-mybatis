package com.wy.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    @TableField("userId")
    private Integer userId;
    @TableField("adminId")
    private Integer adminId;
    @TableField("userName")
    private String userName;
    @TableField("userAge")
    private Integer userAge;
    @TableField("userEmail")
    private String userEmail;
}
