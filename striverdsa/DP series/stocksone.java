public class stocksone {
    public static void main(String[] args) {
        // int[] arr = {7, 1, 5, 3, 6, 4};

        // best day to buy stock
        // System.out.println(BestDayToBuyStock(arr));

        // max profit - buy and sell
        // there can be a lot of ways - so we have to try all ways
        // System.out.println(MaximumProfit(arr, 0, true));

        // you allowed to buy and sell at most two times
        // int[] arr = {3, 3, 5, 0, 0, 3, 1, 4};
        // System.out.println(MaximumProfitAtMaxTwoTransaction(arr, 0, true, 2));

        // buy and sell and unlimited times with cooldown
        // int[] arr = {4, 9, 0, 4, 10};
        // System.out.println(MaximumProfitWithCoolDown(arr, 0, true, 2));

        // buy and sell stocks with transaction Fees
        int[] arr = {1, 3, 2, 8, 4, 9};
        System.out.println(MaximumProfitWithFee(arr, 0, true, 2));
    
    }

    // buy once and sell once
    static int BestDayToBuyStock(int[] arr) {
        int max = Integer.MIN_VALUE;
        int buy =arr[0]; 
        int sell =0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < buy) {
                buy = arr[i];
            }
            if(arr[i] - buy > max) {
                max = arr[i] - buy;
                sell = arr[i];
            }
        }
        if(max == 0) {
            System.out.println("There is no Good way to buy a Stock");
            return 0;
        }
        // System.out.println(buy+" / "+sell+" = "+max);
        return buy;
    }

    // buy and sell as many times as you want - only once stock in holding
    // recursion - memoization - tabulation - space optimization
    static int MaximumProfit(int[] arr, int index, boolean buy) {
        int profit = 0;
        if(index == arr.length) {
            return profit;
        }
        if(buy)
            profit = Integer.max( - arr[index] + MaximumProfit(arr, index+1, false), 0 + MaximumProfit(arr, index+1, true));
        else 
            profit = Integer.max(  arr[index] + MaximumProfit(arr, index+1, true), 0 + MaximumProfit(arr, index+1, false));

        return profit;
    }

    // at max two transaction - you can do maximum of two transaction
    // recursion - memoization - tabulation - space optimization
    static int MaximumProfitAtMaxTwoTransaction(int[] arr, int index, boolean buy, int transaction) {
        int profit = 0;

        if(transaction == 0) {
            return profit;
        }
        if(index == arr.length) {
            return profit;
        }
        if(buy)
            profit = Integer.max( - arr[index] + MaximumProfitAtMaxTwoTransaction(arr, index+1, false, transaction), 0 + MaximumProfitAtMaxTwoTransaction(arr, index+1, true, transaction));
        else 
            profit = Integer.max( arr[index] + MaximumProfitAtMaxTwoTransaction(arr, index+1, true, transaction - 1), 0 + MaximumProfitAtMaxTwoTransaction(arr, index+1, false, transaction));

        return profit;
    }

    // buy and sell as many times as you want - only once stock in holding - with cooldown
    static int MaximumProfitWithCoolDown(int[] arr, int index, boolean buy, int cooldown) {
        int profit = 0;
        if(index >= arr.length) {
            return profit;
        }
        if(buy)
            profit = Integer.max( - arr[index] + MaximumProfitWithCoolDown(arr, index+1, false, cooldown), 0 + MaximumProfitWithCoolDown(arr, index+1, true, cooldown));
        else 
            profit = Integer.max( arr[index] + MaximumProfitWithCoolDown(arr, index+cooldown+1, true, cooldown), 0 + MaximumProfitWithCoolDown(arr, index+1, false, cooldown));

        return profit;
    }


    // buy and sell stocks with fees
    static int MaximumProfitWithFee(int[] arr, int index, boolean buy, int fee) {
        int profit = 0;
        if(index == arr.length) {
            return profit;
        }
        if(buy)
            profit = Integer.max( - arr[index] + MaximumProfitWithFee(arr, index+1, false, fee), 0 + MaximumProfitWithFee(arr, index+1, true, fee));
        else 
            profit = Integer.max(  arr[index] + MaximumProfitWithFee(arr, index+1, true, fee) - fee, 0 + MaximumProfitWithFee(arr, index+1, false, fee));

        return profit;
    }
}
