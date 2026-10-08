public class TypeConversion {

    static String  x = "caasho";
    static String y = "5";
    static String c = "7.5";


    static void fromStringToInteger () {

        int k = Integer.parseInt(y);
        System.out.println(k);
    }
    static void fromStringToDouble () {
        double k = Double.parseDouble(c);
        System.out.println(k);
    }
}
