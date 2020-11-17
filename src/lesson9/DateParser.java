package lesson9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("ALL")
public class DateParser {

    private SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public Date convertStringToDate(String dateAsString) {

        // try-catch
        // try-catch-finally
        // try-finally
        try {
            System.out.println("Start parsing date...");
            Date date = formatter.parse(dateAsString);
            System.out.println("Date parsed successfully");
            return date;
        } catch (ParseException exc) {
            System.out.println("Cannot parse date...");
            // exc << объект исключения, который был создан, а потом выброшен в методе parse
            System.out.println(exc.getMessage());
            throw new RuntimeException(exc);
        } finally {
            System.out.println("Finised parsing date");
        }

    }

    public Date convertString(String date) throws ParseException {
        try {
            return formatter.parse(date);
        } finally {
            System.out.println("Finished parsing date");
        }
    }

}