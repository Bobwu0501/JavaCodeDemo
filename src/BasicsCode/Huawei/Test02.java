package BasicsCode.Huawei;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNextLine()) {

            String str = scanner.nextLine();
            String[] split = str.split(" ");
            for (int i = 0; i < split.length; i++) {
                list.add(Integer.valueOf(split[i]));
            }
            int step = 2;
            for (int i = 1; i < list.size(); i++) {
                for (int j = 1; j < list.size() / 2; j++) {
                    if ((list.get(i) + j) == list.size()) {
                        step = Math.min(step, 2);
                    }
                }
            }
            System.out.println(step);
        }
    }
}
