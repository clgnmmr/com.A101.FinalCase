package utilities;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tests.HepsiBuradaApp;


public class Log  {

    private static Logger log= LoggerFactory.getLogger(Log.class.getName());


    public static void startTestCase(String sTestCaseName){

        log.info("******************         "+sTestCaseName+" Basladı         ******************");


        HepsiBuradaApp.extentTest = HepsiBuradaApp.extentReports.createTest(sTestCaseName);



    }
  public static void endTestCase(String sTestCaseName){
        log.info("******************         "+sTestCaseName+" bitti         ******************");

        HepsiBuradaApp.extentTest.info(sTestCaseName);
    }


    public static void assertLog(String msg) {

        log.info(msg);
        HepsiBuradaApp.extentTest.pass(msg);

    }


    public static void debug(String message)
    {
        log.debug(message);
        HepsiBuradaApp.extentTest.debug(message);

    }


    public static void error(String message) {
        log.error(message);
        HepsiBuradaApp.extentTest.error(message);

    }

    public static void info(String message) {

        log.info(message);
        HepsiBuradaApp.extentTest.info(message);
    }

    public static void warn(String message) {
        log.warn(message);
        HepsiBuradaApp.extentTest.warning(message);

    }


}
