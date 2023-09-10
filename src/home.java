import java.util.ArrayList;

public class home {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int x; // 空变量
        x= 1;
        while(x < 10){
            if(x > 5){
                System.out.println(x);
            }
            x++;
        }


        byte b = 127;  // byte只能存 -128~127  一个256的不同的整数



        float f1 = (float)3.2; // JAVA默认的小数就是double的.
        // 需要进行强制类型转化，把double类型的数据，变成float类型，才能被存入对应的变量。
        double d1 = 4.1;

        boolean bool = true;

        char c1 = 'a';


        int nums[] = new int[10]; // 创建一个新的数组，给出容量
        // 说明，是什么类型的数组，叫什么名字

        for(int k = 0; k < 10; k++){ //变量初始值，结束条件，变化方式
            nums[k] = k*k;
        }

        for(int k = 0; k <nums.length; k++)
        System.out.print(nums[k]+" ");


        nums[5] = 100;  // 使用index往任意位置存值。
        System.out.println(nums[5]);


        String s1 = new String("hahahahah"); // 靠new来创建 --- 没意义
        String s2 = "lalalalalla"; // 直接使用双引号创建 ---- 常用

        System.out.println(s1 + s2);

        s1.charAt(3);   // s[3]


        ArrayList<String> lst = new ArrayList<>();  // 创业了一个空的存储字符串的list

        lst.add("1111");
        String e = lst.get(0);


        Integer i = 1;
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(200);

        Person p = new Person("Hung",18);

        Person people[] = new Person[10];  // 对象的array

        ArrayList<Person> classmate = new ArrayList<>(); // 存储Person的ArrayList



        // 强制类型转换

        int y = 100;
        b = (byte) y;
        System.out.println(b);

        y = 200;
        b = (byte) y;
        System.out.println(b);

    }

}
