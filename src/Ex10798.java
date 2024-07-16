import java.util.ArrayList;
import java.util.Scanner;

public class Ex10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //이중배열 생성
        String[][] arr = new String[5][];
        int max = 0;


        for(int i=0; i<5; i++){
            //배열에 값 초기화
            arr[i] = sc.nextLine().split("");

            //이중배열의 가장 큰 값을 찾아놓는다
            if(max < arr[i].length){
                max = arr[i].length;
            }
        }

        //System.out.println("================");
        //System.out.println("max값: " + max);

        for(int j=0; j<max; j++){
            for(int i=0; i<arr.length; i++){
                if(j < arr[i].length && arr[i][j] != null){ //가장 중요한 if문 -> 이중배열들의 길이가 각각 다르기 때문에 2개의 조건 사용
                    System.out.print(arr[i][j]);
                }
            }
        }






    }
}
