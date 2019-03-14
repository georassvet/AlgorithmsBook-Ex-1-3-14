
public class ResizingArrayQueueOfStringClient {
    public static void main(String[] args) {
        ResizingArrayQueueOfString queueOfString = new ResizingArrayQueueOfString();

        queueOfString.push("1");
        queueOfString.push("2");
        queueOfString.push("3");
        queueOfString.push("4");
        queueOfString.push("5");


        try {
            System.out.println(queueOfString.pop());
            System.out.println(queueOfString.pop());
            System.out.println(queueOfString.pop());
            System.out.println(queueOfString.pop());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        queueOfString.push("6");
        queueOfString.push("7");
        queueOfString.push("8");
        queueOfString.push("9");
        queueOfString.push("10");
        queueOfString.push("11");

    }
}
