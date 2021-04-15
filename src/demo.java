import java.util.Stack;

public class demo {
    public static void main(String[] args) {
        // đảo ngược
//        Stack<Integer> lists = new Stack<Integer>();
//        lists.push(1);
//        lists.push(2);
//        lists.push(3);
//        lists.push(4);
//        lists.push(5);
//        lists.push(6);
//        System.out.println(lists);
//        lists = reverseInt(lists);
//        System.out.println(lists);

// Đảo ngược chuỗi
        String str = "anh cong dep trai qua";
        Stack<String> listString = addString(str);
        System.out.println(listString);
        listString = reverseString(listString);
        System.out.println(listString);






    }
//    static Stack<Integer> reverseInt(Stack<Integer> lists){
//        Stack<Integer> newList = new Stack<>();
//        for (int i = 0; i < lists.size(); i++) {
//            newList.push(lists.get(lists.size()-(1+i)));
//        }
//        return newList;
//    }
    static Stack<String> reverseString(Stack<String> listString){
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < listString.size(); i++) {
            stringStack.push(listString.get(listString.size()-(1+i)));
        }
        return stringStack;
    }
    static Stack<String>addString(String list){
        String[]strings = list.split(" ");
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            stringStack.push(strings[i]);
        }
        return stringStack;
    }
}
