package main.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Date date = new Date(23587200000L);

        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        // set
        calendar.set(Calendar.YEAR, 2030);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 10);

        // add menambahkan / mengurangi
        calendar.add(Calendar.YEAR, -10);

        Date result = calendar.getTime();
        System.out.println(result);

    }
}
