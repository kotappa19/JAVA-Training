import java.util.*;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList<>();
        a1.add(10);
        a1.add("Kotappa");
        a1.add(true);
        a1.add('k');
        a1.add(1,"King");
        System.out.println(a1);
        System.out.println(a1.size()+" is Size of the Array List");
        ArrayList a2=new ArrayList<>();
        a2.add(100);
        a2.add("Girija");
        a2.add('G');
        System.out.println(a2);
        a1.addAll(a2);
        a1.remove(1);
        // a1.removeAll(a1);
        a1.add(10);
        a1.add(null);
        System.out.println(a1.contains("Kotappa"));
        System.out.println(a1);
        System.out.println(a1.isEmpty());
        a2.add("Kotappa");
        a1.add("King");
        System.out.println(a1.retainAll(a2));
        ArrayList<Integer> a3=new ArrayList<>();
        a3.add(10);
        a3.add(20);
        a3.add(30);
        a3.add(40);
        for (Object  o :a3) 
        {
            System.out.println(o);
        }



        System.out.println("LINKED LIST");
        LinkedList l1=new LinkedList<>();
        l1.add(10);
        l1.add("Kotappa");
        l1.add(true);
        l1.add(10.5f);
        l1.add('K');
        l1.remove(4);
        l1.removeFirst();
        l1.add(10);
        l1.add(10.5f);
        // l1.clear();
        l1.addFirst(10);
        l1.addLast(50);
        l1.removeLast();
        System.out.println(l1);
        LinkedList l2=new LinkedList<>();
        l2.add(10);
        l2.add(10.5f);
        l2.add(true);
        l2.add('K');
        l2.add(100);
        System.out.println(l2.contains(100));
        l2.retainAll(l1);
        System.out.println(l2);
        l1.addAll(l2);
        System.out.println(l1);



        System.out.println("HASH SET");
        HashSet h1=new HashSet<>();
        h1.add(10);
        h1.add("Kotappa");
        h1.add('K');
        h1.add(10.5f);
        h1.add(true);
        // h1.clear();
        HashSet h2=new HashSet<>();
        h2.add(10);
        h2.add(20);
        h1.addAll(h2);
        System.out.println(h2);
        System.out.println(h1);

    }
}
