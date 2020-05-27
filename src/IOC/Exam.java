package IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student john = context.getBean("student", Student.class);
		john.displayInfo();
		Chicken chicken = context.getBean("chicken", Chicken.class);
		chicken.displayInfo();
		john.cheating();
	}
}
