package builder;

import java.util.Date;

public class Test {
    private final Date date;

    public Test(Date date) {
        this.date = date;
    }

    public Date getDate() {
        Date d = new Date(date.getTime());
        return d;
    }
}
