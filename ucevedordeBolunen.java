import java.util.Scanner;
public class ucevedordeBolunen {
    public static void main(String[] args) {
        int k;
        int total = 0, counter = 0;
        Scanner inp = new Scanner(System.in);


        System.out.print("enter number : ");
        k = inp.nextInt();



        for (int i=1; i<=k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total = total + i;
                counter++;
            }
        }
        double average = total/counter;
        System.out.println(average);
    }
}
