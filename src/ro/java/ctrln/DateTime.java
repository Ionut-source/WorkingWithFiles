package ro.java.ctrln;

import java.time.*;

public class DateTime {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data si ora curenta: " + localDateTime);

        ZonedDateTime zonedDateTime  = localDateTime.atZone(ZoneId.of("Europe/Bucharest"));
        System.out.println("Data si ora curenta in Bucuresti: " + zonedDateTime);

        System.out.println("Data si ora curenta in nanosecunde in Bucuresti: " + zonedDateTime.getNano());

        System.out.println("Ziua din luna: " + zonedDateTime.getDayOfMonth());
        System.out.println("Ziua din saptamana: " + zonedDateTime.getDayOfWeek());
        System.out.println("Ziua din an: " + zonedDateTime.getDayOfYear());

        System.out.println("Ora este: " + zonedDateTime.getHour());
        System.out.println("Minutul este: " + zonedDateTime.getMinute());
        System.out.println("Secunda este: " + zonedDateTime.getSecond());

        zonedDateTime =  zonedDateTime.plusDays(10);
        System.out.println("DAta peste 10 zile este: " + zonedDateTime);

        zonedDateTime = zonedDateTime.plusYears(3);
        System.out.println("Data peste 3 ani si 10 zile este: " + zonedDateTime);

        zonedDateTime = zonedDateTime.minusMonths(5);
        System.out.println("Data peste 3 ani si 10 zile din care scadem 5 luni este: " + zonedDateTime);

        LocalDate localDate = LocalDate.now();
        System.out.println("Data local date este: " + localDate);
        
        LocalTime localTime = LocalTime.now();
        System.out.println("Timpul local time este: " + localTime);
        




    }
}
