/**
 * @param {string} 
 * @return {boolean}
 */
 var isValid = function(s) {
    let stack = [];
    const text = s.trim();

    for (let i = 0 ; i  < text.length; i++) {
        if(text[i] === ")" && stack[stack.length-1] === "(" 
           || text[i]==="]" && stack[stack.length-1]=== "[" 
           || text[i] === "}" && stack[stack.length-1] === "{" )
        {
                stack.pop();
                console.log("pop")
        }
        else if(text[i]==="["|| text[i] === "{" || text[i] === "(" )
        {
                stack.push(text[i]);
                console.log("vao")
        }
        else
        {
            return false
        }
    }
    return stack.length  === 0 ;
};

let s = "]";
console.log(isValid(s));