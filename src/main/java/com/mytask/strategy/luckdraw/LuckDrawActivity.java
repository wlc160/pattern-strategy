package com.mytask.strategy.luckdraw;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.luckdraw
 * 文件名:LuckDrawActivity
 * description:
 *
 * @author lcwen
 * @version V1.0: LuckDrawActivity.java 2019/10/15 9:06
 **/
public class LuckDrawActivity {

    public Luckdraw luckdraw;

    public LuckDrawActivity(Luckdraw luckdraw){
        this.luckdraw = luckdraw;
    }

    public void execute(){
        luckdraw.doLuckDraw();
    }

}
