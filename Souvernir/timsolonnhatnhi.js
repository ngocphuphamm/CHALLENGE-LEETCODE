const arrayNumber = [101, 11, 3, 4, 50, 69, 7, 8, 9, 0];

let j = 1;

let solonnhat ; 
let sothuhai;

  
    if(arrayNumber[0]>arrayNumber[1]){
        solonnhat = arrayNumber[0];
        sothuhai = arrayNumber[1];
    }
    else
    {
        solonnhat = arrayNumber[1];
        sothuhai = arrayNumber[0];
    }
   


for(var i= 2 ; i < arrayNumber.length ; i++)
{
    if(solonnhat < arrayNumber[i])
    {
        solonnhat = arrayNumber[i];
        sothuhai = solonnhat;
    }
    else if(sothuhai < arrayNumber[i])
    {
        sothuhai = arrayNumber[i];
    }
}
console.log("so lon thu hai "+ sothuhai);
console.log("So lon thu nhat " + solonnhat);