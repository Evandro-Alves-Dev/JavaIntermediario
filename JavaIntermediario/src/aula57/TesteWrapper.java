package aula57;

public class TesteWrapper {

    public static void main(String[] args) {

        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 1000l;
        float num5 = 3.5f;
        double num6 =  3.555;
        boolean flag = true;
        char a = 'a';

        Short num7 = new Short((short) num1);
        Byte num8 = new Byte((byte) num2);
        Integer num9 = new Integer(100);
        Long num10 = new Long(1000l);
        Float num11 = new Float(3.5f);
        Double num12 = new Double(3.555);
        Boolean flag2 = new Boolean(true);
        Character b = new Character('b');

        Integer num13 = new Integer("1000");

        Long num14 = num11.longValue();

        System.out.println(num13);
        System.out.println(num14);

        double num15 = Double.parseDouble("510");
        System.out.println(num15);

        int num16 = Integer.valueOf("152");
        System.out.println(num16);

    }
}
