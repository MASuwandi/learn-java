public class NonPrimitifDataType {
    public static void main(String[] args) {

        // Code: Tipe Data Bukan Primitif
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        // Code: Konversi Dari Tipe Primitif
        int age = 30;
        Integer ageObject = age;
        int ageAgain = ageObject;

        short iniShort = ageObject.shortValue();
        byte byteAgain = ageObject.byteValue();
    }
}
