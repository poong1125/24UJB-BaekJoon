package q10039;

import java.util.ArrayList;

public class Asdsd {
    public static void main(String[] args) {
        // 2차원 ArrayList 생성
        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();

        // 첫 번째 행에 정수 추가
        twoDArrayList.add(new ArrayList<>());
        twoDArrayList.get(0).add(1);
        twoDArrayList.get(0).add(2);
        twoDArrayList.get(0).add(3);

        // 두 번째 행에 정수 추가
        twoDArrayList.add(new ArrayList<>());
        twoDArrayList.get(1).add(4);    
        twoDArrayList.get(1).add(5);
        twoDArrayList.get(1).add(6);

        // 출력
        for (ArrayList<Integer> row : twoDArrayList) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
