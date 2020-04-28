package BasicsCode.Huawei;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author bobwu
 * @Title: EasyError019
 * @ProjectName niukecode
 * @date 2020-04-1913:32
 */
public class EasyError019 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        Stack<String> stack = new Stack<>();
        while (scanner.hasNextLine()) {

            String error = scanner.nextLine();
            String[] file = error.split(" ");
            String[] files = file[0].split("\\\\");
            String fileName = files[files.length - 1];

            if (fileName.length() > 16) {
                fileName = fileName.substring(fileName.length() - 16);
            }
            if (!hashMap.containsKey("fileName + \" \" + line")) {
                hashMap.put(fileName + " " + files[1], 1);
            } else {
                Integer num = hashMap.get(fileName + " " + files[1]);
                hashMap.put(fileName + " " + files[1], num++);
            }
            stack.push(fileName + " " + files[1]);
        }
        int num = 1;
        while (num <= 8 && stack.size() != 0) {
            System.out.println(stack.pop() + " " + hashMap.get(stack.pop()));
            num++;
        }
    }
}
