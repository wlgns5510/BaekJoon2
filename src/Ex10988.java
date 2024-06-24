import java.util.Scanner;

public class Ex10988 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //단어 입력
        String str = sc.next();

        //배열생성
        String[] array = new String[str.length()];

        //단어 거꾸로 변환해서 넣을 배열
        String[] array2 = new String[str.length()];

        //단어의 글자수만큼 반복해서 배열에 담는다
        for(int i=0; i<str.length(); i++){
            //System.out.println( str.substring(i,i+1));
            array[i] = str.substring(i,i+1);
        }

        //단어를 거꾸로해서 배열에 담기
        int num = 0;
        for(int i =array.length-1; i>=0; i--){
            array2[num] = array[i];
            num++;
        }

        //확인변수
        boolean bol = true;
        for(int i=0; i< array.length; i++){
            //값이 동일하다면 true, 동일하지 않다면 false
            if(array[i].equals(array2[i])){
                bol = true;
            }
            else{
                bol = false;
            }
        }

        //팰린드롬이면 1를 반환하고 아니면 0을 반환
        if(bol){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

        sc.close();
    }
}
