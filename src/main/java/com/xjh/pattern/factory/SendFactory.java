package com.xjh.pattern.factory;

/**
 * <B>文件名称：</B>SendFactory<BR>
 * <B>文件描述：</B>普通工厂模式<BR>
 * <B>创建时间：</B>2024/5/27 16:12<BR>
 *
 * @author xjh
 */
public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println(" not found type");
            return null;
        }
    }

}
