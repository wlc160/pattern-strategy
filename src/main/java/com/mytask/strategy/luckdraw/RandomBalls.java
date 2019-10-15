package com.mytask.strategy.luckdraw;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.luckdraw
 * 文件名:RandomBalls
 * description:
 *
 * @author lcwen
 * @version V1.0: RandomBalls.java 2019/10/15 9:00
 **/
public class RandomBalls implements Luckdraw {
    @Override
    public void doLuckDraw() {
        System.out.println("随机球抽奖");
    }
}
