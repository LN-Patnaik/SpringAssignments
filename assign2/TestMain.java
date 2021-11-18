package assign2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext
				("spring2.xml");
		 QuestionViaList caseA=(QuestionViaList) context.getBean("question");
		 QuestionViaSet caseB=(QuestionViaSet) context.getBean("question1");
		 QuestionViaMap caseC=(QuestionViaMap) context.getBean("question2");
		 
		 caseA.show();
		 caseB.show();
		 caseC.show();
	}

}