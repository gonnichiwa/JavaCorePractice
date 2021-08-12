package kr.ac.dgd;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// annotation의 선언 : @interface
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME) // 이 어노테이션이 class파일로 변환하는 시점이 언제인지?
public @interface InsertIntData {
    int data() default 111;
}
