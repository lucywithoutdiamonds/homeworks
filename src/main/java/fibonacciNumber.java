import org.apache.log4j.Logger;
import java.util.Date;
import java.util.Scanner;

public class fibonacciNumber {
    private static final Logger log = Logger.getLogger(fibonacciNumber.class);
    public static void main (String [] args){
        int a = 0;
        int b = 1;
        int sum;
        Scanner s = new Scanner(System.in);
        Date oldDate = new Date();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
        }
        Date newDate = new Date();
        long seconds = (newDate.getTime()-oldDate.getTime());
        System.out.print("\n" + "Программа выполнялась " + seconds + " мс");
        log.info("Программа выполнена");
    }
}
