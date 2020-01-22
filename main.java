package rabin_karp;
import java.util.Scanner;
/**
 *
 * @author Nidhi Sharma
 */
public class Rabin_karp {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter string");
        String str1=sc.next();
        String pattern=sc.next();
        Numerical_pattern np=new Numerical_pattern();
        Algo_rabin_karp rk=new Algo_rabin_karp();
        rk.rabinKarp(pattern,str1,3);
    }
}
