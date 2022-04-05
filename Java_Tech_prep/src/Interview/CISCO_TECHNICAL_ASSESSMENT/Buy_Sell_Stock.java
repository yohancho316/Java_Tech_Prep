package Interview.CISCO_TECHNICAL_ASSESSMENT;

public class Buy_Sell_Stock {


    public static void main(String[] args) {


        int[] stocks = {11, 13, 15, 17, 8, 10, 11, 11, 14, 15, 17};
        int[] transaction_dates = new int[6];
        int date_pos = 0;
        int current_profit;
        int max_profit = 0;
        boolean buy = true;
        int buy_price = 0;


        for(int i = 0; i < stocks.length; i++) {

            // If we have no stocks then BUY stocks && this ISN'T the last date
            if((buy) && (i < stocks.length - 1)) {

                // Set Buy Flag to False
                buy = false;

                // Record our purchase price
                buy_price = stocks[i];

                // Record the Date of Purchase
                transaction_dates[date_pos] = buy_price;

                // Increment Date Pos Counter
                ++date_pos;

                // Continue to the Next Iteration of the Loop
                continue;
            }

            // If the Stock Price is >= Our Purchase Price && We aren't on the Last Day
            if((stocks[i] >= buy_price) && (i < (stocks.length - 1))) {
                continue;
            }

            // Otherwise if Stock Price < Our Purchase Price then SELL
            else {


            }
        }
    }
}
