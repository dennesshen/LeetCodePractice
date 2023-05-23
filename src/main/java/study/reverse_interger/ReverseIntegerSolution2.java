package study.reverse_interger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author christinehsieh on 2023/5/4
 */
public class ReverseIntegerSolution2 {

    public int reverse(int x) {


        boolean isNegative = x < 0;

        try {

            if (isNegative) x = multiplyWithoutOver(x, -1);


            int result = 0;

            while (x > 0) {

                int extractNumber = x % 10;
                x = (x - extractNumber) / 10;

                result = addWithoutOver(multiplyWithoutOver(result, 10), extractNumber);

            }

            return multiplyWithoutOver(result, (isNegative ? -1 : 1));


        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }


    }

    private int powerForTen(int power){

        int result = 1;

        for (int i = 1; i <= power; i++){
            result *= 10;
        }
        return result;
    }


    private int addWithoutOver(int x, int y){

        int r = x + y;

        if ( ((x^r) & (y^r)) < 0){
            throw new ArithmeticException("overflow");
        }

        return r;
    }

    private int multiplyWithoutOver(int x, int y){

        long r = (long)x * (long)y;
        int rInt = (int)r;
        if (r != rInt){
            throw new ArithmeticException("overflow");
        }
        return rInt;
    }

}
