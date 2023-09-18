public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, String number) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public Date(String day, String month, String year) {
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public String toString(){
        return String.format("%d %d %d ",this.day,this.month,this.year);
    }
}