import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getArrayPathWithInterval();
    }
    private static void getArrayPathWithInterval() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scan.nextInt();
        System.out.println("Введите длину интервалов");
        int m = scan.nextInt();
        List<Integer> resultList = new ArrayList<>();
        int[] arraySize = new int[n];
        boolean flag = true;
        int[] intervalLength = new int[m];
        int i = 0;
        while (flag) {
            for (int j = 0; j < m; i++, j++) {
                if (i == n) i = 0;
                arraySize[i] = i + 1;
                intervalLength[j] = arraySize[i];
            }
            resultList.add(intervalLength[0]);
            i--;
            if (intervalLength[m - 1] == arraySize[0]) {
                flag = false;
            }
        }
        for (Integer integer : resultList) {
            System.out.print(integer);
        }
    }
}
