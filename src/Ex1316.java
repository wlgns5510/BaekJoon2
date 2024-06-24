import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1316 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //단어의 수
        int N = sc.nextInt();

        //그룹단어 체크변수
        int chk = 0;
        boolean bol = true;



        //단어의 수만큼 반복
        for(int i=1; i<=N; i++){

           bol = true;

            //단어
            String str = sc.next();

            //단어의 크기만큼 반복
            for(int j=0; j<str.length(); j++){
                //System.out.println("=====" + str.charAt(j) + "=====");
                ArrayList<Integer> nums = new ArrayList<>();

                for(int k=0; k<str.length(); k++){
                    //동일한 알파벳이 존재하는 경우
                    if(str.charAt(j) == str.charAt(k)){
//                        //System.out.println("동일한게 또 있음 k: " +k + " j: " +j );
//                        //앞 뒤에 있지 않은 경우
//                        if(k-j != 1 && k-j != -1){
//                            bol = false;
//                        }
                        nums.add(k);
                    }
                }
                //list에 들어있는 숫자들이 연속된 숫자들인지 확인, 연속이면 true 연속이 아니면 false를 반환
                if(nums.size() != 1){
                    for(int z=1; z<nums.size(); z++){
                        if (nums.get(z) != nums.get(z - 1) + 1) {
                            bol = false;
                            break;
                        }
                    }
                }

            }

            if(bol){
                chk++;
            }
        }

        //정답
        System.out.println(chk);

        sc.close();
    }
}
