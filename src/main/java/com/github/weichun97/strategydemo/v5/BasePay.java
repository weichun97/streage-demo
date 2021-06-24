package com.github.weichun97.strategydemo.v5;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author chun
 * @date 2021/6/24 10:41
 */
public interface BasePay extends InitializingBean {

    /**
     * 模板方法
     *
     * 真实支付方法
     */
    default void truePay(){
        String sign = getSign();
        String pay = pay(sign);
        callback(pay);
    }

    /**
     * 获取签名
     * @return
     */
    String getSign();

    /**
     * 支付
     * @param sign
     * @return
     */
    String pay(String sign);

    /**
     * 支付回调
     * @param res
     */
    void callback(String res);

    /**
     * 支付类型
     *
     * @return
     */
    int getPayType();

    @Override
    default void afterPropertiesSet() throws Exception {
        PayFactory.regist(getPayType(), this);
    }
}
