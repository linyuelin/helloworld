package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class Springboot16RedisApplicationTests {


	@Autowired
	private RedisTemplate redisTemplate;


	@Test
	void set() {
		ValueOperations valueOperations = redisTemplate.opsForValue();
		valueOperations.set("age",7);
	}


	@Test
	void get() {
		ValueOperations valueOperations = redisTemplate.opsForValue();
		System.out.println(valueOperations.get("age"));
	}

	@Test
	void hset() {
		HashOperations hashOperations = redisTemplate.opsForHash();
		hashOperations.put("info","a","aa");
	}

	@Test
	void hget() {
		HashOperations hashOperations = redisTemplate.opsForHash();
		System.out.println(hashOperations.get("info", "a"));
	}


}
