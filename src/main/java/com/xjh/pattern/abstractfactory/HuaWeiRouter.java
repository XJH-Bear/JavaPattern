package com.xjh.pattern.abstractfactory;

/**
 * <B>文件名称：</B>HuaWeiRouter<BR>
 * <B>文件描述：</B>华为路由器实现类<BR>
 * <B>创建时间：</B>2024/5/28 10:17<BR>
 *
 * @author xjh
 */
public class HuaWeiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器打开wifi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器配置");
    }
}
