package study.reverse_interger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author christinehsieh on 2023/5/4
 */
public class ReverseIntegerSolution1 {

    public int reverse(int x) {

        List<Integer> list = new ArrayList<>();

        boolean isNegative = x < 0;

        try {

            if(isNegative) x = multiplyWithoutOver(x, -1);



            splitNumber(list, x);



            int result = 0;
            int listSize = list.size();

            for (int i = listSize ; i > 0; i--){

                int addNumber = multiplyWithoutOver(list.get(i-1), powerForTen(listSize - i));
                result = addWithoutOver(result, addNumber);

            }

            return  multiplyWithoutOver(result , (isNegative? -1 : 1));


        }catch (ArithmeticException e){
            e.printStackTrace();
            return 0;
        }




    }

    private void splitNumber(List<Integer> list, int x){

        Integer extractNumber = x % 10;
        x = (x - extractNumber) / 10;

        list.add(extractNumber);

        if (x > 0){
            splitNumber(list, x);
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
