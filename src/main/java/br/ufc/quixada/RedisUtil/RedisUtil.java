package br.ufc.quixada.RedisUtil;

import redis.clients.jedis.Jedis;

public class RedisUtil {
	private static Jedis  jedis;
	public static Jedis connection() {
		return jedis = new Jedis("localhost");
	}

	public static void closejedis() {
		jedis.close();
	}
	
	
}

