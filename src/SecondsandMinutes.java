import java.text.DecimalFormat;

public class SecondsandMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";


  
    public static String getDruationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }


        int hours = minutes / 60;
        int remainingminutes = minutes % 60;

        DecimalFormat df1 = new DecimalFormat("00");

        return df1.format(hours)+ "h " + df1.format(remainingminutes) +
                    "m " + df1.format(seconds) + "s";



    }

    public static String getDruationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingseconds = seconds %60;


        return getDruationString(minutes, remainingseconds);

    }


    public static void main(String[] args) {

        System.out.println(getDruationString(65,59)); // TEST
    }
}
