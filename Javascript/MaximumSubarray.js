/**
 * @param {number[]} nums
 * @return {number}
 */
 var maxSubArray = function(nums) {
    let maxNumber = nums[0];
    let curSum = 0 ; 
    
    for(let i =0 ; i < nums.length; i++)
        {
            if(curSum < 0)
                curSum = 0
            curSum += nums[i];
            maxNumber = Math.max(maxNumber,curSum);
        }
    return maxNumber
    
};