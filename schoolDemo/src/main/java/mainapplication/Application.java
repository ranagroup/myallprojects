package mainapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import student.Studentinfo;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ap= new ClassPathXmlApplicationContext("student-context.xml");
		Studentinfo su= (Studentinfo) ap.getBean("s1");
		System.out.println(su.toString());

	}

}
