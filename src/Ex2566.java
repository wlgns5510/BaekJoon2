import java.sql.Array;
import java.util.Scanner;

public class Ex2566 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //배열 생성 및 선언
        int[][] arr = new int[9][9];

        //배열 초기화
        for(int i=0; i<9; i++){ //행
            for(int j=0; j<9; j++){ //열
                arr[i][j] = sc.nextInt();
            }
        }


        int maxVal = Integer.MIN_VALUE; //최댓값
        int valnum01 = 0; //행번호
        int valnum02 = 0; //열번호

        //배열출력
        for(int i=0; i<9; i++){ //행
            for(int j=0; j<9; j++){ //열
                if(maxVal < arr[i][j]){
                    maxVal = arr[i][j]; //최댓값 업데이트
                    valnum01 = i+1; //행번호 업데이트
                    valnum02 = j+1; //열번호 업데이트
                }
                //System.out.print(arr[i][j] + " ");
            }
            //System.out.println("");
        }

        System.out.println(maxVal);
        System.out.print(valnum01 + " " + valnum02);
    }
}
