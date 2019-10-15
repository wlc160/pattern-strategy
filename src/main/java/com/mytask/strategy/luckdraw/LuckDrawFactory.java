package com.mytask.strategy.luckdraw;

import java.util.HashMap;
import java.util.Map;

/**
 * 工程名:pattern-strategy
 * 包名:com.mytask.strategy.luckdraw
 * 文件名:LuckDrawFactory
 * description:
 *
 * @author lcwen
 * @version V1.0: LuckDrawFactory.java 2019/10/15 9:10
 **/
public class LuckDrawFactory {

    public static  Map<String,Luckdraw> LUCK_DRAW_MAP = new HashMap<String,Luckdraw>();

    public static final Luckdraw NOT_DRAW = new EmptyLuck();

    static {
        LUCK_DRAW_MAP.put(LuckDrawKey.RANDOM_BALLS,new RandomBalls());
        LUCK_DRAW_MAP.put(LuckDrawKey.WECHAT_RANDOM,new WechatRandom());
        LUCK_DRAW_MAP.put(LuckDrawKey.TURN_TABLE,new Turntable());
    }

    public static Luckdraw getLuckDraw(String key){
        if (!LUCK_DRAW_MAP.containsKey(key)){
            return NOT_DRAW;
        }
        return LUCK_DRAW_MAP.get(key);
    }

    private interface LuckDrawKey{
        String RANDOM_BALLS = "RANDOMBALLS";
        String WECHAT_RANDOM = "WECHATRANDOM";
        String TURN_TABLE = "TURNTABLE";
    }
}

