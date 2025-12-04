package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Queue <String> q = new LinkedList<>();
        q.offer("a");
        q.offer("b");
        q.offer("c");
        q.offer("d");
        q.offer("e");
        System.out.println(q.isEmpty());
        System.out.println(q);
        System.out.println(q.poll());;
        System.out.println(q.poll());;
        System.out.println(q.contains("c"));;
    }
}
