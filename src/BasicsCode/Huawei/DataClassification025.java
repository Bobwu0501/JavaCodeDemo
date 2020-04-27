package BasicsCode.Huawei;

import java.util.*;

/**
 * @author bobwu
 * @Title: DataClassification025
 * @ProjectName niukecode
 * @date 2020-04-1920:59
 */
public class DataClassification025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            //读入第一行的数据
            int rNum = scanner.nextInt();
            List<Integer> rList = new ArrayList<>();
            for (int i = 0; i < rNum; i++) {
                Integer data = scanner.nextInt();
                rList.add(data);
            }
            //读入第二行的数据
            int iNum = scanner.nextInt();
            Set<Integer> iSet = new TreeSet<>();
            for (int j = 1; j <= iNum; j++) {
                Integer iData = scanner.nextInt();
                iSet.add(iData);
            }
            List<Integer> iList = new ArrayList<>();
            for (Integer integer : iSet) {
                iList.add(integer);
            }
            Collections.sort(iList);

            List<Integer> ansList = new ArrayList<>();
            for (int k = 0; k < iList.size(); k++) {
                int kNum = 0;
                List<Integer> rIndex = new ArrayList<>();

                for (int l = 0; l < rList.size(); l++) {
                    if (isContines(iList.get(k), rList.get(l))) {
                        kNum++;
                        rIndex.add(l);
                    }
                }

                if (kNum > 0) {
                    ansList.add(iList.get(k));
                    ansList.add(kNum);
                    for (int p = 0; p < rIndex.size(); p++) {
                        ansList.add(rIndex.get(p));
                        ansList.add(rList.get(rIndex.get(p)));
                    }
                }
            }

            int sum = ansList.size();
            System.out.print(sum + " ");
            for (int i = 0; i < ansList.size(); i++) {
                System.out.print(ansList.get(i));
                if (i < (sum - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //判断r中是否包含i
    public static boolean isContines(Integer i, Integer r) {
        if (r.toString().contains(i.toString())) {
            return true;
        }
        return false;
    }
}
