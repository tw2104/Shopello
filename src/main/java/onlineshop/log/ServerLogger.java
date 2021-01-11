package onlineshop.log;

import org.springframework.stereotype.Component;

//this annotation tell spring, that this class need to be instantiated as a bean and saved in the container
@Component(value = "serverLogger") 
public class ServerLogger implements Logger {
    public void log(String info) {
        System.out.println("server log = " + info);
    }
}
