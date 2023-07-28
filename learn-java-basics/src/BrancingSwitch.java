public class BrancingSwitch {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Lulus dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Lulus Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
        }

        // Switch Lambda
        switch (nilai) {
            case "A" -> System.out.println("Lulus dengan Baik");
            case "B", "C" -> System.out.println("Lulus Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda salah jurusan");
            }
        }

        // Tanpa Yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Lulus dengan Baik";
            case "B", "C" -> ucapan = "Lulus Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda salah jurusan";
            }
        }

        // Dengan Yield
        ucapan = switch (nilai) {
            case "A": yield "Lulus dengan Baik";
            case "B", "C": yield "Lulus Cukup Baik";
            case "D": yield "Anda Tidak Lulus";
            default: {
                yield "Mungkin Anda salah jurusan";
            }
        };

        System.out.println(ucapan);
    }
}
