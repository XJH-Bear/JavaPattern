package com.xjh.pattern.factory.staticmethod;

import com.xjh.pattern.factory.Sender;

/**
 * <B>文件名称：</B>StaticMethodFactoryTest<BR>
 * <B>文件描述：</B>测试类<BR>
 * <B>创建时间：</B>2024/5/27 16:39<BR>
 *
 * @author xjh
 */
public class StaticMethodFactoryTest {

    public static void main(String[] args) {
        Sender mailSender = StaticMethodFactory.produceMail();
        mailSender.send();  // 控制台输出： send mail

        Sender smsSender = StaticMethodFactory.produceSms();
        smsSender.send();  // 控制台输出： send sms
    }

}
