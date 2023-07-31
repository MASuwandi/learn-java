
### Running app

# Install Dependency

# Run on Dev env

# Notes

Progress: To Do, On Progress, Done

# ---- JAVA Topic / Subject ----: - Progress ------------#
# -------------------------------------------------------#
#  4. Standard Classes          : On Progress  : xx chap #
# -------------------------------------------------------#


<details>
<summary>### 1. Go Dasar</summary>
<br>
<!-- EOL 245 -->

### 4. Java Standard Classes

## String Class
- Seperti yg pernah dibahas di materi Java Dasar, String adalah object, artinya dia memiliki representasi class nya.
- Ada banyak sekali method yg bisa kita gunakan di String, kita bisa melihat detail method apa saja yg tersedia di halaman dokumentasi javadoc nya.

- docs.oracle.com/en/javase/14/docs/api/java.base/java/lang/String.html
- docs.oracle.com/en/javase/20/docs/api/java.base/java/lang/String.html

# Method di String Class
Method                  | Keterangan
String toLowerCase()    | Membuat string baru dengan format lower case
String toUpperCase()    | Membuat string baru dengan format upper case
int length()            | Mendapatkan panjang string
boolean startsWith()    | Mengecek apakah dimulai dengan string value
boolean endsWith()      | Mengecek apakah diakhiri dengan string value
String[] split()        | Memotong string dengan string value

check String class

*Implementation file /classes  : StringApp.

## StringBuffer dan StringBuilder Class
# Immutable String
- String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string. sebenarnya yg dilakukan di Java adalah membuat String baru.
- Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan String, karena akan memakan memory yg cukup besar, untuk kasus seperti ini, disarankan menggunakan StringBuffer atau StringBuilder.

# StringBuffer vs StringBuilder
- Kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunakan untuk memanipulasi String.
- Yang membedakan adalah, StringBuffer itu thread safe, sedangkan StringBuilder tidak thread safe.
- Jika kita ingin memanipulasi String secara paralel bersamaan, disarankan menggunakan StringBuffer, namu jika tidak butuh paralel, cukup gunakan StringBuilder.
- Karena StringBuffer dibuat agar thread save, maka secara otomatis performanya lebih lambat dibandingkan StringBuilder.

- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuffer.html
- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuilder.html

StringBuffer : diakses paralel / diakses banyak accessor.
StringBuilder: tidak bisa paralel akses.

*Implementation file /classes  : StringApp.

# Code: Menggunakan StringBuilder
*Implementation file /classes  : StringBuilderApp.

## StringJoiner Class
- StringJoiner adalah class yg bisa digunakan untuk membuat String sequence yg dipisahkan dengan delimiter.
- StringJoiner juga mendukung prefix dan suffix jika kita ingin menambahkannya.
- Ini sangat bagus ketika ada kasus misal kita ingin mem-print Array dengan format yg kita mau misalnya.
- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/StringJoiner.html

# Code: String Joiner
- take huge memory if text size big
- new StringJoiner(", ", "[", "]");
*Implementation file /classes  : StringJoinerApp.

## StringTokenizer Class
# Code: StringTokenizer Class
- prudent memory consume compare to split
- lazy process
*Implementation file /classes  : StringTokenizerApp.

## Number Class
- Semua number class yg non-primitif memiliki parent class yg sama, yaitu class Number.
- Class Number memiliki banyak method yg bisa digunakan untuk mengkonversi ke tipe Number lain.
- Hal ini memudahkan kita untuk mengkonversi object Number dari satu tipe ke tipe number lainnya.
- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Number.html

# Method di Number Class
Method               |   Keterangan
- - - - - - - - - - - - - - - - - - - - - - - - - - - -
byte byteValue()     | Mengubah menjadi tipe byte
double doubleValue() | Mengubah menjadi tipe double
float floatValue()   | Mengubah menjadi tipe float
int intValue()       | Mengubah menjadi int value
long longValue()     | Mengubah menjadi long value
short shortValue()   | Mengubah menjadi short value

*Implementation file /classes  : NumberApp.

# Konversi String ke Number
- Long, Integer, Short dan Byte memiliki static method untuk melakukan konversi dari String ke number.
- parseXxx(string) digunakan untuk mengkonversi dari string ke tipe data number primitif.
- valueOf(string) digunakan untuk mengkonversi dari string ke tipe data number non-primitif.
- Method ini akan throw NumberFormatException jika ternyata gagal melakukan konversi String ke number.

ex: parseLong(string)

## Math Class
- Class Math merupakan class utilities yg berisikan banyak sekali static method untuk operasi numerik, seperti trigonometric, logarithm, akar pangkat, dll.
- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Math.html

