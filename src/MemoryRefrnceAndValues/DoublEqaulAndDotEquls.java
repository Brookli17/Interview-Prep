package MemoryRefrnceAndValues;

public class DoublEqaulAndDotEquls {

    public static void main(String[] args) {

        String s1 = new String("Darshan");
        String s2 = new String("Darshan");

        System.out.println( s1 == s2);
        // false becouse memory location compared which is diff

        System.out.println(s1.equals(s2));
        // true cuz String overrides the equeal methos so
        //values are compared

        String D1 = "Darshan";
        String D2 = "Darshan";
        System.out.println(D1 == D2);  // Memroy location is same


        int i = 10;
        int j = 10;

        System.out.println(i == j); // for premitive it compare the actula values

    }
}
