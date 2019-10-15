package com.mytask.strategy.pay;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.pay
 * 文件名:PayStrategyTest
 * description:
 *
 * @author lcwen
 * @version V1.0: PayStrategyTest.java 2019/10/15 10:08
 **/
public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1" ,"20191015555",567.22);
        System.out.println(order.pay());
    }
}
