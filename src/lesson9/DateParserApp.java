package lesson9;

import java.text.ParseException;
import java.util.Date;

public class DateParserApp {

    public static void main(String[] args) {
        // 12.12.2021 << string
        Date now = new Date();
        // string date -> date

        DateParser parser = new DateParser();
        Date parsedDate = parser.convertStringToDate("14.lk.2020 12:09:23");
        System.out.println(parsedDate);

        try {
            parser.convertString("23.12.2023 04:rr:23");
        } catch (ParseException exc) {
            //exc.printStackTrace();
//            System.out.println("Cannot convert string to date...");
            throw new RuntimeException(exc);
        }

    }

}
