package com.lxy.javabasedemo.base;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by sunyu on 2017/2/23.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListResponse<T> {

    @ApiModelProperty("数据列表")
    private List<T> dataList;

}
