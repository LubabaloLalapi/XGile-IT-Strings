package stringcomparepackage;

import java.util.Scanner;

public class StringCompare {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first string");
        String str1=in.next();
        System.out.println("Enter second string");
        String str2=in.next();
        if(str2.equals(str1)){
            System.out.println("The strings are equal");
        }
        else{
            System.out.println("The strings are not equal");
        }

    }
}
