package com.xjh.pattern.factory.staticmethod;

import com.xjh.pattern.factory.MailSender;
import com.xjh.pattern.factory.Sender;
import com.xjh.pattern.factory.SmsSender;

/**
 * <B>文件名称：</B>StaticMethodFactory<BR>
 * <B>文件描述：</B>静态工厂方法模式<BR>
 * <B>创建时间：</B>2024/5/27 16:38<BR>
 *
 * @author xjh
 */
public class StaticMethodFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }

}
