package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2 x 3 2차원 배열을 만든다.
        int[][] arr = new int[3][3];

        int i = 1;
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++){ // arr.length 는 arr의 길이
            for (int column = 0; column < arr[row].length; column++){ // arr[row].length 는 arr[row]의 길이
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경.

        }
    }
}
