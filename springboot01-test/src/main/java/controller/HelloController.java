/**   
 * @Title: HelloController.java 
 * @Package controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 曾庆华
 * @date 2017年8月18日 下午7:25:16 
 * @version V1.0   
 */
package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @ClassName: HelloController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 曾庆华
 * @date 2017年8月18日 下午7:25:16 
 *  
 */
@RestController
public class HelloController {
	
	@Autowired
	private Environment environment;
	
	@Value("${name}")
	private String name;
	
	@Value("${url}")
	private String url;

	@GetMapping("/hello")
	public String hello(){
		return "Hello SpringBoot";
	}
	@GetMapping("/environment")
	public String environment() throws IOException{
		byte[] bytes = environment.getProperty("name").getBytes("ISO-8859-1");
		System.out.println( new String(bytes, "UTF-8"));
		System.out.println(environment.getProperty("url"));
		return name+url;
	}
	
	
}
