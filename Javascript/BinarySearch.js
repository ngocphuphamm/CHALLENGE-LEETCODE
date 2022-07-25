/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
 var search = function(nums, target) {
     return searchRecursion(nums,0,nums.length-1,target);
    
};
  
  var searchRecursion = function(nums,left,right,target)
  { 
    
      let mid =Math.round((left + right) /2);

      if(left > right) return left 
      if(nums[mid] === target)
      {
          return mid;
      }
      else
      {
        return nums[mid] > target ? searchRecursion(nums,left,mid+1,target) : searchRecursion(nums,mid-1,right,target)
      }
  }

  let nums = [-1,0,3,5,9,12];
  console.log(search(nums,9));