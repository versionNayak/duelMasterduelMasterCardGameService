package com.heatedline.cdp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.heatedline.cdp.model.CacheInfoDTO;

public class CacheInfoService {
	@Autowired
	private RedisTemplate<String, CacheInfoDTO> redisTemplate;

	public void deleteCache(String typeConstant, String tokenId) {
		redisTemplate.opsForHash().delete(typeConstant, tokenId);

	}

}
