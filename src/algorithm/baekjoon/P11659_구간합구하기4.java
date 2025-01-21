package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기4 {
    public static void main(String[] args) throws IOException {

        // 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

        // 입력
        // 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다.
        // 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

        // 출력
        // 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

        // 제한
        // 1 ≤ N ≤ 100,000
        // 1 ≤ M ≤ 100,000
        // 1 ≤ i ≤ j ≤ N

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        long[] arraySum = new long[N+1];

        tokenizer = new StringTokenizer(bf.readLine());
        for (int i=1; i<=N; i++) {
            arraySum[i] = arraySum[i-1] + Integer.parseInt(tokenizer.nextToken());
        }

        for (int i=0; i<M; i++) {
            tokenizer = new StringTokenizer(bf.readLine());
            int I = Integer.parseInt(tokenizer.nextToken());
            int J = Integer.parseInt(tokenizer.nextToken());
            System.out.println(arraySum[J] - arraySum[I - 1]);
        }
    }
}
