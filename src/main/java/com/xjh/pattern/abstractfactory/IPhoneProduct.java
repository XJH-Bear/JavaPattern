package com.xjh.pattern.abstractfactory;

/**
 * <B>文件名称：</B>IPhoneProduct<BR>
 * <B>文件描述：</B>手机产品接口<BR>
 * <B>创建时间：</B>2024/5/28 10:10<BR>
 *
 * @author xjh
 */
public interface IPhoneProduct {

    /**
     * 开机
     */
    void start();

    /**
     * 关机
     */
    void shutdown();

    /**
     * 打电话
     */
    void callup();

    /**
     * 发短信
     */
    void sendSms();
}
