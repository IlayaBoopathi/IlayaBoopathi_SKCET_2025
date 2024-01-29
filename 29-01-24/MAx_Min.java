"""
  You will be given a list of integers, , and a single integer . You must create an array of length  from elements of  such that its unfairness is minimized. Call that array . Unfairness of an array is calculated as

Where:
- max denotes the largest integer in 
- min denotes the smallest integer in 

Example



Pick any two elements, say .

Testing for all pairs, the solution  provides the minimum unfairness.

Note: Integers in  may not be unique.

Function Description

Complete the maxMin function in the editor below.
maxMin has the following parameter(s):

int k: the number of elements to select
int arr[n]:: an array of integers
Returns

int: the minimum possible unfairness
Input Format

The first line contains an integer , the number of elements in array .
The second line contains an integer .
Each of the next  lines contains an integer  where .

Constraints




Sample Input 0

7
3
10
100
300
200
1000
20
30
Sample Output 0

20
Explanation 0

Here ; selecting the  integers , unfairness equals

max(10,20,30) - min(10,20,30) = 30 - 10 = 20
Sample Input 1

10
4
1
2
3
4
10
20
30
40
100
200
Sample Output 1

3
Explanation 1

Here ; selecting the  integers , unfairness equals


  Solution:
  """
  
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        int minUnfairness = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.size() - k; i++) {
            int currentUnfairness = arr.get(i + k - 1) - arr.get(i);
            minUnfairness = Math.min(minUnfairness, currentUnfairness);
        }

        return minUnfairness;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, n)
            .mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.maxMin(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
