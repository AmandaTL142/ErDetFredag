package Services;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CalculateDay {

    public static int calculateDay() {

        //Først bestemmer jeg datoen, måneden og året og gemmer dem som int-variabler.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
        LocalDateTime currentDate = LocalDateTime.now();
        int date =Integer.parseInt(dtf.format(currentDate));
        dtf = DateTimeFormatter.ofPattern("MM");
        int month =Integer.parseInt(dtf.format(currentDate));
        dtf = DateTimeFormatter.ofPattern("yyyy");
        int year =Integer.parseInt(dtf.format(currentDate));

        //Derefter bestemmer/definerer jeg de variabler, jeg skal bruge i Zellers Congruence:
        int h;
        int q = date;
        int m = month;
        int k = year%100;
        int j = year/100;

        //Så beregner jeg variablen h vha. Zellers Congruence:
        h=(q+((13*(m+1))/5)+k+(k/4)+(j/4)-2*j)%7;

        /*
        Forklaring af variablerne:
        h is a temporary variable
        q is the day of the month (1-31)
        m is the month (1-12)
        j is the century: year/100
        k is the year of the century: year%100
         */

        //Derefter bestemmes et tal d for ugedagen (1-7). Denne returneres.
        int d;
        d=((h+5)%7)+1;

        /*
        d is the day of the week
         */
        return d;
    }
}
