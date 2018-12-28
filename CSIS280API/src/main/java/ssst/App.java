package ssst;

import spark.Filter;

import java.util.ArrayList;

import static spark.Spark.after;
import static spark.Spark.get;

public class App
{
    public static void main( String[] args )
    {
        after((Filter) (request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Access-Control-Allow-Methods", "GET");
        });

        get("/hello", (req, res) -> {
            res.type("application/json");
            // Go to MySQL Database
            return "{\"organisation\": \"SSST CSIS\", \"year\": 2018, \"students\": [1,2,3,4,5,6,7,8,9,10]}";
        });

        get("/html", (req, res) -> {
            res.type("text/html");
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);

            String listHTML = "<ul>";
            for (int i = 0; i< list.size() ; i++) {
                listHTML += "<li>" + i + "</li>";
            }
            listHTML += "</ul>";
            return "<b>Bold</b>" + listHTML;
        });
    }
}
