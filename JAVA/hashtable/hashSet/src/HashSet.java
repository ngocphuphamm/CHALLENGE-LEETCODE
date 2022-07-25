import java.util.ArrayList;
// KIEM TRA SU TON  CUA MOT GIA TRI TRONG MAP 

public class HashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer>  myBuckets [] ;
    HashSet()
    {
        myBuckets = new ArrayList[SIZE];
        for(int i = 0; i < myBuckets.length; i++)
        {
            myBuckets[i] = new ArrayList<Integer>();
        }
    }

    public int hashFunction(int key){
        return key % SIZE;
    }

    public void addValue(int key)
    {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if(keyIndex < 0)
        {
            myBuckets[hashValueIndex].add(key);
        }
    }

    public void removeValue(int key)
    {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if(keyIndex >= 0 )
        {
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key)
    {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex >= 0;
    }

}
