import java.util.Scanner;

public class Ex2444 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //숫자 N
        int N = sc.nextInt();

        //변경될 숫자
        int M = N;
        int MM = N;

        //2*N-1만큼 반복
        for(int i=1; i<=2*N-1; i++){
            for(int j=1; j<=2*N-1; j++){

                //M과 MM사이에 j가 들어오면 *찍기
                if(M <= j && j<=MM){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            //한줄이 끝날때마다 +,-해준다, 대신 입력한N의 /2지점에 도달하면 +,-반대로 설정
            if(i<(2*N-1)/2+1){
                M--;
                MM++;
            }
            else{
                M++;
                MM--;
            }

            System.out.println();
        }

        sc.close();
    }
}
