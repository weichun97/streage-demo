package com.github.weichun97.strategydemo.v3;

/**
 * 使用工厂模式和单例模式解决大量ifelse和频繁创建对象的问题
 *
 * 当前模式下还存在的可优化的点：
 * 1. 每次获取支付类都需要进行判空处理
 * 2. 所有支付都需要按顺序调用3个固定的方法才能完成支付，可以合并成一个方法
 *
 * @author chun
 * @date 2021/6/24 10:38
 */
public class Start {
    public static void main(String[] args) {
        int type = 3;

        // 根据类型获取对应的支付类
        BasePay pay = PayFactory.get(type);
        if(pay == null){
            System.out.println("错误的支付类型");
        }

        // 其他业务逻辑 50 行
        // .................
        // .................
        // .................
        // .................

        String sign = pay.getSign();
        String res = pay.pay(sign);
        pay.callback(res);

        // 其他业务逻辑 50 行
        // .................
        // .................
        // .................
        // .................
    }
}
