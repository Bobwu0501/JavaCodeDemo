package BasicsCode.Huawei;


import java.util.*;

/**
 * @author bobwu
 * @Title: MingsRandom03
 * @ProjectName niukecode
 * @date 2020-04-1811:02
 */
public class MingsRandom03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            List<Integer> newList = new ArrayList<>();
            for (int i = 1; i <= num; i++){
                Integer number = scanner.nextInt();
                newList.add(number);
            }
            Collections.sort(newList);
            Set<Integer> set = new TreeSet<>();
            for (int i = 0;i <newList.size();i++){
                set.add(newList.get(i));
            }

            for (Integer i:set){
                System.out.println(i);
            }
        }

    }


}
