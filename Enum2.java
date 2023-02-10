public class Enum2 {
    enum MonthWithDays {
        January(31),
        February(28),
        March(31),
        April(30),
        May(31),
        June(30),
        July(31),
        October(31);

        int days;

        MonthWithDays(int a) {
            days = a;
        }
    }

    public static void main(String[] args) {
        for (MonthWithDays a : MonthWithDays.values()) {
            System.out.println(a + " " + a.days);
        }
    }
}
