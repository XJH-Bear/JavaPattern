package com.xjh.pattern.factory;

/**
 * <B>文件名称：</B>SmsSender<BR>
 * <B>文件描述：</B>发送短信实现类<BR>
 * <B>创建时间：</B>2024/5/27 16:11<BR>
 *
 * @author xjh
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("send sms");
    }

}
