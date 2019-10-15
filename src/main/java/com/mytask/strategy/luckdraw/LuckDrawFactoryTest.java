package com.mytask.strategy.luckdraw;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.luckdraw
 * 文件名:LuckDrawFactoryTest
 * description:
 *
 * @author lcwen
 * @version V1.0: LuckDrawFactoryTest.java 2019/10/15 9:48
 **/
public class LuckDrawFactoryTest {

    public static void main(String[] args) {
        LuckDrawFactory.getLuckDraw("RANDOMBALLS").doLuckDraw();
    }

}
