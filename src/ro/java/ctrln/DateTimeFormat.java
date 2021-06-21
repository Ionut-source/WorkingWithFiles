package ro.java.ctrln;

import org.omg.CORBA.StringHolder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeFormat {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        Date date = calendar.getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-YYYY H:m:ss");

        System.out.println(simpleDateFormat.format(date));

        String someDateString = "01-dec-2020 23:34:25";

        try {
            Date someDate = simpleDateFormat.parse(someDateString);
            System.out.println(someDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
