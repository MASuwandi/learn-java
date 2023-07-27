
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
- Semua number class yg bukan primitif memiliki parent class yg sama, yaitu class Number.
- Class Number memiliki banyak method yg bisa digunakan untuk mengkonversi ke tipe Number lain.
- Hal ini memudahkan kita untuk mengkonversi object Number dari satu tipe ke tipe number lainnya.
- docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Number.html

*Implementation file /classes  : StringApp.

## Math Class
- 

*Implementation file /classes  : StringApp.

## BigNumber Class
- 

*Implementation file /classes  : StringApp.

## Scanner Class
- 

*Implementation file /classes  : StringApp.

## Date dan Calendar Class
- 

*Implementation file /classes  : StringApp.

## System Class
- 

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
-

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
