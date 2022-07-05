public class QueueArray implements InterfaceStackQueue {
     private int SIZE; 
     private int [] arr;
     private  int headIndex ; 
     private int tailIndex;
     
     QueueArray(int size)
     {
        SIZE = size ;
        arr = new int [size];
        headIndex = tailIndex = -1;
     }
    @Override
    public int pop() {
      int value = -1;
        if(!isEmpty())
        {
            value = arr[headIndex];
            headIndex--;
            if(headIndex > tailIndex)
            {
                headIndex = tailIndex = -1; 
            }
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        return headIndex == -1 & tailIndex == -1;
    }

    @Override
    public boolean isFull() {
       return tailIndex == SIZE;
    }

    @Override
    public boolean push(int value) {
        if(!isFull())
        {
            tailIndex ++;
            arr[tailIndex] = value;
        }
        return false;

    }

    @Override
    public void showStack(int[] stack) {
        // TODO Auto-generated method stub
        if(!isEmpty() & !isFull()) {
            for(int i = headIndex; i <= tailIndex; i++) {
                System.out.println(arr[i]);
            }
        }
    }
    
}
