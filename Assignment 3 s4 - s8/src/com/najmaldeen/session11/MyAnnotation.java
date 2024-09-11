package com.najmaldeen.session11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Specify the retention
//policy of the annotation
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    // An element with a String parameter and a default value
    String value() default "Hello";
    // An element with an int parameter and no default value
    int number();
}

