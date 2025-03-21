import java.util.Stack;

public class SortStack {
    static void printStack(Stack<Integer> s){

        while(!s.empty()){
            System.out.printf("%d ",s.pop());
        }
    }

    static void sortStack(Stack<Integer> s){
        if(s.empty())
            return ;
        int top=s.peek();
        s.pop();
        sortStack(s);
        System.out.printf("%d ",top);
    }
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Sorted output");
        sortStack(s);//sorted output

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("\nSimple output");
        printStack(s);//simple output



    }
}
