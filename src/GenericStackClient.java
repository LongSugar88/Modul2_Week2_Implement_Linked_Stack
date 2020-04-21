public class GenericStackClient {
    static void StackOfString(){
        MyGenericStack<String> myStringList = new MyGenericStack<>();
        myStringList.push("Long");
        myStringList.push("Đẹp");
        myStringList.push("Trai");
        System.out.println("Size of list: " + myStringList.size());
        while (myStringList.size() != 0){
            System.out.println("Element :" + myStringList.pop());
        }
        System.out.println("Size of list after pop(): " + myStringList.size());
    }
    static void StackOfInteger(){

        MyGenericStack<Integer> myListInt = new MyGenericStack<>();
        myListInt.push(1);
        myListInt.push(2);
        myListInt.push(3);
        myListInt.push(4);
        System.out.println("Size of list: " + myListInt.size());
        while (myListInt.size() != 0){
            System.out.println("Element :" + myListInt.pop());
        }
        System.out.println("Size of list after pop(): " + myListInt.size());
    }

    public static void main(String[] args) {
        System.out.println("String list");
        StackOfString();
        System.out.println("Integer list");
        StackOfInteger();
    }
}
