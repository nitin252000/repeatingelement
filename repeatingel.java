import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class repeatingel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int min=-1;
        HashSet<Integer>set=new HashSet<>();
        for(int i=a.length-1;i>=0;i--)
        {
            if(set.contains(a[i])) {
                min = 1;
            }else {
                set.add(a[i]);
            }}
            if(min!=-1){

                    System.out.println("first repeating element in array is" + a[min]);


                }
            else
            {
                System.out.println("there are no repeating elements");
            }

        }


    }


