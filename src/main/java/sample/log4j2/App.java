package sample.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App {

    //getLoggerの引数はロガー名を指定する。
    //log4j2では、ロガー名の指定が省略可能になった。
    private Logger logger = LogManager.getLogger();

    public static void main( String[] args ) {
        App a = new App();
        a.runSample();
    }

    void runSample() {

        logger.trace("Start"); //2017/01/21 06:02:17.154 [main] TRACE  test1.Sample Start

        int a = 1;
        int b = 2;
        String c = null;

        logger.debug("debug"); //2017/01/21 06:02:17.157 [main] DEBUG  test1.Sample debug
        logger.info("info={}",a); //2017/01/21 06:02:17.159 [main] INFO   test1.Sample info=1
        logger.warn("warn={},={}" ,a,b); //2017/01/21 06:02:17.159 [main] WARN   test1.Sample warn=1,=2
        logger.error("error={}",c); //2017/01/21 06:02:17.171 [main] ERROR  test1.Sample error=null
        
        logger.trace("End"); //2017/01/21 06:02:17.172 [main] TRACE  test1.Sample End
    }
}
