package com.github.weichun97.strategydemo.v5;

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

    /**
     * 获取支付类
     *
     * @param type 支付类型
     * @return 支付类
     */
    public static BasePay get(int type){
        return CONTEXT.getOrDefault(type, CONTEXT.get(PayTypeVar.NULL));
    }

    /**
     * 注册
     * @param payType 支付类型
     * @param basePay 支付类
     */
    public static void regist(int payType, BasePay basePay){
        CONTEXT.put(payType, basePay);
    }
}
