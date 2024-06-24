import java.util.Scanner;

public class Ex2941 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //단어
        String A = sc.next();

        //c= c- dz= d- lj nj s= z=

        //ljes=njak -> lj  e  s=  nj  a  k -> 6개
        //ddz=z=    -> d  dz=  dz= -> 3개
        //nljj      -> n  lj  j -> 3개
        //c=c=      -> c=  c=  -> 2개
        //dz=ak     -> dz= a  k -> 3개

        //있는 단어를 저장
        String str = "";

        int num = 0;

        //특정 크로아티아문자가 포함되어있다면 num+1해주고 str에 해당 문자 저장
        if(A.contains("c=")){
           num++;
           str += "c=";
        }
        if(A.contains("c-")){
            num++;
            str += "c-";
        }
        if(A.contains("dz=")){
            num++;
            str += "dz=";
        }
        if(A.contains("d-")){
            num++;
            str += "d-";
        }
        if(A.contains("lj")){
            num++;
            str += "lj";
        }
        if(A.contains("nj")){
            num++;
            str += "nj";
        }
        if(A.contains("s=")){
            num++;
            str += "s=";
        }
        if(A.contains("z=") && !A.contains("dz=")){
            num++;
            str += "z=";
        }


        //중복된 크로아티아 문자
        if(A.contains("c=c=")){
            num++;
            str += "c=";
        }
        if(A.contains("c-c-")){
            num++;
            str += "c-";
        }
        if(A.contains("dz=dz=")){
            num++;
            str += "dz=";
        }
        if(A.contains("d-d-")){
            num++;
            str += "d-";
        }
        if(A.contains("ljlj")){
            num++;
            str += "lj";
        }
        if(A.contains("njnj")){
            num++;
            str += "nj";
        }
        if(A.contains("s=s=")){
            num++;
            str += "s=";
        }
        if(A.contains("z=z=") && !A.contains("dz=dz=")){
            num++;
            str += "z=";
        }

//        System.out.println("A: " + A);
//        System.out.println("str: " + str);
//        System.out.println("strLenght: " + str.length());
//        System.out.println("ALenght: " + A.length());

        //입력한 문자열의 크기 - 크로아티아문자의 크기
        int num2 = A.length() - str.length();

        //크로아티아문자가 아닌 문자의 크기와 크로아티아문자를 더한다
        int finalNum = num + num2;

        //정답
        System.out.println(finalNum);

        sc.close();
    }
}
