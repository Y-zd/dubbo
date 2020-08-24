package demo.proxy.jdk;

/***
 *
 * @author : yanzhidong
 * @date : 2020/8/24 
 * @version : V1.0
 *
 */
public class RealSubject implements Subject {
    @Override
    public void operation() {
        System.out.println("业务方法");
    }
}
