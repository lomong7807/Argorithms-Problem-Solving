import java.io.*;
import java.util.*;
/*
 * 문제: 문자열을 입력받아 뒤집어도 같은 문자열인지 확인
 * 입력: 문자열
 * 출력: "YES", "NO"
 * 풀이후기:
 *  - 이런 문제들 때문에 lt, rt를 사용해서 순회하며 비교하는가보다.
 *  - 소문자, 대문자도 같은 문자로 취급해서 toUpperCase()로 변환 후 비교해줌.
 * */

public class Main {

    public static String solution(String s) {
        char[] arr = s.toCharArray();
        int lt = 0;
        int rt = arr.length - 1;

        while(lt < rt) {
            if(!(arr[lt] == arr[rt])) {
                return "NO";
                break;
            }
            lt++;
            rt--;
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.print(solution(str.toUpperCase()));
    }
}