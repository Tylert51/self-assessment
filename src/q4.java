public class q4 {
    public static void main(String[] args) {
        
        String month = "July";
        int day = 6;
        int year = 2024;


        String[] monthArr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", 
    "December"};
        int[] daysArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if(year % 4  == 0) {
            daysArr[1]++;
        }
        

        int monthInd = findMonth(monthArr, month);
        int day_of_year = day;

        for (int i = 0; i < monthInd; i++) {
            day_of_year += daysArr[i];
        }

        System.out.println(day_of_year);       
        
    }

    public static int findMonth(String[] arr, String month) {
        for (int i = 0; i < arr.length; i++) {
            if (month.equals(arr[i])) {
                return i;
            }
        }

        return -1;
    }
}
