package com.xjh.pattern.factory;

/**
 * <B>文件名称：</B>MailSender<BR>
 * <B>文件描述：</B>发送邮件实现类<BR>
 * <B>创建时间：</B>2024/5/27 16:10<BR>
 *
 * @author xjh
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("send mail");
    }

}
