package sk.holic.sos;

public class Main {
    public static void main(String[] args) {


        int i = 0;
        while (true) {
            if (i++ >5 ) {
                break;
            }
        }







        System.out.println(i);
        System.out.println(Test.calc());
    }
    //vypíše to 7
    //ak to zmeníme na ++i tak to vypíše 6
}
