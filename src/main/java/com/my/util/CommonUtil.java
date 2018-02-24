package com.my.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.my.config.Myconst;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by zunyun on 17-12-7.
 */
public class CommonUtil {

    /**
     * 对字符串md5加密
     *
     * @param str
     * @return
     */
    public static String getMD5(String str) {
        str = str + Myconst.ATTACH_STR; //MD5偏移
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {

        }
        return "";
    }

    /**
     *
     * 生成唯一ID
     */
    private static boolean tmpIDlocked = false;
    private static long tmpID = 0;
    public static String getUnicleId()
    {
        long ltime = 0;
        while (true)
        {
            if(tmpIDlocked == false)
            {
                tmpIDlocked = true;
                //当前：（年、月、日、时、分、秒、毫秒）*10000
                ltime = Long.valueOf(new SimpleDateFormat("yyMMddhhmmssSSS").format(new Date()).toString()) * 100;
                if(tmpID < ltime)
                {
                    tmpID = ltime;
                }
                else
                {
                    tmpID = tmpID + 1;
                    ltime = tmpID;
                }
                tmpIDlocked = false;
                return String.valueOf(ltime);
            }
        }
    }


    /**把数据源HashMap转换成json
     * @param map
     */
    public static JSONObject HashMapToJson(HashMap map) {
        String string = "{";
        for (Iterator it = map.entrySet().iterator(); it.hasNext();) {
            Map.Entry e = (Map.Entry) it.next();
            string += "'" + e.getKey() + "':";
            string += "'" + e.getValue() + "',";
        }
        string = string.substring(0, string.lastIndexOf(","));
        string += "}";
        return JSON.parseObject(string);
    }

}
