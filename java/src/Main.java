import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.io.FileNotFoundException;
import java.text.Format;
import java.util.*;
import java.io.File;
import w3cschool.Cat;
import w3cschool.Loader;

import java.awt.*;
/**
 * Created by Enzo Cotter on 2020/12/11.
 */

public class Main{
    static void getHello(String str){
        System.out.println("Hello" + str);
    }
    private int price;
    private class Inner{
        Inner(){}
        Inner(int _price){price = _price;}
        public int getPrice(){return price;}
    }
    public enum Rank{
        BRONZE,
        SILVER,
        GOLD
    }
    public static void main(String[] args){
        System.out.println("Hello World!");
        int a = 1, d=2;
        double b = 2.1;
        String str = "apple";
        char c = 'A';
        boolean flag = true;
        System.out.println(a+b);
        System.out.printf("%d %f %s", a, b, str);
        System.out.println();
//        Scanner in = new Scanner(System.in);
//        System.out.println(in.next());
        getHello("Alice");
        Test t1 = new Test("Bob", 22);
        System.out.println(t1.getName());
        t1.setName("Carol");
        System.out.println(t1.getName());
        System.out.println(Math.abs(Math.min(-6, 12)));
        Inner i1 = new Main().new Inner(50);
        System.out.println(i1.getPrice());
        Cnt c1 = new Cnt();
        Cnt c2 = new Cnt();
        System.out.println(c1.getCnt());
        System.out.println(Cnt.getCnt());
        Cat cat1 = new Cat(){
            @Override
            public void cry() {
                super.cry();
                System.out.println("HAHA");
            }
        };
        cat1.cry();
        Cat cat2 = new Cat(5);
        Cat cat3 = new Cat(5);
        System.out.println(cat3.equals(cat2));
        cat2.setAge(10);
        System.out.println(cat2.getAge());
        Rank r = Rank.BRONZE;
        System.out.println(r);
        Thread t = new Thread(new Loader());
        t.start();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("InterruptedException!");
        }
        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        for(int i=0; i<5; i++) {arr.add(i);}
        for (Integer elem:
             arr) {
            System.out.println(elem);
        }
        System.out.println(arr.size());
        System.out.println(arr.get(1));
        System.out.println(arr.contains(1));
        System.out.println(arr);
        arr.clear();
        arr.size();

        LinkedList<String> lArr = new LinkedList<String>();
        lArr.add("Red");
        lArr.add("Blue");
        lArr.add("Green");
        System.out.println(lArr);
        lArr.add(1, "yellow");
        for (String s:
             lArr) {
            System.out.println(s);
        }
        HashMap<String, Integer> map1 = new HashMap<String, Integer>(3);
        map1.put("Alice", 13);
        map1.put("Carol", 15);
        System.out.println(map1.get("Alice"));
        System.out.println(map1);
        HashSet<String> set1 = new HashSet<String>(3);
        set1.add("Blue");
        set1.add("Red");
        set1.add("Yellow");
        System.out.println(set1);
        Collections.sort(lArr);
        System.out.println(lArr);
        Iterator<String> it = lArr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        try {
            File f1 = new File("src/info.dat");
            Scanner sc = new Scanner(f1);
            while (sc.hasNext()){
                System.out.println(sc.next());
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        }

        try{
            Formatter f = new Formatter("src/newInfo.dat");
            f.format("%s %s %s\n", "1", "Alice", "Morce");
            f.format("%s %s %s", "2", "Carol", "Morce");
            f.close();
        }catch (Exception e){
            System.out.println("Error!");
        }
    }
}
