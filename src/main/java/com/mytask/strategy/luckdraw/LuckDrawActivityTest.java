package com.mytask.strategy.luckdraw;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.luckdraw
 * 文件名:LuckDrawActivityTest
 * description:
 *
 * @author lcwen
 * @version V1.0: LuckDrawActivityTest.java 2019/10/15 9:09
 **/
public class LuckDrawActivityTest {

    public static void main(String[] args) {
        Luckdraw emptyLuck = new EmptyLuck();
        emptyLuck.doLuckDraw();
    }

}
