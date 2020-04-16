package BasicsCode.Huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/13
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        while ((str= in.readLine()) != null) {
            String[] split = str.split(";");
            int x = 0;
            int y = 0;
            for (int i = 0; i < split.length; i++) {
                char[] cur = split[i].toCharArray();
                int change = 0;
                for (int j = 1; j < cur.length; j++) {
                    if (cur[j] >= '0' && cur[j] <= '9') {
                        change = change * 10 + (cur[j] - '0');
                    } else {
                        break;
                    }
                }

                switch (cur[0]) {
                    case 'A':
                        x -= change;
                        break;
                    case 'D':
                        x += change;
                        break;
                    case 'W':
                        y += change;
                        break;
                    case 'S':
                        y -= change;
                        break;
                }

            }
            System.out.println(x + "," + y);

        }
        in.close();
    }
}
