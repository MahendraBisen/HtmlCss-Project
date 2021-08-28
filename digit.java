//Write a program  input 7 digit number and find the greatest among them

import java.util.*;
public class digit
{
 public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    int rem,lar=0;          


    System.out.println("Enter 7 digit number ");
    long d = sc.nextLong();

    while (d>0)
    {
        rem = d%10;
        if (lar<rem)
            lar = rem;
            
    }
    d= d/10;
    System.out.println("Largest Number  : "+lar);

        
    }
     
}