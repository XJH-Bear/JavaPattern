package com.xjh.pattern.factory;

/**
 * <B>文件名称：</B>Sender<BR>
 * <B>文件描述：</B>共同发送接口<BR>
 * <B>创建时间：</B>2024/5/27 16:08<BR>
 *
 * @author xjh
 */
public interface Sender {
    /**
     * 发送：短信-sms，邮件-mail
     */
    void send();
}
