public class BooleanOperation {
    public static void main(String[] args) {

        int absen = 70;
        int nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        var lulus2 = lulusAbsen || lulusNilai;
        var lulus3 = !lulusAbsen && !lulusNilai;

        System.out.println("lulus: " + lulus);
    }
}
