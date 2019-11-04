package hackerrank;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class TimOfTheYear {
    public static void main(String[] args) {
        long s = System.nanoTime();
        long s1 = System.nanoTime();
        Date d = new Date(s1 - s);
        System.out.println(d);
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(86400000);

        //  01-JAN-1970 Thursday


        System.out.println(c.get(Calendar.YEAR));
        // System.out.println(c.get(Calendar.DATE));
        //    System.out.println(c.get(Calendar.DAY_OF_WEEK));
        String[] dat = new String[4];
        int day = c.get(Calendar.DATE);
        if (day >= 10) dat[0] = String.valueOf(day);
        else dat[0] = "0" + String.valueOf(day);
        System.out.println(dat[0]);
        int dayofwk = c.get(Calendar.DAY_OF_WEEK);

        switch (dayofwk) {
            case 2:
                dat[1] = "Monday";
                break;
            case 3:
                dat[1] = "Tuesday";
                break;
            case 4:
                dat[1] = "Wednesday";
                break;
            case 5:
                dat[1] = "Thursday";
                break;
            case 6:
                dat[1] = "Friday";
                break;
            case 7:
                dat[1] = "Saturday";
                break;
            case 1:
                dat[1] = "Sunday";
                break;
        }
        System.out.println(dat[1]);
        int month = c.get(Calendar.MONTH);
        switch (month) {
            case 0:
                dat[2] = "JAN";
                break;
            case 1:
                dat[2] = "FEB";
                break;
            case 2:
                dat[2] = "MAR";
                break;
            case 3:
                dat[2] = "APR";
                break;
            case 4:
                dat[2] = "MAY";
                break;
            case 5:
                dat[2] = "JUN";
                break;
            case 6:
                dat[2] = "JUL";
                break;
            case 7:
                dat[2] = "AUG";
                break;
            case 8:
                dat[2] = "SEP";
                break;
            case 9:
                dat[2] = "OCT";
                break;
            case 10:
                dat[2] = "NOV";
                break;
            case 11:
                dat[2] = "DEC";
                break;
        }
        System.out.println(dat[2]);
    }
}
