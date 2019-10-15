package com.mytask.strategy.pay;

import com.mytask.strategy.pay.payport.PayStrategy;
import com.mytask.strategy.pay.payport.Payment;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.pay
 * 文件名:Order
 * description:
 *
 * @author lcwen
 * @version V1.0: Order.java 2019/10/15 9:53
 **/
public class Order {

    private String uid;
    private String orderId;
    private double money;

    public Order(String uid, String orderId, double money) {
        this.uid = uid;
        this.orderId = orderId;
        this.money = money;
    }

    public MsgResult pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String key){
        Payment payment = PayStrategy.getPay(key);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为：" + money + "，开始扣款...");
        return payment.pay(uid,money);
    }

}
