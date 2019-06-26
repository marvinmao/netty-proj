package cn.enjoyedu.ch01.nio;

import static cn.enjoyedu.ch01.Ch01Const.DEFAULT_PORT;

/**
 * @author marvinmao
 * 类说明：nio通信服务端
 */
public class NioServer {

    private static NioServerHandle nioServerHandle;

    public static void start(){
        if(nioServerHandle !=null)
            nioServerHandle.stop();
        nioServerHandle = new NioServerHandle(DEFAULT_PORT);
        new Thread(nioServerHandle,"Server").start();
    }
    public static void main(String[] args){
        start();
    }

}
