package test;

import redis.clients.jedis.Jedis;



public class RedisTest {
	
	public static Jedis getRedisConn() {
		final String HOST = "host";
		final int PORT = 6379;
		Jedis jedis = new Jedis(HOST, PORT);

		jedis.auth("password");
		jedis.set("name", "zx");
		System.out.println(jedis.get("name"));

		return jedis;
	}
	
	public static void main(String[] args) {
		System.out.println(getRedisConn());
	}

}
