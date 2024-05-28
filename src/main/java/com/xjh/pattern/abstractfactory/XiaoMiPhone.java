package com.xjh.pattern.abstractfactory;

/**
 * <B>文件名称：</B>XiaoMiPhone<BR>
 * <B>文件描述：</B>小米手机实现类<BR>
 * <B>创建时间：</B>2024/5/28 10:15<BR>
 *
 * @author xjh
 */
public class XiaoMiPhone implements IPhoneProduct{
    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机关机");
    }

    @Override
    public void callup() {
        System.out.println("小米手机拨打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("小米手机发送短信");
    }
}
