import java.util.ArrayList;
import java.util.Scanner;

public class Ex25206 {
    public static void main(String[] args){

//        1 ≤ 과목명의 길이 ≤ 50
//        과목명은 알파벳 대소문자 또는 숫자로만 이루어져 있으며, 띄어쓰기 없이 주어진다. 입력으로 주어지는 모든 과목명은 서로 다르다.
//        학점은 1.0,2.0,3.0,4.0중 하나이다.
//        등급은 A+,A0,B+,B0,C+,C0,D+,D0,F,P중 하나이다.
//        적어도 한 과목은 등급이 P가 아님이 보장된다.

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        //20줄의 수강한 전공과목명, 학점, 등급(공백으로 구분)
        for(int i=0; i<20; i++){
            list.add(sc.nextLine());
        }

        //System.out.println("리스트 확인");
        //System.out.println(list);


        //전공과목별의 합
        Double maxScore01 = 0.0;
        //학점의 총합
        Double maxScore02 = 0.0;

        for(int i=0; i<list.size(); i++){
            //System.out.println("=====" + i + "=====");

            String[] arr01 = list.get(i).split(" ");


            switch (arr01[2]){
                case "A+" :
                    //System.out.println("A+");
                    maxScore01 += (Double) (4.5 * Double.parseDouble(arr01[1]));
                    maxScore02 += Double.parseDouble(arr01[1]);
                    break;
                case "A0" :
                    //System.out.println("A0");
                    maxScore01 += (Double) (4.0 * Double.parseDouble(arr01[1]));
                    maxScore02 += Double.parseDouble(arr01[1]);
                    break;
                case "B+" :
                    //System.out.println("B+");
                    maxScore01 += (Double) (3.5 * Double.parseDouble(arr01[1]));
                    maxScore02 += Double.parseDouble(arr01[1]);
                    break;
                case "B0" :
                    //System.out.println("B0");
                    maxScore01 += (Double) (3.0 * Double.parseDouble(arr01[1]));
                    maxScore02 += Double.parseDouble(arr01[1]);
                    break;
                case "C+" :
                    //System.out.println("C+");
                    maxScore01 += (Double) (2.5 * Double.parseDouble(arr01[1]));
                    maxScore02 += Double.parseDouble(arr01[1]);
                    break;
                case "C0" :
                    //System.out.println("C0");
                    maxScore01 += (Double) (2.0 * Double.parseDouble(arr01[1]));
                    maxScore02 += Double.parseDouble(arr01[1]);
                    break;
                case "D+" :
                    //System.out.println("D+");
                    maxScore01 += (Double) (1.5 * Double.parseDouble(arr01[1]));
                    maxScore02 += Double.parseDouble(arr01[1]);
                    break;
                case "D0" :
                    //System.out.println("D0");
                    maxScore01 += (Double) (1.0 * Double.parseDouble(arr01[1]));
                    maxScore02 += Double.parseDouble(arr01[1]);
                    break;
                case "F" :
                    //System.out.println("F");
                    maxScore01 += (Double) (0.0 * Double.parseDouble(arr01[1]));
                    maxScore02 += Double.parseDouble(arr01[1]);
                    break;
                case "P" :
                    //System.out.println("P");
                    break;

            }


        }
        //System.out.println("전공과목별의 합: " + maxScore01);
        //System.out.println("학점의 총합: " + maxScore02);

        //System.out.println("전공평점: " + (maxScore01/maxScore02));
        System.out.println((maxScore01/maxScore02));

    }
}
