import com.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerApp {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext(new String[]{"dubbo.xml"});
        HelloService helloService = (HelloService)context.getBean("helloServiceImpl");
        while(true){
            System.out.println(helloService.sayHello("world"));
//            Thread.sleep(2 * 1000);
        }
        //System.in.read();
    }
}
