package com.dizhongdi.utils;

/**
 * ClassName:EmailUtils
 * Package:com.dizhongdi.utils
 * Description:
 *
 * @Date: 2021/8/6 20:55
 * @Author:dizhongdi
 */
public class EmailUtils {
    //获取当前秒数时间戳
    public static int currentSencond(){
        long l = System.currentTimeMillis();
        String s = String.valueOf(l);
        int length = s.length();
        String miao = s.substring(0, length - 3);
        int time = Integer.parseInt(miao);
        return time;
    }

    //邮箱注册有效时间，有效期5分钟
    public static int getEmailTime(){
        long l = System.currentTimeMillis();
        String s = String.valueOf(l);
        int length = s.length();
        String miao = s.substring(0, length - 3);
        int i = Integer.parseInt(miao);
        return i + 60 * 5;
    }
}
