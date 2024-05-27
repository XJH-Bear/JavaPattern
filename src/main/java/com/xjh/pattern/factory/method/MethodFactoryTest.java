package com.xjh.pattern.factory.method;

import com.xjh.pattern.factory.Sender;

/**
 * <B>文件名称：</B>MethodFactoryTest<BR>
 * <B>文件描述：</B>测试类<BR>
 * <B>创建时间：</B>2024/5/27 16:36<BR>
 *
 * @author xjh
 */
public class MethodFactoryTest {

    public static void main(String[] args) {
        MethodFactory factory = new MethodFactory();

        Sender mailSender = factory.mailProduce();
        mailSender.send(); // 控制台输出：send mail

        Sender smsSender = factory.smsProduce();
        smsSender.send(); // 控制台输出：send sms

    }

}
