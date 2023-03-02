public class Balance {
    int r = 0, l = 0;

    public void addRight(int n) {
        r += n;
    }

    public void addLeft(int n) {
        l += n;
    }

    String getSituation() {
        if (r == l) return "=";
        else if (r > l) return "r";
        else return "l";
    }


}
