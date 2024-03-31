public class MyDate {
    private int day, month, year;
    private final int[] maxDays = {31,29,31,30,31,30,31,31,30,31,30,31};
    public MyDate(int year, int month, int day) {
        this.day = day;
        this.month = month -1 ;
        this.year = year;
    }
    public void incrementDay() {
        int newDay = day + 1;
        if (newDay > maxDays[month]){
            incrementMonth();
            day = 1;
        }else if (month == 1 && day == 28 && !isLeapYear()){
            incrementMonth();
            day = 1;
        }else {
            day = newDay;
        }
    }
    public void incrementDay(int i) {
        while (i > 0) {
            incrementDay();
            i--;
        }
    }
    public void decrementDay() {
        int newDay = day - 1;
        if (day == 1 && month != 2) {
            decrementMonth();
            day = maxDays[month];
        } else if (month == 2 && day == 1 && isLeapYear()) {
            decrementMonth();
            day = maxDays[month];
        }else {
            day = newDay;
        }
    }
    public void decrementDay(int i) {
        while (i > 0){
            decrementDay();
            i--;
        }
    }
    public void incrementMonth() {
        month = (month + 1) % 12;
        if (month == 0) {
            incrementYear();
        }
        if (day > maxDays[month]) {
            day = maxDays[month];
            if (month == 1 && isLeapYear()) {
                day = 28;
            }
        }
    }
    public void incrementMonth(int i) {
        while (i > 0) {
            incrementMonth();
            i--;
        }
    }

    public void decrementMonth(){
        month = month - 1 ;
        if (month < 0) {
            month = 11;
            decrementYear();
        }
        if (day > maxDays[month]) { // Adjust day if necessary
            day = maxDays[month];
            if (month == 1 && isLeapYear()) {
                day = 28;
            }
        }
    }
    public void decrementMonth(int i) {
        while (i > 0) { // Decrement the month i times
            decrementMonth();
            i--;
        }
    }

    public void incrementYear() {
        year++;
        if (!isLeapYear() && month == 1 && day == 29){
            day = 28;
        }
    }
    public void incrementYear(int i) {
        if (month == 1 && day == 29 && (i % 4) == 0 ) {
            while (i > 0) {
                incrementYear();
                i--;
            }
            day = 29;
        } else {
            while (i > 0) {
                incrementYear();
                i--;
            }
        }
    }
    public void decrementYear() {
        year--;
        if (!isLeapYear() && month == 1 && day == 29){
            day = 28;
        }
    }
    public void decrementYear(int i) {
        if (month == 1 && day == 29 && (i % 4) == 0 ) {
            while (i > 0) {
                decrementYear();
                i--;
            }
            day = 29;
        }else {
            while (i > 0) {
                decrementYear();
                i--;
            }
        }
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isBefore(MyDate anotherDate) {
        if (this.year < anotherDate.year) {
            return true;
        } else if (this.year == anotherDate.year) {
            if (this.month > anotherDate.month) {
                return true;
            } else if (this.month == anotherDate.month) {
                return this.day < anotherDate.day;
            }
        }
        return false;
    }
    public boolean isAfter(MyDate anotherDate) {
        return !isBefore(anotherDate) ;
    }

    public int dayDifference(MyDate anotherDate) {
        int difference = 0;

        if (this.year == anotherDate.year) {
            if (this.month == anotherDate.month) {
                difference = this.day - anotherDate.day;
            } else {
                difference += maxDays[this.month] - this.day;
                for (int i = this.month + 1; i < anotherDate.month; i++) {
                    difference += maxDays[i];
                }
                difference += anotherDate.day;
            }
        } else {

            difference += maxDays[this.month] - this.day;
            for (int i = this.month + 1; i < 12; i++) {
                difference += maxDays[i];
            }
            for (int i = this.year + 1; i < anotherDate.year; i++) {

            }
            for (int i = 0; i < anotherDate.month; i++) {
                difference += maxDays[i];
            }
            difference += anotherDate.day;
        }
        return difference;
    }
    @Override
    public String toString() {
        return year + "-" + (month + 1< 10 ? "0": "") + (month+1) + "-" + (day < 10 ? "0" : "")+ day;
    }
}