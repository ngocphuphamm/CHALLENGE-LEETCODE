import java.util.ArrayList;

// bucket : {key : value};
// dem so luong nhap vao cua value
public class HashMap {
    private class Data{
        int key ;
        int data ;
        Data(int key , int data)
        {
            this.key = key;
            this.data =data;
        }

        @Override
        public boolean equals(Object other) {
            if(other instanceof Data)
                return this.key == ((Data)other).key;
            return false;    
        }
    }


    private final static int  SIZE = 1000;
    private ArrayList<Data>myBuckets [] ;

  

    HashMap()
    {
        myBuckets = new ArrayList[SIZE];
        for(int i = 0; i < myBuckets.length; i++)
        {
            myBuckets[i] = new ArrayList<>();
        }
    }
    

    public int hashFunction(int key)
    {
        return key % SIZE; 
    }

    public void putValue(int key , int value) 
    {
        int hashValueIndex  = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data newData = new Data(key,value);
        int keyIndex  = bucket.indexOf(newData);
        if(keyIndex >= 0 )
        {
            bucket.get(keyIndex).data = value;
        }
        else
        {
            bucket.add(newData);
        }
    }

    public void removeValue(int key)
    {
        int hashValueFunction = hashFunction(key);
        var bucket = myBuckets[hashValueFunction];
        Data temp = new Data(key,0);
        int keyIndex = bucket.indexOf(temp);
        if(keyIndex >= 0 )
        {
            bucket.remove(temp);
        }
    }

    public int getKey(int key)
    {
        int hashValueFunction = hashFunction(key);
        var bucket = myBuckets[hashValueFunction];
        Data temp = new Data(key,0);
        int keyIndex = bucket.indexOf(temp);
        if(keyIndex >= 0 )
        {
           return bucket.get(keyIndex).data;
        }
        return -1;
    }
}
