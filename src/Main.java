import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[5];
        int temp;
        int n ;
        for(int i = 0; i < list.length; i++){
            temp = i +1;
            System.out.print(temp + ". Elemanı : ");
            n = sc.nextInt();
            list[i] = n;
        }

        System.out.println("Tüm elemanlar şu şekildedir. \n" + Arrays.toString(list));



    }
}
