import java.util.Stack;

public class StackArray implements InterfaceStackQueue {
    private int SIZE;
    private int [] arr;
    private int topIndex;
    StackArray(int size)
    {
        SIZE = size ;
        arr = new int[size];
        topIndex = -1;
    }   


    @Override
    public void showStack(int [] stack)
    {
        for(int i = 0 ; i <= topIndex ; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    @Override
    public int pop() {
        if(!isEmpty())
        {
            int value = arr[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return topIndex == SIZE-1;
    }

    @Override
    public boolean push(int value) {
        if(!isFull())
        {
            topIndex++;
            arr[topIndex] = value;
        }
        return false;
    }

    
}
