import java.util.Scanner;

public class Ex2738 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        //A,B배열 생성 및 선언
        int[][] arrayA = new int[N][M];
        int[][] arrayB = new int[N][M];

        //A배열 초기화
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arrayA[i][j] = sc.nextInt();
            }
        }

        //B배열 초기화
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arrayB[i][j] = sc.nextInt();
            }
        }

        //배열 A + B의 합을 행렬방식으로 출력
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(j == M-1){
                    System.out.print(arrayA[i][j] + arrayB[i][j]);
                }
                else{
                    System.out.print(arrayA[i][j] + arrayB[i][j] + " ");
                }

            }
            if(i == N-1){

            }
            else{
                System.out.println("");
            }

        }

    }
}
