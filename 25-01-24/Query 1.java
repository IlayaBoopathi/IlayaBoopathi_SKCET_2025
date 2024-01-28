"""
Consider two points,  and . We consider the inversion or point reflection, , of point  across point  to be a  rotation of point  around .

Given  sets of points  and , find  for each pair of points and print two space-separated integers denoting the respective values of  and  on a new line.

Function Description

Complete the findPoint function in the editor below.

findPoint has the following parameters:

int px, py, qx, qy: x and y coordinates for points  and 
Returns

int[2]: x and y coordinates of the reflected point 
Input Format

The first line contains an integer, , denoting the number of sets of points.
Each of the  subsequent lines contains four space-separated integers that describe the respective values of , , , and  defining points  and .

Constraints

Sample Input

2
0 0 1 1
1 1 2 2
Sample Output

2 2
3 3
"""

import java.util.Scanner;

public class Main {

    static int[] findPoint(int px, int py, int qx, int qy) {
        // Calculate the coordinates of the reflected point
        int rx = 2 * qx - px;
        int ry = 2 * qy - py;

        return new int[]{rx, ry};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of sets of points
        int n = scanner.nextInt();

        // Process each set of points
        for (int i = 0; i < n; i++) {
            // Input the coordinates of points (px, py) and (qx, qy)
            int px = scanner.nextInt();
            int py = scanner.nextInt();
            int qx = scanner.nextInt();
            int qy = scanner.nextInt();

            // Find the reflected point and print the result
            int[] reflectedPoint = findPoint(px, py, qx, qy);
            System.out.println(reflectedPoint[0] + " " + reflectedPoint[1]);
        }

        scanner.close();
    }
}
