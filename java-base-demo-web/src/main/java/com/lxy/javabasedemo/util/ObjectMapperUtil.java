package com.lxy.javabasedemo.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lxy.javabasedemo.base.BaseRuntimeException;

public class ObjectMapperUtil {
    protected static ObjectMapper mapper = new ObjectMapper();
    static {
        mapper.configure(MapperFeature.USE_ANNOTATIONS, false); // 不读取注解
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    /**
     * 把json字符串反序列化为指定T类型的java类
     *
     * @param content
     * @param valueType
     * @param <T>
     * @return
     */
    public static <T> T readValue(String content, Class<T> valueType) {
        try {
            return mapper.readValue(content, valueType);
        } catch (Exception e) {
            throw new BaseRuntimeException("转换为json出错,内容如下：" + content);
        }
    }

    /**
     * 把json字符串反序列化为指定TypeReference类型，支持List、嵌套javabean等复杂类型
     *
     * @param content
     * @param typeReference
     * @param <T>
     * @return
     */
    public static <T> T readValue(String content, TypeReference<T> typeReference) {
        try {
            return mapper.readValue(content, typeReference);
        } catch (Exception e) {
            throw new BaseRuntimeException("转换为json出错,内容如下：" + content);
        }
    }

    /**
     * 把java对象序列化成json字符串
     *
     * @param value
     * @return
     */
    public static String writeValueAsString(Object value) {
        try {
            return mapper.writeValueAsString(value);
        } catch (Exception e) {
            throw new BaseRuntimeException("转换为字符串出错");
        }
    }
}
