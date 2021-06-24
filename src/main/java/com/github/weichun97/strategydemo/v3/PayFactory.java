package com.github.weichun97.strategydemo.v3;

import com.github.weichun97.strategydemo.PayTypeVar;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付类工厂（工厂模式+单例模式）
 *
 * @author chun
 * @date 2021/6/24 11:25
 */
public class PayFactory {

    private static final Map<Integer, BasePay> CONTEXT = new HashMap<>();

    static {
        CONTEXT.put(PayTypeVar.WECHAT, new WechatPay());
        CONTEXT.put(PayTypeVar.ALI, new AliPay());
        CONTEXT.put(PayTypeVar.CMB_BANK, new CmbBankPay());
        CONTEXT.put(PayTypeVar.CONSTRUCTION_BANK, new ConstructionBankPay());
    }

    /**
     * 获取支付类
     *
     * @param type
     * @return
     */
    public static BasePay get(int type){
        return CONTEXT.getOrDefault(type, null);
    }
}
