package demo.proxy.jdk;


/***
 *
 * @author : yanzhidong
 * @date : 2020/8/24 
 * @version : V1.0
 *
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        DemoInvokerHandler invokerHandler = new DemoInvokerHandler(subject);
        // 获取代理对象
        Subject proxy = (Subject) invokerHandler.getProxy();
        // 调用代理对象的方法，它会调用DemoInvokerHandler.invoke()方法
        proxy.operation();
    }
}
