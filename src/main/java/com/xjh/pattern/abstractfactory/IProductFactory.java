package com.xjh.pattern.abstractfactory;

/**
 * <B>文件名称：</B>IProductFactory<BR>
 * <B>文件描述：</B>产品工厂接口<BR>
 * <B>创建时间：</B>2024/5/28 10:23<BR>
 *
 * @author xjh
 */
public interface IProductFactory {
    IPhoneProduct phoneProduce();

    IRouterProduct routerProduce();
}
