package com.github.weichun97.strategydemo.v2;

import com.github.weichun97.strategydemo.PayTypeVar;

/**
 * 使用策略模式将代码隔离
 *
 * 优点：
 *  1.各类型支付的方法写在对应的类型，代码进行了隔离，防止了出错
 *  2.代码精简，可以一眼看出业务逻辑
 *  3. 可扩展性强
 *
 * 缺点：
 *  1. 每一种类型需要多添加一个类文件，导致类文件过多，所以不可滥用策略模式。
 *  2. 使用策略模式需要分析不同类型的公共的方法，并设计出抽象类或接口，比较耗时耗经历。
 *
 * 当前模式下还存在的问题点：
 *  1. 依然存在大量的 ifelse
 *  2. 每次运行都会创建一个新的对象，比较浪费资源
 *
 * @author chun
 * @date 2021/6/24 10:38
 */
public class Start {
    public static void main(String[] args) {
        int type = 3;

        // 根据类型获取对应的支付类
        BasePay pay = null;
        if(PayTypeVar.WECHAT == type){
            pay = new WechatPay();
        }
        else if(PayTypeVar.ALI == type){
            pay = new AliPay();
        }
        else if(PayTypeVar.CMB_BANK == type){
            pay = new CmbBankPay();
        }
        else if(PayTypeVar.CONSTRUCTION_BANK == type){
            pay = new ConstructionBankPay();
        }
        else{
            System.out.println("错误的支付类型");
        }

        if(pay != null){
            // 调用固定的方法
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
}
