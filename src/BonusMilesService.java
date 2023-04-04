public class BonusMilesService {

    public int calculate(int price) {
        int money = 20;
        int mile = 1;
        return ((price / money) * mile);

    }
}
