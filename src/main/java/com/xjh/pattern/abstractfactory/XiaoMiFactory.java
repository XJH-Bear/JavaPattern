package com.xjh.pattern.abstractfactory;

/**
 * <B>文件名称：</B>XiaoMiFactory<BR>
 * <B>文件描述：</B>小米工厂实现类<BR>
 * <B>创建时间：</B>2024/5/28 10:27<BR>
 *
 * @author xjh
 */
public class XiaoMiFactory implements IProductFactory {
    @Override
    public IPhoneProduct phoneProduce() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouterProduct routerProduce() {
        return new XiaoMiRouter();
    }
}
