package pi.hello;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pi.gpio.Led;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException, ParseException
    {
//    	Logger logger = LoggerFactory.getLogger(App.class);
//    	logger.info("Hello World");
//
//    	
//        System.out.println( "Hello World! " + Inet4Address.getLocalHost() );
    	
        //SystemInfoRaspi sir = new SystemInfoRaspi();
    	
    	Led l = new Led();
    	
    }
}
