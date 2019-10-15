package com.mytask.strategy.pay.payport;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.pay.payport
 * 文件名:UnionPay
 * description:
 *
 * @author lcwen
 * @version V1.0: UnionPay.java 2019/10/15 9:57
 **/
public class UnionPay extends Payment{

    public String getName() {
        return "银联支付";
    }

    protected double queryBalance(String uid) {
        return 100;
    }
}
