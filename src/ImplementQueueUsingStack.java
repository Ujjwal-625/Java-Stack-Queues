import java.util.Stack;

class CustomQueue{
    Stack <Integer> s1=new Stack();
    Stack <Integer> s2=new Stack();

    void enqueue(int data){
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }

    int dequeue(){
        if(s1.empty()){
            return -1;
        }
        int ans=s1.peek();
        s1.pop();
        return ans;
    }




}

public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        CustomQueue q=new CustomQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
