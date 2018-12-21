import org.springframework.context.annotation.ComponentScan;

@ComponentScan (value = "src/main/java")
public class Main {
    public static void main(String[] args) {
        Class<A> a = (Class<A>) A.class.getComponentType();

    }
}
