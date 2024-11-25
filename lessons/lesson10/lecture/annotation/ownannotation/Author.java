package lesson10.lecture.annotation.ownannotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/*By default, annotations are not included in javadoc. 
 * But if @Documented is used, it then will be processed by javadoc*/
@Documented 

// means that the annotation can be accessed via reflection at runtime.
@Retention(RetentionPolicy.RUNTIME) 

public @interface Author {
    String firstName();
    String lastName();
    boolean internalEmployee();
}