// import java.nio.file.AccessDeniedException;

// public class Queue implements InterfaceQueue{
//     private int SIZE ;
//     private int [] arr;
//     private int headIndex ;
//     private int tailIndex;

//     Queue(int size)
//     {
//         SIZE = size;
//         arr = new int[size];
//         headIndex = tailIndex = -1;
//     }


//     @Override
//     public int pop() {
//       int value = -1;
//         if(!isEmpty())
//         {
//             value = arr[headIndex];
//             headIndex--;
//             if(headIndex > tailIndex)
//             {
//                 headIndex = tailIndex = -1; 
//             }
//         }
//         return value;
//     }


//     @Override
//     public boolean isEmpty() {
//         return headIndex == -1 & tailIndex == -1;
//     }

//     @Override
//     public boolean isFull() {
//        return tailIndex == SIZE;
//     }

//     @Override
//     public void push(int value) {
//         if(!isFull())
//         {
//             tailIndex ++;
//             arr[tailIndex] = value;
//         }

//     }

//     @Override
//     public void showStack(int[] stack) {
//         // TODO Auto-generated method stub
//         if(!isEmpty() & !isFull()) {
//             for(int i = headIndex; i <= tailIndex; i++) {
//                 System.out.println(arr[i]);
//             }
//         }
//     }

//     public int getSize()
//     {
//         return this.arr.length;
//     }

//     public int peek()
//     {
//         return arr[headIndex];
//     }
//     void reverseQueue(Queue q)
// {
//     if (q.size() == 0) // base case
//         return;
//     int fr = q.front(); // storing front(first element) of
//                         // queue
//     q.pop(); // removing front
//     reverseQueue(q); // asking recursion to reverse the
//                      // leftover queue
//     q.push(fr); // placing first element at its correct
//                 // position
// }
    
// }
