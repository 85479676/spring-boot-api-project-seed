package com.company.project.util; /**
 * @Title: RedisSingleton.java
 * @Package com.wlwl.cube.redis
 * @Description: Redis解析类
 * @author fenghai
 * @date 2016年10月19日 上午10:52:56
 * @version V1.0.0
 */


/**
 * @ClassName: RedisSingleton
 * @Description: Redis解析
 * @author fenghai
 * @date 2016年10月19日 上午10:52:56
 *
 */
public class RedisSingleton {

    private static RedisUtils redis=null;
    private RedisSingleton()
    {

    }

    public static RedisUtils instance()
    {
        if(redis==null)
        {
            redis=	new RedisUtils();
        }
        return redis;
    }
}
