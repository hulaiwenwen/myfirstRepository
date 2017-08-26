package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import cn.itcast.springboot.properties.ItcastProperties;

//@SpringBootApplication默认根据入口类的所在位置扫描包以及入口类所在位置以及子包范围
@SpringBootApplication
@EnableConfigurationProperties(ItcastProperties.class)
public class Application {
	public static void main(String[] args) {
		/*SpringApplication.run(Application.class, args);
			方式一：environment
			方式二：@Value
		*
		*/
		
		/*方式三：@ConfigurationProperties
		 * 使用步骤：
				① 添加一个类，在类名上面使用@ConfigurationProperties；
				② 在引导类上面添加；@EnableConfigurationProperties(value=类名.class)
				③ 使用；在需要的地方使用@Autowired注入该对象即可
		*/
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.setBannerMode(Mode.OFF);
		springApplication.run(args);
	}
}
