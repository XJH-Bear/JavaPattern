package com.xjh.pattern.factory.simple;

import com.xjh.pattern.factory.Sender;

/**
 * <B>文件名称：</B>FactoryTest<BR>
 * <B>文件描述：</B>测试类<BR>
 * <B>创建时间：</B>2024/5/27 16:16<BR>
 *
 * @author xjh
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();

        Sender mailSender = factory.produce("mail");
        mailSender.send();  // 控制台输出： send mail

        Sender smsSender = factory.produce("sms");
        smsSender.send();  // 控制台输出： send sms
    }

}
