package cn.itsource.crm.shiro.util;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * 加密工具类
 */
public class Md5Util {
    //加密方式
    public static final  String ALGORITHMNAME = "MD5";
    //盐值
    public static final String SALT = "itsource";
    //加密次数
    public static final Integer HASHITERATIONS = 10;


    public static String createMd5(String source){
        SimpleHash hash = new SimpleHash(ALGORITHMNAME, source, SALT, HASHITERATIONS);
        return hash.toString();
    }

    public static void main(String[] args) {
        System.out.println(createMd5("admin"));
    }
}
