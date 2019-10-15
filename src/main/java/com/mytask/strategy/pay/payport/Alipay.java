package com.mytask.strategy.pay.payport;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.pay.payport
 * 文件名:Alipay
 * description:
 *
 * @author lcwen
 * @version V1.0: Alipay.java 2019/10/15 9:56
 **/
public class Alipay extends  Payment{

    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 50;
    }
}
