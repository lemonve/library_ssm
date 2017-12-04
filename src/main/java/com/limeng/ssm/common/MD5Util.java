package com.limeng.ssm.common;

import java.security.MessageDigest;

public class MD5Util {

    public static String getpwd(String pwd){
        try {
            //创建加密对象
            MessageDigest digest = MessageDigest.getInstance("md5");
            //调用加密对象的方法
            byte[] bs = digest.digest(pwd.getBytes());
            //将数据全部转成整数
            String hexstring = "";
            for (byte b:bs) {
                int temp =b & 255;
                 if(temp<16 && temp>=0){
                     hexstring = hexstring+ "0"+Integer.toHexString(temp);
                 }else {
                    hexstring = hexstring + Integer.toHexString(temp);
                 }
            }
            return  hexstring;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        String pwd = MD5Util.getpwd("abcd1234");
        System.out.println(pwd);
    }
}
