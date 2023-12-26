package LeetCode75;

/**
 * @author christinehsieh on 2023/12/25
 */
public class EatingBananas_875 {

    public int minEatingSpeed(int[] piles, int h) {

        int lowerBound = 0, upperBound = Integer.MAX_VALUE;

        for (int i=piles.length-1;i>=0; i--){

            int pile = piles[i];
            if (pile < lowerBound || pile > upperBound) continue;

            int count = getTotalCount(piles, pile);
            if (0 < count && count <= h) {
                upperBound = pile;
            }else {
                lowerBound = pile;
            }
        }

        return calculateInterval(upperBound, lowerBound, piles, h);

    }


    private int calculateInterval(int upperBound, int lowerBound, int[]piles, int h){

        int middle = (upperBound + lowerBound)/2;

        if(upperBound==middle) return middle;
        if(lowerBound==middle) return upperBound;

        int count = getTotalCount(piles, middle);

        if (0< count && count <= h) {
            upperBound = middle;
        }else {
            lowerBound = middle;
        }

        return calculateInterval(upperBound, lowerBound, piles, h);
    }

    private int getTotalCount(int[] piles, int speed) {
        int count = 0;
        for (int j = 0; j < piles.length; j++){
            count += dividedTime(piles[j], speed);
        }
        return count;
    }

    private int dividedTime(int dividend, int divisor){
        int count = 0;
        int remainder = dividend;

        while (remainder > divisor){
            count += remainder / divisor;
            remainder %= divisor;
        }
        return remainder > 0 ? count+1:count;
    }
}
