package com.mytask.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.pay.payport
 * 文件名:PayStrategy
 * description:
 *
 * @author lcwen
 * @version V1.0: PayStrategy.java 2019/10/15 10:11
 **/
public class PayStrategy {

    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String,Payment> payMap = new HashMap<String ,Payment>();

    static {
        payMap.put(ALI_PAY,new Alipay());
        payMap.put(JD_PAY,new JDPay());
        payMap.put(UNION_PAY,new UnionPay());
        payMap.put(WECHAT_PAY,new WechatPay());
    }

    public static Payment getPay(String key){
        if (!payMap.containsKey(key)){
            return payMap.get(DEFAULT_PAY);
        }
        return payMap.get(key);
    }

}
