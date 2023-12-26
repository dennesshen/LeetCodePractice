package tennis_practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author christinehsieh on 2023/8/21
 */
public class TennisTest {

    private Tennis tennisGame = new Tennis();

    @Test
    public void love_all(){
        assertWhatUmpireSay("love all");
    }


    @Test
    public void fifteen_love(){
        tennisGame.firstPlayerGetScore();
        assertWhatUmpireSay("fifteen love");
    }


    private void assertWhatUmpireSay(String love_all) {
        Assert.assertEquals(love_all, tennisGame.whatUmpireSay());
    }


}
