import java.util.ArrayList;
import java.util.Scanner;

public class Ex2563 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //전체 도화지를 배열로 선언
        int[][] mainPage = new int[100][100];

        //색종이 개수
        int paperCnt = sc.nextInt();

        //색종이를 도화지에 그려줌
        for(int i=0; i<paperCnt; i++){
            //가로크기
            int x = sc.nextInt();
            //세로크기
            int y = sc.nextInt();
            for(int j=x; j<x+10; j++){
                for(int p=y; p<y+10; p++){
                    mainPage[j][p] = 1; //체크
                }
            }
        }

        //체크된 개수 -> 색종이의 면적합계
        int cnt = 0;
        //전체 도화지에서 체크된 1의 개수를 확인
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(mainPage[i][j] == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

        sc.close();
    }
}
