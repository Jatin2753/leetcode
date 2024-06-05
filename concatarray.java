import java.util.Scanner;
public class concatarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter the length of array : ");
        n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element : "+i);
            ar[i]=s.nextInt();
        }
        int ar2[]=new int[2*n];
        for(int i=0;i<n;i++)
        {
            ar2[i]=ar[i];
        }
        for(int i=0;i<ar2.length;i++)
        {
            System.out.println(ar2[i]+ar2[i]);
        }
    }
}
