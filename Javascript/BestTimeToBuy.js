https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let profit = 0;
    let stockToBuy = prices[0]; 
    for(let i = 1 ; i < prices.length-1; i++) {
        // duoc so nho nhat
            if(stockToBuy  > prices[i]) {
                stockToBuy = prices[i];
            }
        // tinh ra so co phan voi so nho nhat 
        // neu so hien tai 
            let currernProfit = prices[i] - stockToBuy;
            if(profit < currernProfit)
            {
                profit = currernProfit;
            }
    }
    return profit;
};
const prices = [7,2,5,3,6,1];

let num = maxProfit(prices);
console.log(num);