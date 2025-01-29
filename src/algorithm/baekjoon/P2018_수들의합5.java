package algorithm.baekjoon;

import java.util.Scanner;

public class P2018_수들의합5 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = calculateConsecutiveSum(N);
        System.out.println(count);
    }

    private static int calculateConsecutiveSum(int N) {
        int count = 1;
        int sum = 1;
        int startIdx = 1;
        int endIdx = 1;

        while (endIdx != N) {
            if (sum == N) {
                count++;
                endIdx++;
                sum += endIdx;
            } else if (sum > N) {
                sum-=startIdx;
                startIdx++;
            } else if (sum < N) {
                endIdx++;
                sum+=endIdx;
            }
        }
        return count;
    }
}
