public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long d = Math.round(minutes/60/24);
            long y = d == 0 ? 0:  Math.round(d/365) ;
            d = y == 0 ? 0 :d%(365 * y);
            String result = minutes + "minutes = " + y + " y and " + d + " d";
            System.out.println(result);
        }
    }
}
