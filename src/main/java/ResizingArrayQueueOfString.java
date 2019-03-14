
public class ResizingArrayQueueOfString {
    private final int defaultCapacity = 5;
    private String[] strings = new String[defaultCapacity];
    private int begin =-1;
    private int end=-1;
    private int n=0;

    public void push(String item){
        if(isEmpty()){
            strings[++end]=item;
            begin++;
        }else {
            if(end==strings.length-1){
                updateArray();
            }
            strings[++end]=item;
        }
        n++;
    }
    private void updateArray(){
        int newSize =begin>n*3/2?(n + n*3/2):(n + n*3/2-begin);
        String[] newArray = new String[newSize];
        for (int i = begin,j = 0; i <= end ;j++,i++) {
            newArray[j] = strings[i];
        }
        end=end-begin;
        begin=0;
        strings=newArray;
    }
    public boolean isEmpty(){
        return n==0;
    }

    public String pop() throws Exception{
        if(!isEmpty()) {
            n--;
            return strings[begin++];
        }else {
            throw new Exception("Queue is empty");
        }
    }

}

