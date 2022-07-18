import java.util.*;
public class Stuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data");
        String data = sc.nextLine();
        String result = new String();
        int counter = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) != '1' && data.charAt(i) != '0') {
                System.out.println("Not valid Entry");
                return;
            }
            if (data.charAt(i) == '1') {
                counter++;
                result = result + data.charAt(i);
            } else {
                result = result +data.charAt(i);
                counter = 0;
            }
            if (counter == 5) {
                result = result + '0';
                counter = 0;
            }
        }
        System.out.println("now output is : " + result);
    }
}
