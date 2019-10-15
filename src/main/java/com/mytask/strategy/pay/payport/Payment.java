package com.mytask.strategy.pay.payport;

import com.mytask.strategy.pay.MsgResult;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.pay.payport
 * 文件名:Payment
 * description:
 *
 * @author lcwen
 * @version V1.0: Payment.java 2019/10/15 9:58
 **/
public abstract class Payment {

    public abstract String getName();

    protected abstract double queryBalance(String uid);

    public MsgResult pay(String uid ,double amount){
        if (queryBalance(uid) < amount){
            return new MsgResult(false,"支付失败","余额不足");
        }
        return new MsgResult(true,"支付成功","支付金额："+amount);
    }

}
