
public class NumberConversion {
    public static void main(String[] args) {

        // Code: Konversi Tipe Data Number
        byte   iniByte   = 10;
        short  iniShort  = iniByte;
        int    iniInt    = iniShort;
        long   iniLong   = iniInt;
        float  iniFloat  = iniLong;
        double iniDouble = iniFloat;

        // When Manual Conversion
        // Care for Number Overflow
        float  iniFloat2 = (float) iniDouble;
        long   iniLong2 = (long) iniFloat2;
        int    iniInt2 = (int) iniLong2;
        short  iniShort2 = (short) iniInt2;
    }
}