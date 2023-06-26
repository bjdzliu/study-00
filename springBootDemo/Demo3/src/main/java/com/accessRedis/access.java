package com.accessRedis;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;

public class access {
    public void accessredis(){
        RedisClient redisClient = RedisClient.create("redis://_@82.156.183.203:6379/");
        StatefulRedisConnection<String, String> connection = redisClient.connect();
        RedisCommands<String, String> syncCommands = connection.sync();
    }

}
