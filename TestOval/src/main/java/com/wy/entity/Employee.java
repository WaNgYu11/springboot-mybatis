package com.wy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: wangyu
 * @Date: 2022/09/09/14:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @TableId("empId")
    private Integer empId;
    @TableField("deptId")
    private Integer deptId;
    @TableField("empName")
    private String empName;
    @TableField("empGender")
    private String empGender;
    @TableField("empPhone")
    private String empPhone;
    @TableField("empEmail")
    private String empEmail;
    @TableField("empBirthday")
    private Date empBirthday;
    @TableField("empAddr")
    private String empAddr;
    @TableField("empEntryDate")
    private Date empEntryDate;
    @TableField("empPic")
    private String empPic;


}
