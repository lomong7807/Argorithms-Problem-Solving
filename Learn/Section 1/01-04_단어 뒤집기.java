import java.io.*;
import java.util.*;
/*
 * 문제: 문자열을 거꾸로 뒤집어 출력
 * 입력: 문자열
 * 출력: 뒤집힌 문자열 출력
 * 풀이후기:
 *  - 난 stack 자료구조를 사용해서 풀었음
 *  - 근데 stack 자료구조로 처리하는것보다 배열에서 양끝 문자를 바꿔주는 처리가 훨씬 빨랐다
 *  - stack: 124ms
 *    lt, rt: 109ms
 *  - 좌측 끝(lt), 우측 끝(rt)를 순서대로 바꿔주면서 lt와 rt가 겹치거나 넘어서면 종료
 * */

public class Main {

    public static String solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            int lt = 0, rt = arr.length - 1;

            while(lt < rt) {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
            answer.append(String.valueOf(arr)).append("\n");
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.print(solution());
    }
}