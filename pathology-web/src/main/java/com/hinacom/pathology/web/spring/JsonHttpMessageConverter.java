package com.hinacom.pathology.web.spring;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;

/**
 * Created by fyu1 on 16/11/27.
 */
public class JsonHttpMessageConverter extends FastJsonHttpMessageConverter4 {
    @Override
    public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        Object object = super.read(type,contextClass,inputMessage);
        return object;
    }
}
