package ro.java.ctrln;

import sun.util.resources.cldr.CalendarData;

import javax.jws.soap.SOAPBinding;
import java.util.Calendar;
import java.util.TimeZone;

public class CalendarUsage {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        //Calendar aCalendar = new Calendar(); nu putem instantia clasa Calendar pentru ca este abstracta

        System.out.println(calendar.getTime());

        Calendar calendarBucharest = Calendar.getInstance(TimeZone.getTimeZone("Europe/Bucharest"));

        System.out.println(calendarBucharest.getTime());

        System.out.println("Timpul curent in milisecunde: " + calendarBucharest.getTimeInMillis() + " " + System.currentTimeMillis());


        System.out.println("Luna curenta este: " + calendarBucharest.get(Calendar.MONTH));
        System.out.println("Ziua  din luna este: " + calendarBucharest.get(Calendar.DAY_OF_MONTH));
        System.out.println("Ziua din saptamana este: " + calendarBucharest.get(Calendar.DAY_OF_WEEK));
        System.out.println("Ziua din an este: " + calendarBucharest.get(calendar.DAY_OF_YEAR));

        System.out.println("Ora este: " + calendarBucharest.get(Calendar.HOUR));
        System.out.println("Minutul este: " + calendarBucharest.get(Calendar.MINUTE));
        System.out.println("Secunda este: " + calendarBucharest.get(Calendar.SECOND));

        calendarBucharest.add(Calendar.DATE,10);
        System.out.println("Data peste 10 zile este: " + calendarBucharest.getTime());

        calendarBucharest.add(Calendar.MONTH, 5);
        System.out.println("Data peste 5 luni este: " + calendarBucharest.getTime());

        calendarBucharest.add(Calendar.YEAR,2);
        System.out.println("Data peste 2 ani este: " + calendarBucharest.getTime());

        calendarBucharest.add(Calendar.YEAR, -3);
        System.out.println("Data in urma cu 3 ani este: " + calendarBucharest.getTime());

    }
}
