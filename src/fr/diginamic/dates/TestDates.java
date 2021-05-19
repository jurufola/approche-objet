package fr.diginamic.dates;

import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {
        //Instance date à la date du jour
        Date date = new Date();
        System.out.println(date);
        //Affichage au format dd/mm/yyyyy
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("La date du jour au format dd/mm/yyyy : " + formateur.format(date));
        // Instance date au 19 mai 2016 à 23h59 et 30 seconde
        LocalDate localDate = LocalDate.of(2016, 05, 19);
        LocalTime localTime = LocalTime.of(23,59,30);
        LocalDateTime date_2016_05_19_23_59_30 =  LocalDateTime.of(localDate, localTime);
        SimpleDateFormat formateur2 = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
        System.out.println(formateur2.format(date));
        System.out.println(formateur2.format(new Date()));






    }

}
