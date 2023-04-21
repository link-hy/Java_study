package jnuit_1;


import org.junit.jupiter.api.*;

/**
 * 测试类
 */
public class testJ1 {
    @BeforeEach
    public void b1(){
        System.out.println("用来静态修饰方法，该方法会在所有测试方法之前只执行一次。");
    }
    @AfterEach
    public void A1(){
        System.out.println("用来静态修饰方法，该方法会在所有测试方法之后只执行一次。");
    }

    @Test
    public void test(){
        j1 j=new j1();
        String rs=j.log("admin","123456");
        //好像没有Assert
        Assertions.assertEquals("正常",rs);
    }

    @Test
    public void test2(){
        j1 j=new j1();
        j.selN();
    }
}
