"""
  Given a number N reverse the number and print it.

Example 1: Input: N = 123 Output: 321 Explanation: The reverse of 123 is 321

Example 2: Input: N = 234 Output: 432 Explanation: The reverse of 234 is 432

Input Format

123

Constraints

N <= 1000

Output Format

321

Sample Input 0

123
Sample Output 0

321

"""
import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        while(n>0)
        {
            a*=10;
            a+=(n%10);
            n=n/10;
            
        }
        System.out.print(a);
    }
}
