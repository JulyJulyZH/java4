public class BonusMilesService {
    public int calculate(int cost) {
        int rate = 20;
        int bonus = cost / rate;
        return bonus;
    }
}
