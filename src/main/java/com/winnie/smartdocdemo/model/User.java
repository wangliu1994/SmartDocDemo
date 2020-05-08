package com.winnie.smartdocdemo.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author : winnie [wangliu023@qq.com]
 * @date : 2020/5/8
 * @desc
 */
@Data
public class User {

    /**
     * 姓名
     */
    @NotEmpty
    private String name;

    /**
     * 别名
     */
    @NotNull
    private String subName;

    /**
     * 编号
     */
    @NotBlank(message = "编号不能为空")
    private String id;

    /**
     * 年龄
     */
    private int age;

    /**
     * 年龄
     */
    private Integer ageI;

    /**
     * 统计
     */
    private Double count;
}
