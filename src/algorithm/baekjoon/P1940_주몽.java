package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1940_주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = calcArmorCount(M,arr);
        System.out.println(count);
    }

    public static int calcArmorCount(int M, int[] sortedArr) {
        int startIdx = 0;
        int endIdx = sortedArr.length -1;

        int count = 0;

        while (startIdx < endIdx) {
            int sum = sortedArr[startIdx] + sortedArr[endIdx];
            if (sum == M) {
                count++;
                startIdx++;
                endIdx--;
            } else if (sum < M) {
                startIdx++;
            } else if (sum > M) {
                endIdx--;
            }
        }

        return count;
    }
}
