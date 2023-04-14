package com.class7;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) {

        Manager man = new Manager();
        man.newDisplay();


         DataManagement management = new DataManagement();

      String email = "nguyengmail.com";
        try {
            String result = management.checkEmail(email);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String phone = "";
        try {
            String result = management.checkPhone(phone);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

         String date = "31/12/2000";
        try {
            String result = management.checkDateTime(date);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleformat
                = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss Z");
        SimpleDateFormat simpleDateFormat
                = new SimpleDateFormat("dd MMM yyyy");
        System.out.println("Today's date and time = "
                +
                simpleformat.format(cal.getTime()));

        Format f = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
        String str = f.format(new Date());
        System.out.println("Current Date in MM-dd-yyyy hh:mm:ss format = "+str);

        f = new SimpleDateFormat("dd/MMMM/yyyy");
        String strDate = f.format(new Date());
        System.out.println("Current Date = "+strDate);
        // current time
        f = new SimpleDateFormat("HH.mm.ss Z");
        String strTime = f.format(new Date());
        System.out.println("Current Time = "+strTime);

    }
}

