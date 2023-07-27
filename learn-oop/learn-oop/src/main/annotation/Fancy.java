package main.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// "value = " not required
// value = {ElementType.TYPE}
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)

public @interface Fancy {

    // default value make attribute not required input
    String name();
    String[] tags() default {};
}
