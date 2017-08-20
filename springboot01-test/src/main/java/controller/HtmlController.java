/**   
 * @Title: HtmlController.java 
 * @Package controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 曾庆华
 * @date 2017年8月18日 下午8:39:01 
 * @version V1.0   
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/** 
 * @ClassName: HtmlController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 曾庆华
 * @date 2017年8月18日 下午8:39:01 
 *  
 */
@Controller
public class HtmlController {
	
	@GetMapping("user")
	public String user(){
		return "html/user.html";
	}
}
