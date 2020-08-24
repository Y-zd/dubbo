package demo.spi.jdk.impl;


import demo.spi.jdk.JdkSpi;

/***
 *
 * @author : yanzhidong
 * @date : 2020/8/11 
 * @version : V1.0
 *
 */
public class JdkSpiImpl1 implements JdkSpi {
    @Override
    public void run() {
        System.out.println(this.getClass().getName());
    }
}
