package com.mytask.strategy.pay.payport;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.pay.payport
 * 文件名:JDPay
 * description:
 *
 * @author lcwen
 * @version V1.0: JDPay.java 2019/10/15 9:53
 **/
public class JDPay extends  Payment{

    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
