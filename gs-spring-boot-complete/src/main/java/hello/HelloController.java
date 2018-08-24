package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	 @Value("${spring.application.name}")
	   private String name;
    
    @RequestMapping("/")
    public String index() {
        return name;
    }
    
}
