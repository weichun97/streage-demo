package com.github.weichun97.strategydemo.v2;

/**
 * @author chun
 * @date 2021/6/24 10:43
 */
public class AliPay implements BasePay{
    @Override
    public String getSign() {
        // 此处省略100行.......
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        System.out.println("阿里支付签名");
        return "阿里支付签名";
    }

    @Override
    public String pay(String sign) {
        // 此处省略100行.......
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        System.out.println("阿里支付");
        return "阿里支付返回的结果";
    }

    @Override
    public void callback(String res) {
        // 此处省略100行.......
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        //..............,....
        System.out.println("阿里回调");
    }
}