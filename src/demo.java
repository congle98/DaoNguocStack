import java.util.Stack;

public class demo {
    public static void main(String[] args) {
        Stack<Integer> lists = new Stack<Integer>();
        lists.push(1);
        lists.push(2);
        lists.push(3);
        lists.push(4);
        lists.push(5);
        lists.push(6);
        System.out.println(lists);
        lists = reverse(lists);
        System.out.println(lists);





    }
    static Stack<Integer> reverse(Stack<Integer> lists){
        Stack<Integer> newList = new Stack<>();
        for (int i = 0; i < lists.size(); i++) {
            newList.push(lists.get(lists.size()-(1+i)));
        }
        return newList;
    }
}
