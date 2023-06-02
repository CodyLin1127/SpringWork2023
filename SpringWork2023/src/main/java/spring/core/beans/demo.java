package spring.core.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class demo {
	@Bean(name="hello")
	public Hello getHello() {
		Hello hello = new Hello();
		return hello;
	}
}
