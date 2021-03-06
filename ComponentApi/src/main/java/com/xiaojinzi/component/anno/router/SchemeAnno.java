package com.xiaojinzi.component.anno.router;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 表示路由的 Scheme
 *
 * @see PathAnno
 * @see HostAndPathAnno
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface SchemeAnno {

    /**
     * 表示路由的 host
     *
     * @return
     */
    String value();

}
