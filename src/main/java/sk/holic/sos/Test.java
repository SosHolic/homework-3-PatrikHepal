package sk.holic.sos;

public class Test {

    public Test ref;
    public static Test sref;
    public int val;

    public static int calc() {
        Test t1 = new Test();//nová inštancia t1 typu Test
        Test t2 = new Test();//nova inštanica t2 typu Test


        t1.ref = t2;
        //k premenej ref sa priradí  inštncia t2
        t1.sref = t1;
        //je to statická premenná a priradí sa k nej inštancia t1
        t1.val = 10;        //skutočná hodnota je 1
        //k premennej val sa priradí 10
        t2.ref = t1;
        // k premennej ref sa priradí inštancia t1
        t2.sref = t2;
        //k stat.premenj sa priradí inštanica t2
        t2.val = 1;         //skutočná hodnota je 10
        //k premenej val sa priradí 1



        return t1.sref.ref.ref.val + t2.ref.sref.ref.val + t1.ref.ref.sref.val;
    }

    //
}