import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hello1 = (HelloWorld) context.getBean("helloworld");
        HelloWorld hello2 = (HelloWorld) context.getBean("helloworld");

        Cat cat1 = (Cat) context.getBean("cat");
        Cat cat2 = (Cat) context.getBean("cat");

        System.out.println("HelloWorld сравнение: " + (hello1 == hello2)); // true
        System.out.println("Cat сравнение: " + (cat1 == cat2)); // false
    }
}