package weekPrep;

public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        String[] splited = s.split(":");
        String hour= splited[0];
        String minute= splited[1];
        String second= splited[2].substring(0, 2);
        String dn = splited[2].substring(2, 4);

        int acthour=0;
        int parsedHr = Integer.parseInt(hour);
        String strParsedHr ="";

        if (dn.equals("PM") && parsedHr < 12 && parsedHr > 0){
           acthour = parsedHr + 12;
           strParsedHr = String.valueOf(acthour);
        }

        else if (dn.equals("AM") && parsedHr == 12){
            acthour = parsedHr - 12;
            strParsedHr = acthour + "0";
        }else {
            strParsedHr = hour;
        }

        return strParsedHr+":"+minute+":"+second;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }
}
