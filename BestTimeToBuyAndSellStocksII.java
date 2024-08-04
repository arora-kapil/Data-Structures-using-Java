package leetCodeProblems;

//You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

//On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

//Find and return the maximum profit you can achieve.

import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }
        
        int buy = 0;
        int sell = 0;
        int profit = 0;
        int n = prices.length;
        
        while(buy < n-1 && sell < n) {
            if(prices[buy] < prices[buy+1]) {
                sell = buy;
                while(sell < n-1) {
                    if(prices[sell] > prices[sell+1]) {
                        profit += prices[sell] - prices[buy];
                        break;
                    }    
                        sell++;
                        if(sell == n-1) {
                            profit += prices[sell] - prices[buy];
                        }
                }
                buy = sell + 1;
                continue;
            }
            buy++;
        }
        
        return profit;
    }
}