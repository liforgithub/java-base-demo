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
public class PageResponse<T> extends ListResponse<T>{

    @ApiModelProperty("当前页码，第一页为0")
    private int pageNum;

    @ApiModelProperty("每页条数")
    private int pageSize;

    @ApiModelProperty("总条数")
    private long totalCount;

    public PageResponse(int pageNum, int pageSize, long totalCount, List<T> dataList){
        super(dataList);
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
    }
}
