package Selector;


import java.util.List;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class AppSelect {
    public static void main(String[] args) {
        /*
        JavaSparkContext cont = new JavaSparkContext("local", "chart");
        JavaRDD<String> csvdoc = cont.textFile("\\data\\active_players_2.csv");
        System.out.println(csvdoc.count() + " " + (String)csvdoc.first());
        List<String> dat = csvdoc.collect();

        int total = 0;

        for(String x:dat) {
            boolean b = x.contains("23");
            if (b) {
                System.out.println("23 alert");
                ++total;
            }
        }

        System.out.println("26 alert total:" + total);
        */
    }
    JavaSparkContext cont = new JavaSparkContext("local", "chart");
    JavaRDD<String> csvdoc = cont.textFile("G:\\Dataset\\active_players_2.csv"); //data konumu
    List<String> dat = csvdoc.collect();

    public String backre(String search) {

        int total = 0;
        String r="Search not found";

        for(String x:dat) {
            boolean b = x.contains(search);
            if (b) {
                System.out.println(search + " -->alert");
                ++total;
            }
        }
        r= Integer.toString(total);
        return r;
    }


}
