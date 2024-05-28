package com.xjh.pattern.abstractfactory;

/**
 * <B>文件名称：</B>HuaWeiFactory<BR>
 * <B>文件描述：</B>华为工厂实现类<BR>
 * <B>创建时间：</B>2024/5/28 10:26<BR>
 *
 * @author xjh
 */
public class HuaWeiFactory implements IProductFactory {
    @Override
    public IPhoneProduct phoneProduce() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct routerProduce() {
        return new HuaWeiRouter();
    }
}
