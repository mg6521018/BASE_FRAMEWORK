package com.test.jedis;

import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

import java.util.*;

/**
 * Created by magang on 2017/9/18.
 */
public class StringTest {
    private Jedis jedis;
    private String key = "test";

    @Before
    public void setUp() {
        this.jedis = new Jedis(new JedisShardInfo("172.16.155.137", 6379));
    }

    @Test
    public void set() {
        for (int i = 0; i < 3; i++) {
            jedis.set(key + i, UUID.randomUUID().toString());
        }
    }

    @Test
    public void get() {
        for (int i = 0; i < 3; i++) {
            System.out.println(jedis.get(key + i));
        }
    }

    /**
     * hset
     * key:用户ID
     * field:登录时间
     * value:登录详情
     */
    @Test
    public void hset() {
        jedis.hset("1101010011", "2018/10/10 01:05:01", "{'ip':'10.14.8.132','loginTime':10293123123}");
        jedis.hset("1101010011", "2018/10/11 01:01:01", "{'ip':'10.14.8.132','loginTime':10293123123}");
        jedis.hset("1101010011", "2018/10/9 01:01:02", "{'ip':'10.14.8.132','loginTime':10293123123}");
        jedis.hset("1101010011", "2018/10/6 01:03:01", "{'ip':'10.14.8.132','loginTime':10293123123}");
        jedis.hset("1101010011", "2018/10/8 01:09:01", "{'ip':'10.14.8.132','loginTime':10293123123}");
    }

    @Test
    public void hget() {
        System.out.println(jedis.hget("user", "name"));
    }

    @Test
    public void hgetAll() {
        Map<String, String> map = jedis.hgetAll("1101010011");
        System.out.println(map.size());
        for(String key : map.keySet()){
            System.out.println(key +":"+map.get(key));
        }
    }

    @Test
    public void ttl() {
        System.out.println(jedis.ttl("user"));
    }

    @Test
    public void sadd() {
        String [] str = new String[]{"1","2","3"};
        jedis.sadd("str" , str);

    }

    @Test
    public void smembers() {
        Set<String> str =  jedis.smembers("str");
        for(String s : str){
            System.out.println(s);
        }
    }

    @Test
    public void srandmember() {
        String str =  jedis.srandmember("str");
        System.out.println(str);
    }

    @Test
    public void scard() {
        Long str =  jedis.scard("str");
        System.out.println(str);
    }
}
