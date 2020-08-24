package demo.proxy.cglib;

/***
 *
 * @author : yanzhidong
 * @date : 2020/8/24 
 * @version : V1.0
 *
 */
public class Main {

    public String method(String str) {
        System.out.println(str);
        return "CGLibTest.method():" + str;
    }

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        // 生成CBLibTest的代理对象
        Main proxyImp = (Main) proxy.getProxy(Main.class);
        // 调用代理对象的method()方法
        String result = proxyImp.method("业务方法");
        System.out.println(result);
    }

}
