package com.wesker.enumSample;

import org.junit.Assert;
import org.junit.Test;

/**
 * 枚举例子
 *
 * @author MR.ZHANG
 * @create 2019-05-14 10:28
 */
public class VoiceEnumTest {
    @Test
    public void test() {
        int code = 0;
        String msg = "服务开始";
        Assert.assertEquals(code, VoiceEnum.SERVICE_START.getValue());
        Assert.assertEquals(msg, VoiceEnum.SERVICE_START.getMsg());
        for (VoiceEnum v : VoiceEnum.values()) {
            System.out.println("code : " + v.getValue() + "   msg : " + v.getMsg());
        }
    }
}
