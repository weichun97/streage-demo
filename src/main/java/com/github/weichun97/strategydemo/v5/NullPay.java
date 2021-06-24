package com.github.weichun97.strategydemo.v5;

import com.github.weichun97.strategydemo.PayTypeVar;
import org.springframework.stereotype.Component;

/**
 * 异常的支付类型
 *
 * @author chun
 * @date 2021/6/24 11:44
 */
@Component
public class NullPay implements BasePay {

    @Override
    public int getPayType() {
        return PayTypeVar.NULL;
    }

    @Override
    public void truePay() {
        System.out.println("错误的支付类型");
    }

    @Override
    public String getSign() {
        return null;
    }

    @Override
    public String pay(String sign) {
        return null;
    }

    @Override
    public void callback(String res) {

    }
}
