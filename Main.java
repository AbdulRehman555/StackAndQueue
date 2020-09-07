import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        //////////////////////////Stack///////////////////////
        Stack files=new Stack();
        files.push("Math");
        files.push("Urdu");
        files.push("Science");
        files.push("CS");
        String top=(String)files.pop();
        System.out.println(top);
        String top2=(String)files.pop();
        System.out.println(top2);

       //////////////////////////pop also removes that item while peek does not removes///////////////////////

        String top3=(String)files.peek();
        System.out.println(top3);
        String top4=(String)files.pop();
        System.out.println(top4);

        System.out.println(files.empty());

        System.out.println(files.search("CS"));             //////////returns  -1 or 1
        /////////////////////////Queue////////////////////////
        Queue persons=new LinkedList();
        //Queue is an interface while LinkedList is a class implementing the Queue
        persons.add("Ali");
        persons.add("Asad");
        persons.add("Asif");
        System.out.println(persons.poll());
        System.out.println(persons.poll());
        System.out.println(persons.poll());

        Deque orders=new LinkedList();
        orders.add("Learn");
        orders.add("Write");
        orders.add("Speak");

        orders.addFirst("Read");
        orders.addLast("Stop");

        System.out.println(orders.poll());
        System.out.println(orders.poll());
        System.out.println(orders.poll());
        System.out.println(orders.poll());
        System.out.println(orders.poll());

        ///////////Similarly pollFirst/pollLast

        System.out.println(orders.pollFirst());
        System.out.println(orders.pollLast());

    }
}
