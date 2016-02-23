package kr.co.spectra.moneyapp;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
 * @SpringBootApplication 는 아래 3개 annotation 을 포함하고 있다.
 * @Configuration application context 용 bean 정의의 소스
 * @ComponentScan 이 패키지에서 다른 components, configurations, service를 찾아라
 * @EnableAutoConfiguration classpath 셋팅에 기반해서 bean 을 추가해라
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		/*
		System.out.println("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		*/
	}
}
