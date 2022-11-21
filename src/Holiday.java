import java.util.Objects;

public class Holiday {

    private String name;
    private String month;
    private int day;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Holiday(String name, String month, int day) {
        this.name = name;
        this.month = month;
        this.day = day;
    }

    public boolean inSameMonth(Object o) {
        if (this == o) return true;
        if (!(o instanceof Holiday)) return false;
        Holiday holiday = (Holiday) o;
        if (getMonth() == holiday.getMonth()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return Objects.equals(getMonth(), holiday.getMonth());
    }

    public double avgDate(Holiday[] h) {
        int s = 0;
        for (int i = 0; i < h.length; i++) {
            s = s + h[i].day;
        }
        return ((double) s) / h.length;
    }
}
