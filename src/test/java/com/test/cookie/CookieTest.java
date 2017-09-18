package com.test.cookie;

import javax.servlet.http.Cookie;

/**
 * Created by magang on 2017/9/18.
 */
public class CookieTest {
    public static void main(String [] args){
        Cookie cookie = new Cookie("a1","v1");
        cookie.setPath("/");
        cookie.setDomain("lazyegg.club");
        cookie.setComment("笨蛋网登录状态");
    }
}