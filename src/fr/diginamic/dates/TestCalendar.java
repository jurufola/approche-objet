package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, Calendar.MAY);
        cal.set(Calendar.DAY_OF_MONTH, 19);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 30);
        Date date = cal.getTime();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formateur.format(date));
        SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal2 = Calendar.getInstance();
        Date date2 = cal2.getTime();
        System.out.println(formateur2.format(date2));
        SimpleDateFormat formateurFrance = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss", Locale.FRANCE);
        System.out.println(formateurFrance.format(date2));
        SimpleDateFormat formateurRusse = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss", new Locale("Ru"));
        System.out.println(formateurRusse.format(date2));
        SimpleDateFormat formateurChine = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss", Locale.CHINA);
        System.out.println(formateurChine.format(date2));
        SimpleDateFormat formateurAllemagne = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss", Locale.GERMAN);
        System.out.println(formateurAllemagne.format(date2));

    }
}
