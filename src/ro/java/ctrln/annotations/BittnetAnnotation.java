package ro.java.ctrln.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface BittnetAnnotation {

    String location();
    int courses() default 1;
    String category();
}
