package com.william.devx.jdbc.entity;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CodeColumn {

    // 默认为字段名（驼峰转下划线）
    String columnName() default "";

    boolean uuid() default true;

}
