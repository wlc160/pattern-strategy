package com.mytask.strategy.luckdraw;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.luckdraw
 * 文件名:EmptyLuck
 * description:
 *
 * @author lcwen
 * @version V1.0: EmptyLuck.java 2019/10/15 9:02
 **/
public class EmptyLuck implements Luckdraw {


    @Override
    public void doLuckDraw() {
        System.out.println("无抽奖活动");
    }
}
