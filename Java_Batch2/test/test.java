import java.util.*;

public class test {
    public static int findWinner(int[] bids) {
        HashMap<Integer, Integer> bidCount = new HashMap<>();
        int minBid = Integer.MAX_VALUE;
        int winnerIndex = -1;
        
        // Count the frequency of each bid
        for (int bid : bids) {
            bidCount.put(bid, bidCount.getOrDefault(bid, 0) + 1);
        }
        
        // Find the minimum unique bid and its index
        for (int i = 0; i < bids.length; i++) {
            if (bidCount.get(bids[i]) == 1 && bids[i] < minBid) {
                minBid = bids[i];
                winnerIndex = i;
            }
        }
        
        return (minBid == Integer.MAX_VALUE) ? -1 : winnerIndex;
    }
    
    public static void main(String[] args) {
        int[] bids = {2,1,3};
        int winnerIndex = findWinner(bids);
        if (winnerIndex != -1) {
            System.out.println("Winner: Person " + (winnerIndex + 1));
        } else {
            System.out.println("No winner");
        }
    }
}
