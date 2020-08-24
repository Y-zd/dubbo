package demo.spi.jdk;


import java.util.Iterator;
import java.util.ServiceLoader;

/***
 *
 * @author : yanzhidong
 * @date : 2020/8/11 
 * @version : V1.0
 *
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<JdkSpi> serviceLoader =
                ServiceLoader.load(JdkSpi.class);
        Iterator<JdkSpi> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            JdkSpi next = iterator.next();
            next.run();
        }
    }
}
