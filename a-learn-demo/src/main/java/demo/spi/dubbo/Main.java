package demo.spi.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/***
 *
 * @author : yanzhidong
 * @date : 2020/8/12 
 * @version : V1.0
 *
 */
public class Main {
    public static void main(String[] args) {
        DubboSpi dubboSpi = ExtensionLoader.getExtensionLoader(DubboSpi.class)
                .getExtension("1");
        dubboSpi.run();


        ExtensionLoader<DubboSpi> loader = ExtensionLoader.getExtensionLoader(DubboSpi.class);
        DubboSpi adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test");
        System.out.println(adaptiveExtension.adaptiveFun(url));

        URL url2 = URL.valueOf("test://localhost/test?dubbo-spi-adaptive=3");
        System.out.println(adaptiveExtension.adaptiveFun(url2));
    }


}
