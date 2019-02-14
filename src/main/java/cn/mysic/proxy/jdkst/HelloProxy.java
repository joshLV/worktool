package cn.mysic.proxy.jdkst;

/**
 * Function: HelloProxy <br>
 *
 * @author: siqishangshu <br>
 * @date: 2019-02-14 11:20:00
 */
public class HelloProxy implements HelloInterface{
    private HelloInterface helloInterface = new Hello();
    @Override
    public void sayHello() {
        System.out.println("Before invoke ");
        helloInterface.sayHello();
        System.out.println("After invoke ");
    }
}