# Method di Math Class
Method               |   Keterangan
- - - - - - - - - - - - - - - - - - - - - - - - - - - -
double cos(double)   | Menghitung cos di trigonometric
double sin(double)   | Menghitung sin di trigonometric
double tan(double)   | Menghitung tan di trigonometric
mix(number1, number2)| Mengambil nilai terkecil
max(number1, number2)| Mengambil nilai terbesar
...dll

*Implementation file /classes  : MathApp.

## BigNumber Class
- Jika kita ada kebutuhan untuk menggunakan angka yg besar sehingga melebihi kapasitas Long dan Double, di Java sudah disediakan class untuk handle data besar tersebut.
- BigInteger adalah class untuk handle tipe data Integer, dan
- BigDecimal adalah class untuk handle tipe data floating point

- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/math/BigInteger.html
- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/math/BigDecimal.html

# Method di BigInteger & BigDecimal
Method     | Keterangan
- - - - - - - - - - - - -
add        | +
subtract   | -
multiply   | *
divide     | /
mod        | %
...dll

*Implementation file /classes  : BigNumberApp.

## Scanner Class
- Scanner sebenarnya bagian dari Java IO (Input Output), dan ini akan dibahas di materi terpisah.
- Namun sekarang kita akan bahas sekilas tentang class Scanner.
- Class Scanner hadir sejak Java 5
- Class Scanner adalah class yg bisa digunakan untuk membaca input, entah dari file, console, dll.
- Class Scanner ini cocok untuk dijadikan object untuk membaca input user saat kita belajar membuat program Java menggunakan console / terminal.
- docs.oracle.com/en/java/javese/14/docs/api/java.base/java/util/Scanner.html

# Method di Scanner Class
Method          | Keterangan
- - - - - - - - - - - - -
nextLine()      | Membaca string
nextInt()       | Membaca int
nextLong()      | Membaca long
nextBoolean()   | Membaca boolean
...dll

*Implementation file /classes  : ScannerApp.

## Date dan Calendar Class
- Tiap bahasa pemrograman biasanya memiliki representasi tanggal, di Java juga sama, ada class Date & Calender yg bisa kita gunakan sebagai representasi tanggal.
- Sebenarnya di Java 8 sudah ada cara manipulasi tanggal yg baru menggunakan Java Date Time API, namun itu akan kita bahas di course terpisah.
- Sekarang kita akan fokus menggunakan class Date dan Calender.

# Hubungan Date dan Calendar
- Class Date adalah class representasi tanggal sampai presisi milisecond.
- Namun di class Date sudah banyak method-method yg di deprecated, sehingga untuk memanipulasi date tanggal, kita sekarang harus melakukan kombinasi antara class Date dan Calendar.
- Sederhananya Date untuk representasi tanggal, dan Calendar untuk memanipulasi tanggal.

- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Date.html
- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Calendar.html

- a lot of function Deprecated
- 
# Code : Menggunakan Date
- milisecond format input
- planetcalc

# Code: Menggunakan Calendar

*Implementation file /classes  : DateApp.

## System Class
- Class System adalah class yg berisikan banyak utility static method di Java, contohnya sebelum kita sudah sering menggunakan method printLn milik field out di class System.

- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/System.html

# Method di System Class
Method                  | Keterangan
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
String getenv(key)      | Mendapatkan environtment variable sistem operasi
void exit(status)       | Menghentikan program Java
long currentTimeMilis() | Mendapatkan waktu saat ini dalam milisecond
long nanoTime()         | Mendapatkan waktu saat ini dalam nanosecond
void gc()               | Menjalankan Java garbage collection
...dll

check env : run env
add env through Intellij : Recent Configuration -> edit config -> choose file -> environtment variables -> +

*Implementation file /classes  : SystemApp.

## Runtime Class
- Ketika aplikasi Java kita berjalan, kita bisa melihat informasi environment tempat aplikasi Java berjalan.
- Informasi itu terdapat di class Runtime.
- Class Runtime tidak bisa dibuat, secara otomatis Java akan membuat single object. Kita bisa mengakses object tersebut menggunakan static method getRuntime() milik class Runtime.

- docs.oracle.com/en/java/14/docs/api/java.base/java/lang/Runtime.html

# Method di Runtime Class
Method                    | Keterangan
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
int availableProcessors() | Mendapatkan jumlah core cpu
long freeMemory()         | Mendapatkan jumlah memory bebas di JVM
long totalMemory()        | Mendapatkan jumlah total memory di JVM
long maxMemory()          | Mendapatkan jumlah max memory di JVM
void gc()                 | Menjalankan garbage collector untuk menghilangkan data di memory yg sudah tidak terpakai.

