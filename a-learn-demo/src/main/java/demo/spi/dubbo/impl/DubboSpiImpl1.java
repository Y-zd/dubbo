package demo.spi.dubbo.impl;

import demo.spi.dubbo.DubboSpi;
import org.apache.dubbo.common.URL;

/***
 *
 * @author : yanzhidong
 * @date : 2020/8/12 
 * @version : V1.0
 *
 */
public class DubboSpiImpl1 implements DubboSpi {
    @Override
    public void run() {
        System.out.println(this.getClass().getName());
    }

    @Override
    public String adaptiveFun(URL url) {
        return "1";
    }
}
