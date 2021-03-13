package summer;

import studentInfo.CourseSession;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SummerCourseSession extends CourseSession {

    public static SummerCourseSession create(String department, String number, Date startDate){
        return new SummerCourseSession(department, number, startDate);
    }

    private SummerCourseSession(String department, String number, Date startDate) {
        super(department, number, startDate);
    }

    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(getStartDate());
        int sessionLength = 8;
        int daysInWeek = 7;
        int daysFromFridayToMonday = 3;
        int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }
}
