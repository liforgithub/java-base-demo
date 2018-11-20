package com.lxy.javabasedemo.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by caowei on 2017/8/19.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEntity<T> implements Serializable {

    /**
     * 状态: ok 成功, fail 失败
     */
    @ApiModelProperty("状态: ok 成功, fail 失败")
    private String result;
    /**
     * 状态码: 200 成功, 201 失败, 202 需要登陆
     */
    @ApiModelProperty("状态码: 200 成功, 201 失败, 202 需要登陆")
    private Integer  rescode;
    /**
     * 备注原因
     */
    @ApiModelProperty("备注原因")
    private String msg;
    /**
     * 返回对象
     */
    @ApiModelProperty("返回数据对象")
    private T data;

}
