package schedule.utils;

import java.util.Calendar;
import java.util.Date;

public class ScheduleUtils {
    
    public static Date getDateFromString(String dateStr){
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, Integer.parseInt(dateStr.substring(6,10)));
        date.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dateStr.substring(3,5)));
        date.set(Calendar.MONTH,Integer.parseInt(dateStr.substring(0,2)));
        
        return date.getTime();
    }
}
