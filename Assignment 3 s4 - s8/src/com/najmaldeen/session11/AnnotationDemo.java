package com.najmaldeen.session11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationDemo {
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }
    @Override
    public String toString() {
        return "This is an annotation demo";
    }
}
@interface Benchmark {
    int value() default 1;
}
// A class that uses the custom annotation
//class MyClass {
//    // A method that is annotated as a benchmark
//    @Benchmark(10)
//    public void myMethod() {
//        // Some logic
//    }
//}

