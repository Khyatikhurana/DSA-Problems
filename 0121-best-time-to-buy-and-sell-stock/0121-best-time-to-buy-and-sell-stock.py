class Solution(object):
    def maxProfit(self, prices):
        maxi=0
        mini=float('inf')
        for i in range(0,len(prices)):
            if prices[i]<mini:
                mini=prices[i]
            else:
                maxi=max(maxi,prices[i]-mini)
        return maxi
            
        