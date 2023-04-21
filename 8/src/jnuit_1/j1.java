package jnuit_1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

/**
 * 业务方法
 */
public class j1 {
    public String log(String logName,String passwd){
        if("admin".equals(logName))
            return "正常";
        else
            return "错误";
    }
    public void selN(){
        System.out.println(10/0);
    }
}
