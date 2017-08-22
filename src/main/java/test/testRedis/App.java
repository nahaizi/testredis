package test.testRedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 RedisPool.getJedis().set("name","陈浩翔");
         System.out.println(RedisPool.getJedis().get("name"));
    }
}
