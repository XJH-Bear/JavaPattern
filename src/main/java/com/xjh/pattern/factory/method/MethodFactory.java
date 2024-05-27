package com.xjh.pattern.factory.method;

import com.xjh.pattern.factory.MailSender;
import com.xjh.pattern.factory.Sender;
import com.xjh.pattern.factory.SmsSender;

/**
 * <B>文件名称：</B>MethodFactory<BR>
 * <B>文件描述：</B>多个工厂方法模式<BR>
 * <B>创建时间：</B>2024/5/27 16:32<BR>
 *
 * @author xjh
 */
public class MethodFactory {

    public Sender mailProduce() {
        return new MailSender();
    }

    public Sender smsProduce() {
        return new SmsSender();
    }

}
