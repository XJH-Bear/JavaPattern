package com.xjh.pattern.abstractfactory;

/**
 * <B>文件名称：</B>AbstractFactoryTest<BR>
 * <B>文件描述：</B>测试类<BR>
 * <B>创建时间：</B>2024/5/28 10:29<BR>
 *
 * @author xjh
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        IProductFactory hwFactory = new HuaWeiFactory();
        IPhoneProduct hwPhone = hwFactory.phoneProduce();
        hwPhone.start(); // 华为手机开机
        hwPhone.callup();  // 华为手机拨打电话

        IRouterProduct hwRouter = hwFactory.routerProduce();
        hwRouter.start(); // 华为路由器开机
        hwRouter.openWifi(); // 华为路由器打开wifi
        hwRouter.setting(); // 华为路由器配置

        IProductFactory xmFactory = new XiaoMiFactory();
        IPhoneProduct xmPhone = xmFactory.phoneProduce();
        xmPhone.start(); // 小米手机开机
        xmPhone.sendSms(); // 小米手机发送短信

        IRouterProduct xmRouter = xmFactory.routerProduce();
        xmRouter.start(); // 小米路由器开机
        xmRouter.openWifi(); // 小米路由器打开wifi
        xmRouter.setting(); // 小米路由器配置
    }
}
