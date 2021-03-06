import static myutil.Convenience.print;

import java.util.*;

class Fantasy {
    String name;
    public Fantasy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class Scratch {
    public static void main(String[] args) {

        final Fantasy five = new Fantasy("FFV");
        print(five);
    }

    public static double inverse(double x) {
        try {
            return 1.0 / x;
        }
        catch (Exception e) {
            print("caught object");
            return 0;
        }
    }
}
