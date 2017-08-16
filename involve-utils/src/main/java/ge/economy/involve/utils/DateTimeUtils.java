package ge.economy.involve.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by nino on 7/15/16.
 */
public class DateTimeUtils {

    public static int TWO_WEEK_IN_DAYS = 14;

    public static int daysBetween(long t1, long t2) {
        return (int) ((t2 - t1) / (1000 * 60 * 60 * 24));
    }

    public static Date addDays(Date startDate, int dayNumber) {
        Calendar c = Calendar.getInstance();
        c.setTime(startDate);
        c.add(Calendar.DATE, dayNumber);
        return c.getTime();
    }
}
