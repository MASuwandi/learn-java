
### Running app

# Install Dependency

Progress: To Do, On Progress, Done

# ---- JAVA Topic / Subject ----: - Progress ------------#
# -------------------------------------------------------#
#  1. Dasar                     : Done         : 61 chap #
#  2. Studi Kasus Dasar:
#       App Todolist            : Done         :  8 chap #
#  3. OOP                       : Done         : 16 chap #
#  4. Standard Classes          : On Progress  : 28 chap #
#  5. Studi Kasus OOP:                                   #
#       App Todolist            : To Do        :  9 chap #
#  6. Generic                   : To Do        : 15 chap #
#  7. Collection                : To Do        :  8 chap #
#  8. Lambda                    : To Do        : 29 chap #
#  9. Apache Maven              : To Do        : 11 chap #
# 10. Unit Test                 : To Do        : 11 chap #
# 11. Stream                    : To Do        : 11 chap #
# 12. Database                  : To Do        : 11 chap #
# 13. Studi Kasus Database:                              #
#       App Todolist            : To Do        : 11 chap #
# 14. Internationalization      : To Do        : 11 chap #
# 15. Date & Time               : To Do        : 11 chap #
# 16. Thread                    : To Do        : 11 chap #
# 17. Reflection                : To Do        : 11 chap #
# 18. Validation                : To Do        : 11 chap #
# 19. Logging                   : To Do        : 11 chap #
# 20. Lombok                    : To Do        : 11 chap #
# 21. Resilience 4J             : To Do        : 11 chap #
# 22. Input Output              : To Do        : 11 chap #
# 23. JSON                      : To Do        : 11 chap #
# 24. CSV                       : To Do        : 11 chap #
# 25. Web Servlet               : To Do        : 11 chap #
#     GRaphQL                   : To Do                  #
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
- Hal ini memudahkan kita untuk mengkonversi obje

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

### IntelliJ IDEA Guide
- Soft-wrap     : ⌘ ⇧ A    -> cmd  + shift  + A
- Reformat Code : ⌘ ⌥ L    -> cmd  + option + L
- Increase Font : ^ ⇧ .    -> ctrl + shift  + .
- Terminal      : ⌥ fn f12 -> option + fn + f12


### Snippet Trigger
## Java
    - main class    : psvm
    - println       : sout
    - 

## Progress Java:
# Objective: 3,720 minutes
# Remaining: 3,453
# Progress: 267

# Jul:
Fri 21: 104
Sat 22: 117
Sun 23: 46

Mon 24: 
Tue 25: 
Wed 26: 
Thu 27: 
Fri 28: 
Sat 29: 
Sun 30: 

Mon 31: 

# Aug:
Tue 1: 
Wed 2: 
Thu 3: 
Fri 4: 
Sat 5: 
Sun 6: 

