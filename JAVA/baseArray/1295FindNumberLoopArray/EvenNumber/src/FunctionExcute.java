
public class FunctionExcute {
    private int data []  ;
    
    public FunctionExcute(int data [] ) {
        this.data = data;
    }

    int excuteCountEvenNumber(){
   
        var count = 0;
        
        for (int i = 0; i < data.length; i++) {
            int digitEven = countDigit(data[i]);
            if (digitEven % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    int countDigit(int dataCount)
    {
        var count = 0;
        while (dataCount != 0) {
            dataCount = dataCount / 10;
            count++;
        }
        return count;
    }
}
