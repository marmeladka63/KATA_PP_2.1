import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat binCat = (Cat) applicationContext.getBean("cat");
        Cat binCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println("Переменные ссылаются на один и тот же объект " +(bean==bean1));
        System.out.println("Переменные ссылаются на один и тот же объект " +(binCat==binCat1));


    }
}