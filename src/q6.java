public class q6 {
    public static void main(String[] args) {
        System.out.println(dayOfYear(2, 12, 2023));
    }

    public static int dayOfYear(int month, int dayOfMonth, int year) {
        
        int day = dayOfMonth;

        int[] daysArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(year % 4  == 0) {
            daysArr[1]++;
        }
        
        for (int i = 0; i < month - 1; i++) {
            day += daysArr[i];
        }

        return day;
    }
}
