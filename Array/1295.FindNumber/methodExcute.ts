class MethodExcute{       
    private data  : Array<number> ;
    
    constructor(data : Array<number>)
    {
        this.data = data;
    }
    excuteEvenNumber() : number
    {
        let count = 0 ;
        for(var i = 0; i < this.data.length; i++)
        {
           let digitEven : number = this.countDigit(this.data[i]); 
           if(digitEven % 2 === 0)
           {
             count ++;
           }
        }
        return count;
    }
    countDigit(dataCount:number) : number
    {
        let count  : number = 0;  
        while (dataCount !== 0 )
        {
            dataCount = dataCount % 10 ;
            count ++;    
        }
        if(dataCount === 0)
        {
            return count ;
        }
        
        return 0;
    }
    
}