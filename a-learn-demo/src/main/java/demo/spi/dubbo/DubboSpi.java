package demo.spi.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/***
 *
 * @author : yanzhidong
 * @date : 2020/8/12 
 * @version : V1.0
 *
 */
@SPI("1")
public interface DubboSpi {

    void run();

    @Adaptive("dubbo-spi-adaptive")
    String adaptiveFun(URL url);

}
