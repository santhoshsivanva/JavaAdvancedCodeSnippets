package Serialization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//marker annotations
@interface Mymarker{}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
//single valued annotations

public @interface author {
    //default annotation is also possible
    String name() default "";
}

