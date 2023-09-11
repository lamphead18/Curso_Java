public class exercicio {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Ofiice Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2.100;
        double price2 = 650.0;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.3f %n", product1, price1);
        System.out.printf("%s, which price is $ %.3f %n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);

        System.out.printf("Measure: %.8f %n", measure);
        System.out.printf("Rouded: %.3f %n", measure);

    }
}
