package com.example.bookstore.utils;

public class EncodingUtils {

    public String getEncoding(String str) {
        String[] sEncodeArr = {"GBK", "GB2312", "ISO-8859-1", "UTF-8"};
        for (int i = 0; i < sEncodeArr.length; i++) {
            try {
                if(str.equals(new String(str.getBytes(sEncodeArr[i]),sEncodeArr[i]))){
                    return sEncodeArr[i];
                }
            } catch (Exception e) {}
        }
        return "";
    }
}
