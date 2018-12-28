package ssst;

import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Thread1 t1 = new Thread1("Thread No. 1");
        Thread1 t2 = new Thread1("Thread No. 2");
        Thread1 t3 = new Thread1("Thread No. 3");

        t1.run();
        t2.run();
        t3.run();
    }
}
