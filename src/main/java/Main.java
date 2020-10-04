import com.czareg.ActualMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final String BASE_PACKAGE = "com.czareg";

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BASE_PACKAGE)) {
            ActualMain actualMain = applicationContext.getBean(ActualMain.class);
            actualMain.main();
        }
    }
}
