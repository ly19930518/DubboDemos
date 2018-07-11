import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderApp {
    public static void main(String[] args) throws IOException {
        //读取配置文件
        new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        System.out.println("provider服务已注册");
        //使线程阻塞
        System.in.read();

    }
}
