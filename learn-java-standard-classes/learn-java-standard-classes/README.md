
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

*Implementation file /classes  : StringApp.

## Runtime Class
- 

*Implementation file /classes  : StringApp.

## UUID Class
- 

*Implementation file /classes  : StringApp.

## Base64 Class
- 

*Implementation file /classes  : StringApp.

## Objects Class
- 

*Implementation file /classes  : StringApp.

## Random Class
- 

*Implementation file /classes  : StringApp.

## Properties Class
- 

*Implementation file /classes  : StringApp.

## Arrays Class
- 

*Implementation file /classes  : StringApp.

## Regular Expression
- 

*Implementation file /classes  : StringApp.


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
