package tennis_practice;

/**
 * @author christinehsieh on 2023/8/21
 */
public class Tennis {

    private int firstPlayerScore;

    public void firstPlayerGetScore() {
        firstPlayerScore++;
    }

    public String whatUmpireSay() {
        if (firstPlayerScore == 1) {
            return "fifteen love";
        }
        return "love all";
    }
}
