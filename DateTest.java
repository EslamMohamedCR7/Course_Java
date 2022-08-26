package math8_3;
import java.util.Date;
public class DateTest {
    public static void main(String[] args) {
       Date date = new Date();
        for (long i = 10000; i <= 1000000000000L; i*= 10){ 
            date.setTime(i);
       
        System.out.println(date.toString());
        }
    }
}



