import java.util.Scanner;

public class Ex27866 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //단어 S
        String S = sc.next();

        //정수 i
        int i = sc.nextInt();

        System.out.println(S.substring(i-1,i));

        sc.close();
    }
}
