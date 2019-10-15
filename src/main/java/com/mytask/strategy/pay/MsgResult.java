package com.mytask.strategy.pay;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.pay
 * 文件名:MsgResult
 * description:
 *
 * @author lcwen
 * @version V1.0: MsgResult.java 2019/10/15 10:01
 **/
public class MsgResult {

    private boolean flag;

    private String msg;

    private Object data;

    public MsgResult(boolean flag, String msg, Object data) {
        this.flag = flag;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "支付状态：[" + flag + "]," + msg + ",交易详情：" + data +"";
    }
}
