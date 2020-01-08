package serialization_and_deserialization.xml;

import java.io.Serializable;

public class Demo implements Serializable {
    public int a;
    public String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    public void setB(String b) {
        this.b = b;
    }
}
