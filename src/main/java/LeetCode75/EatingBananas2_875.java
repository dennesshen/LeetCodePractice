package LeetCode75;

/**
 * @author christinehsieh on 2023/12/25
 */
public class EatingBananas2_875 {

    public int minEatingSpeed(int[] piles, int h) {

        int length = piles.length;

        if (h == length){
            int max=0;
            for (int pile: piles){
                max = pile > max ? pile:max;
            }
            return max;
        }

        long sum=0;
        for (int pile:piles){
            sum += pile;
        }

        /**
         * 下限是總香蕉數除以要求的小時數，表示所每一個pile的香蕉數量都剛好可以在整數小時吃完
         * 上限則是可以用下列公式推導，以下公式中 l 為 piles的陣列長度，sp 為每小時吃多少香蕉，Xi 表示第i串香蕉的香蕉數量
         * Σ(i=1 to l) ((Xi-1)/sp +1) > h
         * 上敘不等式經過展開推導之後可以得到下列結果
         * sp < ((Σ(i=1 to l)Xi) - l) / (h-l)
         * 其中(Σ(i=1 to l)Xi) 即為全部香蕉總和。
         * 但因為 java "/"的運算子會只取商，所以取其+1作為upperBound
         */
        long lowerBound = sum/h -1 > 0 ? sum/h -1 : 0;
        long upperBound = (sum - length) / (h - length) +1;


        return (int) calculateInterval(upperBound, lowerBound, piles, h);

    }


    private long calculateInterval(long upperBound, long lowerBound, int[]piles, int h){

        long middle = (upperBound + lowerBound)/2;

        if(upperBound==middle) return middle;
        if(lowerBound==middle) return upperBound;

        long count = getTotalCount(piles, middle);

        if (0< count && count <= h) {
            upperBound = middle;
        }else {
            lowerBound = middle;
        }

        return calculateInterval(upperBound, lowerBound, piles, h);
    }

    private long getTotalCount(int[] piles, long speed) {
        long count = 0;
        for (int pile : piles){
             count+= ((pile-1)/speed + 1);
        }
        return count;
    }
}
