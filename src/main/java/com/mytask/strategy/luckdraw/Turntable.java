package com.mytask.strategy.luckdraw;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.luckdraw
 * 文件名:Turntable
 * description:
 *
 * @author lcwen
 * @version V1.0: Turntable.java 2019/10/15 8:58
 **/
public class Turntable implements Luckdraw {

    @Override
    public void doLuckDraw() {
        System.out.println("幸运转盘抽奖");
    }
}
