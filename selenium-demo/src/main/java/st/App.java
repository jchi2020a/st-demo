package st;

import java.util.Map;

import com.typesafe.config.ConfigFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<String, Object> unwrapped = ConfigFactory.load().root().unwrapped();
        unwrapped.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
