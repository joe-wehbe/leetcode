class Solution {
    public int dayOfYear(String date) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        int days = 0;

        for (int i = 0; i < month-1; i++) {
            days += daysInMonth[i];
        }

        days += day;
        return !isLeapYear(year) || month == 1 || (month == 2 && day <= 29) ? days : days + 1;

    }

    private boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 4 == 0 && year % 100 != 0) return true;
        return false;
    }
}