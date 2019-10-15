package com.mytask.strategy.luckdraw;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.luckdraw
 * 文件名:WechatRandom
 * description:
 *
 * @author lcwen
 * @version V1.0: WechatRandom.java 2019/10/15 9:04
 **/
public class WechatRandom implements  Luckdraw {
    @Override
    public void doLuckDraw() {
        System.out.println("微信随机抽奖");
    }
}
