public class MilesService {
    public int calculate(int ticket, int rublesForBonusMiles) {

        int miles = ticket / rublesForBonusMiles;
        return miles;
    }
}