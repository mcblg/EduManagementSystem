//package com.blg.edu.common.config;
//
//import com.alibaba.fastjson.parser.ParserConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.CachingConfigurerSupport;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cache.interceptor.KeyGenerator;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.cache.RedisCacheConfiguration;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.RedisSerializationContext;
//import org.springframework.data.redis.serializer.RedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//import java.time.Duration;
//
///**
// * @description:
// * @author: huangdong
// * @create: 2019-12-26
// */
//@Configuration
//public class RedisConfig extends CachingConfigurerSupport {
//
//    @Autowired
//    private LettuceConnectionFactory lettuceConnectionFactory;
//    private Duration timeToLive = Duration.ofSeconds(60);
//
//    @Override
//    @Bean //在没有指定缓存Key的情况下，key生成策略
//    public KeyGenerator keyGenerator() {
//        return (target, method, params) -> {
//            StringBuffer sb = new StringBuffer();
//            sb.append(target.getClass().getName());
//            sb.append(method.getName());
//            for (Object obj : params) {
//                sb.append(obj.toString());
//            }
//            return sb.toString();
//        };
//    }
//
//    @Override
//    @Bean
//    public CacheManager cacheManager() {
//        RedisCacheConfiguration configuration = RedisCacheConfiguration.defaultCacheConfig()
//                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(keySerializer()))
//                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(valueSerializer()))
//                .disableCachingNullValues()
//                .entryTtl(timeToLive);
//
//        RedisCacheManager.RedisCacheManagerBuilder builder = RedisCacheManager.RedisCacheManagerBuilder
//                .fromConnectionFactory(lettuceConnectionFactory)
//                .cacheDefaults(configuration)
//                .transactionAware();
//
//        return builder.build();
//    }
//
//    /**
//     * RedisTemplate配置 在单独使用redisTemplate的时候 重新定义序列化方式
//     */
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate(LettuceConnectionFactory lettuceConnectionFactory) {
//        // 设置序列化
//        FastJsonRedisSerializer<Object> fastJsonRedisSerializer = new FastJsonRedisSerializer<>(Object.class);
//
//        //设置白名单
//        ParserConfig.getGlobalInstance().addAccept("com.blg.edu.entity.");
//
//        // 配置redisTemplate
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(lettuceConnectionFactory);
//        RedisSerializer<?> stringSerializer = new StringRedisSerializer();
//        redisTemplate.setKeySerializer(stringSerializer);// key序列化
//        redisTemplate.setValueSerializer(fastJsonRedisSerializer);// value序列化
//        redisTemplate.setHashKeySerializer(stringSerializer);// Hash key序列化
//        redisTemplate.setHashValueSerializer(fastJsonRedisSerializer);// Hash value序列化
//        redisTemplate.afterPropertiesSet();
//        return redisTemplate;
//    }
//
//    private RedisSerializer<String> keySerializer() {
//        return new StringRedisSerializer();
//    }
//
//    private RedisSerializer<Object> valueSerializer() {
//        return new FastJsonRedisSerializer<>(Object.class);
//    }
//}
