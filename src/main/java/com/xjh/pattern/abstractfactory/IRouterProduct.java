package com.xjh.pattern.abstractfactory;

/**
 * <B>文件名称：</B>IRouterProduct<BR>
 * <B>文件描述：</B>路由器产品接口<BR>
 * <B>创建时间：</B>2024/5/28 10:12<BR>
 *
 * @author xjh
 */
public interface IRouterProduct {
    /**
     * 开机
     */
    void start();

    /**
     * 关机
     */
    void shutdown();

    /**
     * 打开wifi
     */
    void openWifi();

    /**
     * 配置
     */
    void setting();
}
