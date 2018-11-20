package com.lxy.javabasedemo.base;

import com.lxy.javabasedemo.util.ParamChecker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created with of666.
 * User: of666
 * Date: 2015/10/31 0031
 * Time: 10:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SortInfo implements Serializable {
    public String field;

    public String sort;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SortInfo{");
        sb.append("field='").append(field).append('\'');
        sb.append(", sort='").append(sort).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void checkParam() {
        ParamChecker.notBlank(field, "field 不能为空");
        ParamChecker.notBlank(sort, "sort 不能为空");


        if (!sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("排序只能是asc或desc");
        }
    }
}
