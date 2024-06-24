import java.util.Scanner;

public class Ex9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //테스트 케이스 수
        int T = sc.nextInt();

        for(int i=1; i<=T; i++){
            String str = sc.next();
            String start = str.substring(0,1);
            String end = str.substring(str.length()-1,str.length());

            System.out.println(start + end);
        }

        sc.close();
    }
}
