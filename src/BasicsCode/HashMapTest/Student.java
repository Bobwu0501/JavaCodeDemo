package BasicsCode.HashMapTest;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/14
 */
public class Student {
    private String areaCode;
    private String localNumber;

    public Student(String areaCode, String localNumber) {
        this.areaCode = areaCode;
        this.localNumber = localNumber;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof  Student)){
            return false;
        }
        Student student = (Student) obj;
        return areaCode.equals(student.areaCode) && localNumber.equals(student.localNumber);
    }

    public static void main(String[] args) {


        Map<Student,String> map = new HashMap<>();

        map.put(new Student("23","222222"),"wuwuuw");

        String name = map.get(new Student("23","222222"));
        if (name == null){
            System.out.println("name is null");
        }else {
            System.out.println(name);
        }


    }



}
