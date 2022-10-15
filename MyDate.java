package EX11_02;

public class MyDate {

    private String day;
    private String month;
    private String year;

    MyDate() {
        day = "20";
        month = "August";
        year = "2001";
    }

    public String getDay() {
        return day;
    }

    public void SetDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void SetMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void SetYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate Is : " + day + "/" + month + "/" + year + ".\n";

    }
}
