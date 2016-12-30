package annotation.time;

import java.lang.reflect.Field;
import java.lang.annotation.Annotation;

public class Main {
    public static void test(Class<?> test) throws NoSuchFieldException {
        /** 필드 불러 온다 */
        Field field = test.getDeclaredField("ggikko");

        if (field != null) {
            /** 어노테이션 불러 온다 */
            Annotation annotation = field.getAnnotation(TimeLog.class);

            if(annotation != null) {
                /** 어노테이션이 Null 이 아니면 Time을 찍는다 */
                System.out.printf("Time : " + String.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public static void main(String[] args) throws NoSuchFieldException {
        TestClass cls = new TestClass();
        cls.time = "Test";
    }
}