*Implementation file /classes  : RuntimeApp.

## UUID Class
- Saat membuat aplikasi, kadang kita ada kasus ingin membuat data unique, misal untuk kebutuhan data primary key misalnya.
- Java menyediakan sebuah class UUID atau singkatan dari Universally Unique Identifier.
- UUID adalah format standard untuk membuat unique value yg telah terjamin.

- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/UUID.html
- ietf.org/rfc/rfc4122.txt

*Implementation file /classes  : UUIDApp.

## Base64 Class
- Sejak Java 8, Java sudah menyediakan class untuk melakukan encoding base64.
- Buat programmer web pasti tahu tentang base64, yaitu encoding yg bisa digunakan untuk mengubah binary data ke text yg aman.
- Aman disini bukan dari sisi security, tapi aman dari kesalahan parsing.

- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Base64.html
- ietf.org/rfc/rfc4648.txt

*Implementation file /classes  : Base64App.

## Objects Class
- Awas jangan tertukar, ini class Objects, bukan Object.
- Objects adalah class utility yg berisikan banyak static method yg bisa kita gunakan untuk operasi object atau melakukan pengecekan sebelum operasi nya dilakukan.

- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Objects.html

*Implementation file /classes  : ObjectsApp.

## Random Class
- Random class adalah class yg bisa kita gunakan untuk men-generate Random number.

docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Random.html

*Implementation file /classes  : RandomApp.

## Properties Class
# Properties File
- Kebanyakan aplikasi Java akan menyimpan konfigurasi file dalam bentuk properties file.
- Properties file adalah file yg berisi key value yg dipisahkan dengan tanda sama dengan (=).
- Properties file bisa kita gunakan untuk menyimpan konfigurasi aplikasi kita.

# Best Practice
don't store app config in the source code, save external in file form.

# Properties Class
- Properties Class adalah class yg bisa kita gunakan untuk mengambil atau menyimpan informasi ke file properties.

- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Properties.html

# case:
1. properties file not located:
   - properties location: /project/file.properties
2. success
    - properties location: /file.properties

*Implementation file /classes  : PropertiesApp. 

## Arrays Class
- Arrays class adalah class yg berisikan static method yg bisa kita gunakan untuk memanipulasi data array, seperti pencarian dan pengurutan.

- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Arrays.html

Method                     | Keterangan
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
binarySearch(array, value) | Mencari value di array
copyOf(...)                | Menyalin data array
equals(array1, array2)     | Membandingkan array1 dan array2
sort(array)                | Mengurutkan array
toString(array)            | Mengembalikan representasi string
...dll

*Implementation file /classes  : ArraysApp.

## Regular Expression
- Regular Expression atau disingkat regex adalah cara untuk melakukan pola pencarian.
- Biasanya dilakukan untuk pencarian dalam data String.
- Secara sederhana, kita mungkin sudah sering melakukan pencarian text, entah di text editor atau di aplikasi word.
- Regex adalah pencarian yg lebih advanced dibandingkan pencarian text biasanya, misal kita ingin mencari semua kata yg mengandung diawali huruf a dan diakhiri huruf a, dll.

# Regex Package
- Java sudah menyediakan package java.util.regex yg berisikan utilitas untuk melakukan proses regular expression.
- Secara garis besar terdapat 2 class yg dapat kita gunakan, yaitu Pattern class dan Matcher class.
- Pattern class adalah representasi hasil kompilasi dari pola reguler expression yg kita buat.
- Matcher class adalah engine unruk melakukan pencarian dari pattern yg sudah kita buat.

- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/regex/Pattern.html

*Implementation file /classes  : RegexApp.


### Materi Selanjutnya
- Object Oriented Programming
- Standard Classes
- Generic
- Collection
- Lambda
- Apache Maven
- Unit Test
- Stream

### Noted Feature:
- can check method or class detail in structure

### 1. end
<!-- SOL 50 -->
</details>

### Error
if is already define, retype, comment -> uncomment.

### IntelliJ Shortcut Key
- Soft-wrap     : ⌘ ⇧ A    -> cmd  + shift  + A
- Reformat Code : ⌘ ⌥ L    -> cmd  + option + L
- Increase Font : ^ ⇧ .    -> ctrl + shift  + .
- Terminal      : ⌥ fn f12 -> option + fn + f12


### Snippet Trigger
## Java Intellij Snipet
    - main class    : psvm
    - println       : sout
    - 
