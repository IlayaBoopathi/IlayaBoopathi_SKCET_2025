"""
  Given an integer N, write a program to count the number of digits in N.

Input Format

Example 1: Input0: N = 12345

Example 2: Input1: N = 8394

Constraints

n <= 10000

Output Format

Output0: 5 Explanation: N has 5 digits

Output1: 4 Explanation: N has 4 digits

Sample Input 0

12345
Sample Output 0

5
"""
 """ <----------------LOGIC 1-------------------> """ 
import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0)
        {
            n=n/10;
            c++;
        }
        System.out.print(c);
    }
}
"""<----------------------LOGIC 2----------------------------------->"""
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=0;
        for(char i:s.toCharArray())
        {
            n++;
        }
        System.out.print(n);
    }
}
