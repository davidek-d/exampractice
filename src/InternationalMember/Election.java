package InternationalMember;

public class Election {

    public static void main(String[] args) {
        Election e = new Election();

        InternationalMember m1 = new InternationalMember("John", "Henrik", "Dansk", 22);
        InternationalMember m2 = new InternationalMember("Mads", "Henriques", "Spansk", 29);
        InternationalMember m3 = new InternationalMember("Lange", "Johnberg", "Dansk", 55);

        System.out.println("Medlem 3");
        System.out.println(m3);
        System.out.println("Har normalt navn?: ");
        System.out.println(m3.commonName());
        System.out.println("Over 50?: ");
        System.out.println(m3.danishSeniorPlus());


    }
}
