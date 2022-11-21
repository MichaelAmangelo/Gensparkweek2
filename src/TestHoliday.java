public class TestHoliday {
    public static void main(String[] args) {
        Holiday m = new Holiday("Christmas","December",25);
        Holiday h = new Holiday("Hanukkah","December",18);
        Holiday j = new Holiday("Independance","July",4);
        h.inSameMonth(m);
    }

}
