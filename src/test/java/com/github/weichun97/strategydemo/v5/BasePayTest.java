package com.github.weichun97.strategydemo.v5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("测试支付")
class BasePayTest {

    @Test
    @DisplayName("测试支付")
    public void truePayTest(){
        int type = 1;
        // 根据类型获取对应的支付类
        PayFactory.get(type).truePay();
    }
}
