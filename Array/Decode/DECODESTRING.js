// https://leetcode.com/problems/decode-string/

Array.prototype.peek = function () {
  if (this.length === 0) {
    throw new Error("out of bounds");
  }
  return this[this.length - 1];
};
// thuat toan 
// stack
// split


function decode(){
  let decode = "2as[2[as]e]";
 const n =  decode.length;

 for(var i = 0;i < n ; i++) {
    const c = decode.charAt(i);
    let stack = [];
    if(c === "]")
    {
        // xu li chinh
        


        // pop  ra string den khi [
        let str  ; 
        //pop stack ra phan loai
        while(stack.peek() !== "[")
       {
          str = stack.pop() + str ;
          
       } 

       // bo ] 
       stack.pop();
       // kiem tra so  neu so o ngoai cung stack thi  phai kiem tra stack rong hoac so do co phai la number 
       let numberstring ; 
       if(stack.peek() == null )
       {
          numberstring = stack.pop() + numberstring;
          
       }
       const nloop = Number(numberstring);
       
       // repeat
       str = str.repeat(nloop);
       // nhet ket qua vao lai trong stack
       for(var i = 0  ; i < n  ; i++)
       {
         stack.push(str.charAt(i));

       }
  
      }
    else
    {
        // neu ma chua gap dau ] day vao stack 
        stack.push(c);
    }
    let result = ""
    while (stack === null)
    {
        result  = stack.pop() + result;
    }
    console.log(result) ; 
  }
}
 decode();