import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.beans.Hello;
import spring.core.beans.demo;

public class testDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(demo.class);
		Hello hello = ctx.getBean("hello",Hello.class);
		System.out.println(hello);
	}
}
