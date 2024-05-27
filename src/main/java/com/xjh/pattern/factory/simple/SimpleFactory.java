package com.xjh.pattern.factory.simple;

import com.xjh.pattern.factory.MailSender;
import com.xjh.pattern.factory.Sender;
import com.xjh.pattern.factory.SmsSender;

/**
 * <B>文件名称：</B>SimpleFactory<BR>
 * <B>文件描述：</B>简单工厂模式<BR>
 * <B>创建时间：</B>2024/5/27 16:12<BR>
 *
 * @author xjh
 */
public class SimpleFactory {

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
