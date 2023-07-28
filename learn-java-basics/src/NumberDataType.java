public class NumberDataType {
    public static void main(String[] args) {

        // Integer Number
        byte  iniByte  = 100;
        short iniShort = 3 * 10_000;
        int   iniInt   = 2 * 1_000_000_000;
        long  iniLong  = 9 * 1_000_000_00;
        long  iniLong2 = 9000000000000000000L;

        /*
            # without L cant make
            - 9 * 10^18
            - 8 zeros max
        */

        // Floating Point Number
        float   iniFloat = 10.12F;  // max 38 num after .
        double iniDouble = 12.2424; // max 308 num after .

        // Code: Literals
        int decimalInt  = 25;
        int hexInt      = 0xA132B;      // start with 0x
        int binInt      = 0b01010101;   // start with 0b

        // Code: Underscore
        long  balance   = 1_000_000_000_000L;
        int   sum       = 60_000_000;

    }
}
