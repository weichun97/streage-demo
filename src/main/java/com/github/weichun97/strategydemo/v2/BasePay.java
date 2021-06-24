package com.github.weichun97.strategydemo.v2;

/**
 * @author chun
 * @date 2021/6/24 10:41
 */
public interface BasePay {
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
}
