public class Main {
    public static void main(String[] args) {

        MilesService service = new MilesService();
        int miles = service.calculate(1200, 20);
        System.out.println(miles);
    }
}