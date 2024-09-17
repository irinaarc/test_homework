package Kata;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1,2,3}, {3,2,1}}));
        System.out.println(maximumWealth(new int[][]{{1,5},{7,3},{3,5}}));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth =0;
        for(int i = 0; i < accounts.length; i++){
            int currentWealth = 0;
            for(int j = 0; j < accounts[i].length; j++){
                currentWealth += accounts[i][j];
            }
            System.out.println(currentWealth);
            maxWealth = maxWealth < currentWealth ? currentWealth : maxWealth;
        }
        return maxWealth;
    }
}
