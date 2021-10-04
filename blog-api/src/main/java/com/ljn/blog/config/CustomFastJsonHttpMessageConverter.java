package com.ljn.blog.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CustomFastJsonHttpMessageConverter {
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();

        List<SerializerFeature> list = new ArrayList<>();
        list.add(SerializerFeature.PrettyFormat);
        list.add(SerializerFeature.WriteMapNullValue);
        list.add(SerializerFeature.WriteNullStringAsEmpty);
        list.add(SerializerFeature.WriteNullListAsEmpty);
        list.add(SerializerFeature.QuoteFieldNames);
        list.add(SerializerFeature.WriteDateUseDateFormat);
        list.add(SerializerFeature.DisableCircularReferenceDetect);
        list.add(SerializerFeature.WriteBigDecimalAsPlain);

        fastJsonConfig.setSerializerFeatures(list.toArray(new SerializerFeature[list.size()]));

        fastConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter = fastConverter;
        fastJsonConfig.setSerializeFilters(new ValueFilter() {
            @Override
            public Object process(Object object, String name, Object value) {
                /*if ((StringUtils.endsWith(name, "Id") || StringUtils.equals(name,"id")) && value != null
                        && value.getClass() == Long.class) {*/
                if (value != null && value.getClass() == Long.class ) {
                    Long v = (Long) value;
                    if (v.toString().length() > 15) {
                        return String.valueOf(value);
                    }
                }
                return value;
            }
        });
        return new HttpMessageConverters(converter);
    }
}