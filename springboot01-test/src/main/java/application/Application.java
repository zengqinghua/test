/**   
 * @Title: Application.java 
 * @Package application 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 曾庆华
 * @date 2017年8月18日 下午7:09:43 
 * @version V1.0   
 */
package application;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: Application
 * @Description: @SpringBootApplication代表为SpringBoot应用的运行主类
 * @author 曾庆华
 * @date 2017年8月18日 下午7:10:57
 */
@SpringBootApplication(scanBasePackages={"controller"})
public class Application {
	public static void main(String[] args) {
		/** 运行SpringBoot应用 */
		// SpringApplication.run(Application.class, args);
		
		/**
		 * 去掉spring标志
		 */
		/** 创建SpringApplication应用对象 */
		SpringApplication springApplication = new SpringApplication(Application.class);
		/** 设置横幅模式(设置关闭) */
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}
}
