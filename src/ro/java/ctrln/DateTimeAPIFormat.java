package ro.java.ctrln;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIFormat {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data curenta este: " + localDateTime);

        LocalDate localDate = LocalDate.now();
        System.out.println("Local date este: " + localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-YYYY H:m:ss");
        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("dd-MMM-YYYY");

        System.out.println(localDateTime.format(dateTimeFormatter));
        System.out.println(localDate.format(localDateFormatter));

        String localDateTimeString = "18-Feb-2021 14:51:11";
        String localDateString = "18-Feb-2021";

        //System.out.println("localDateTimeString este: " + LocalDateTime.parse(localDateTimeString, dateTimeFormatter));
       // System.out.println("localDateString este: " + LocalDate.parse(localDateString, localDateFormatter));
    }
}
