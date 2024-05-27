package com.xjh.pattern.factory;

/**
 * <B>文件名称：</B>FactoryTest<BR>
 * <B>文件描述：</B>测试类<BR>
 * <B>创建时间：</B>2024/5/27 16:16<BR>
 *
 * @author xjh
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("mail");
        sender.send();  // 控制台数据结果： send mail
    }

}
