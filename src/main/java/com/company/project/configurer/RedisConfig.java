package com.company.project.configurer;


import org.springframework.cache.annotation.EnableCaching;

import org.springframework.context.annotation.Configuration;


/**
 * redis配置类
 *
 **/
@Configuration
@EnableCaching//开启注解
public class RedisConfig {
//    /**
//     * 选择redis作为默认缓存工具
//     * @param redisTemplate
//     * @return
//     */
//    @Bean
//    public CacheManager cacheManager(RedisTemplate<?, ?> redisTemplate) {
//        CacheManager cacheManager = new RedisCacheManager(redisTemplate);
//        return cacheManager;
//        /*RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
//        // 多个缓存的名称,目前只定义了一个
//        rcm.setCacheNames(Arrays.asList("thisredis"));
//        //设置缓存默认过期时间(秒)
//        rcm.setDefaultExpiration(600);
//        return rcm;*/
//    }
//    /**
//     * retemplate相关配置
//     * @param factory
//     * @return
//     */
//    // 以下两种redisTemplate自由根据场景选择
//    @Bean
//    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
//        RedisTemplate<Object, Object> template = new RedisTemplate<>();
//        // 配置连接工厂
//        template.setConnectionFactory(connectionFactory);
//
//        //使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值（默认使用JDK的序列化方式）
//        Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(Object.class);
//
//        ObjectMapper mapper = new ObjectMapper();
//        // 指定要序列化的域，field,get和set,以及修饰符范围，ANY是都有包括private和public
//        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        // 指定序列化输入的类型，类必须是非final修饰的，final修饰的类，比如String,Integer等会跑出异常
//        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        serializer.setObjectMapper(mapper);
//        // 值采用json序列化
//        template.setValueSerializer(serializer);
//        //使用StringRedisSerializer来序列化和反序列化redis的key值
//        template.setKeySerializer(new StringRedisSerializer());
//        template.afterPropertiesSet();
//        return template;
//    }
//    @Bean
//    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factory) {
//        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
//        stringRedisTemplate.setConnectionFactory(factory);
//        return stringRedisTemplate;
//    }
}
