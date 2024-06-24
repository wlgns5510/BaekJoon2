import java.util.Scanner;

public class Ex11718 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //입력받을때마다 true
        while(sc.hasNextLine()) {
            String str = sc.nextLine();

            System.out.println(str);
        }
        sc.close();
    }
}
