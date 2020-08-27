public class TesteDeMesa {
    public static void main(String[] args) {
        int a,b,c;
        a=11;
        b=3;
        c=a/b;

        if (c > 1) {
            a = a + b;
        } else {
            if (c > 3) {
                a = a + c;
            } else {
                a = a + a;
            }
        }
        System.out.println("a="+ a +", b="+ b +" e c=" + c);
    }
}