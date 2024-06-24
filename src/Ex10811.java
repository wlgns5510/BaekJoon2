import java.util.ArrayList;
import java.util.Scanner;

public class Ex10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //바구니의 개수
        int N = sc.nextInt();

        //바구니의 개수만큼 배열을 생성
        int[] array = new int[N];
        int[] array2 = new int[N];

        //바구니 번호 넣어주기
        for(int i=0; i<array.length; i++){
            array[i] = i+1;
            array2[i] = i+1;
        }

        //역순으로 만들 횟수(M)
        int M = sc.nextInt();

        //M만큼 반복
        for(int i=0; i<M; i++){

            //섞을 시작번
            int ii = sc.nextInt();

            //섞을 끝번
            int jj = sc.nextInt();

            //배열 시작위치
            int x=ii;

            //역순으로 array배열에 담아준다
            for(int z=jj; z>=ii; z--){
                array[x-1] = array2[z-1];
                x++;
            }

            //바뀐 배열을 저장
            for(int p=0; p< array.length; p++){
                array2[p] = array[p];
            }
        }
        //바구니 확인
        for(int iii=0; iii< array.length; iii++){
            System.out.print(array[iii] + " ");
        }

        sc.close();
    }
}
