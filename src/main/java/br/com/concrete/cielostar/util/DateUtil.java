package br.com.concrete.cielostar.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gustavooliveira on 28/03/17.
 */
public class DateUtil {

    public static Date convertStringToDate(String date) {
        try {
            if(date != null)
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
