import java.util.Scanner;

public class Ex2745 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String N = sc.next(); //B진법의 수N

        int B = sc.nextInt(); //진법B

        int value;
        int result = 0;

        //문자열을 하나씩 변환
        for(int i=0; i<N.length(); i++){
            char chr = N.charAt(i);

            //숫자일경우
            if('0' <= chr && chr <= '9'){
                value = chr - '0';
            }
            //문자일경우
            else{
                value = chr - 'A' + 10;
            }
            result = result * B + value;
        }
        System.out.println(result);
    }
}
