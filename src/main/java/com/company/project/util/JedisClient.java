package com.company.project.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

//
public class JedisClient {
//

    private Jedis jedis;

    @Before
    public void testConnRedis() {

        //连接redis ，redis的默认端口是6379  localhost也可以替换成目标IP

        jedis = RedisUtil.getJedis();
        //权限认证 如果有密码 需要加上权限认证 如果没有可以忽略
        //  jedis.auth("admin");
    }

    /**
     * redis存储字符串
     * //
     */
    @Test
    public void testString() {
        //-----添加数据----------
        jedis.set("name", "xiaobai");//向key-->name中放入了value-->xiaobai
        System.out.println(jedis.get("name"));//执行结果：xiaobai

        //将值value关联到key，并将key的生存时间设为seconds(秒)。
        jedis.setex("foo", 5, "haha");
        System.out.println(jedis.get("foo"));


        //拼接
        jedis.append("name", " is my friend");
        System.out.println(jedis.get("name"));

        //返回key的个数
        System.out.println(jedis.dbSize());

        jedis.del("name");  //删除某个键 //可以添加多个 jedis.del("key1","key2","key3","key4","key5");
        System.out.println(jedis.get("name"));


        //检查给定key是否存在 因为上面删除了 所以不存在
        Boolean boo = jedis.exists("name");
        System.out.println(boo);


        //设置多个键值对
        jedis.mset("name", "xiaoer", "age", "23", "qq", "476777XXX");
        //jedis.incr("age"); //进行加1操作
        System.out.println(jedis.get("name") + "-" + jedis.get("age") + "-" + jedis.get("qq"));

        //将key改名为newkey,当key和newkey相同或者key不存在时,返回一个错误
        jedis.rename("name", "name2");
        System.out.println(jedis.get("name2"));

        //返回key所储存的值的类型。
        //none(key不存在),string(字符串),list(列表),set(集合),zset(有序集),hash(哈希表)
        System.out.println(jedis.type("name2"));


        //设置key生存时间，当key过期时，它会被自动删除。
        jedis.expire("name2", 10);//5秒过期


        //移除给定key的生存时间(设置这个key永不过期)
        jedis.persist("name2");

        //清空所有的key
        //jedis.flushAll();

        //哈希表key中的域field的值设为value。
         	/*jedis.hset("key1", "field1", "field1-value");
         	jedis.hset("key1", "field2", "field2-value");
         	jedis.hset("key1", "field3", "field3-value");*/
        //和上面同样的功能
        Map<String, String> map = new HashMap<String, String>();
        map.put("field1", "field5-value");
        map.put("field2", "field6-value");
        jedis.hmset("key1", map);

        //返回哈希表key中给定域field的值
        System.out.println(jedis.hget("key1", "field1"));

        //返回哈希表key中给定域field的值(多个)
        List<?> list = jedis.hmget("key1", "field1", "field2");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //删除哈希表key中的一个或多个指定域
        //jedis.hdel("key1", "field1");
        //jedis.hdel("key1", "field1","field2");

        //查看哈希表key中，给定域field是否存在。
        System.out.println(jedis.hexists("key1", "field1"));

        //返回哈希表key中所有域和值
        Map<String, String> map2 = jedis.hgetAll("key1");
        for (Map.Entry entry : map2.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + "\t");
        }

        //返回哈希表key中的所有map集合的key值
        System.out.println(jedis.hkeys("key1"));

        //返回哈希表key中的所有map集合的value值
        System.out.println(jedis.hvals("key1"));

        //查询key值对应的集合长度
        System.out.println(jedis.llen("key2"));
        //删除redis中的list集合
        for (int i = 0; i < jedis.llen("key2"); i++) {
            System.out.println(jedis.lpop("key2") + "删除");
        }
        //将值value插入到列表key的表头。  在key对应 list的头部添加字符串元素  如果没有key值 那就新建一个key值然后建立list列表保存到redis 中
        jedis.lpush("key2", "value1-0");
        jedis.lpush("key2", "value1-1");
        jedis.lpush("key2", "value1-2");

        //在key对应 list 的尾部添加字符串元素
        //jedis.rpush("key2", "value1-2");


        //返回列表key中指定区间内的元素,区间以偏移量start和stop指定.
        //下标(index)参数start和stop从0开始;
        //负数下标代表从后开始(-1表示列表的最后一个元素,-2表示列表的倒数第二个元素,以此类推)
        List<String> list2 = jedis.lrange("key2", 0, -1);//stop下标也在取值范围内(闭区间)
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }


        //set集合--------------------------
        //将member元素加入到集合key当中。
        jedis.sadd("key3", "value5");
        jedis.sadd("key3", "value8");

        //移除集合中的member元素。
        //	jedis.srem("key3", "value5");

        //返回集合key中的所有成员。
        Set set = jedis.smembers("key3");

        System.out.println(set.toString());

        //判断元素是否是集合key的成员
        System.out.println(jedis.sismember("key3", "value2"));

        //返回一个集合的全部成员，该集合是所有给定集合的交集
        Set set2 = jedis.sinter("key3", "key2");
        System.out.println(set2.toString());
    }
}

