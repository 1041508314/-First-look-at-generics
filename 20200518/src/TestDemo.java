import java.util.Scanner;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/18
 * @Content:
 */

class Person{

}
public class TestDemo {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        System.out.println("====================");
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println(myArrayList);

    }




    public static void main3(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        //myArrayList.add("hello"); //这一行报错 自动进行了类型检查
        myArrayList.add(1);
        myArrayList.add(2);
        int val = (int)myArrayList.getVal(1);
        System.out.println(val);

        MyArrayList<String> myArrayList2 = new MyArrayList<>();
        myArrayList2.add("123");
        myArrayList2.add("hello");
        //myArrayList2.add(1);//报错

    }




    public static void main2(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        int val = (int)myArrayList.getVal(1);
        System.out.println(val);
    }



    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            StringBuffer ret = new StringBuffer();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String tmp = ret.toString();
                if(!tmp.contains(ch + "")){
                    ret.append(ch);
                }
            }
            System.out.println(ret);
        }
    }
}
