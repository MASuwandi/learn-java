
### Running app

# Install Dependency
- install all dependencies:
    go get .

- install all dependencies recursively:
    go get ./...
    go get -d ./...

... is a special pattern, tells to go down recursively.

- compile file -> generate binary file
go build filename

- run app
./filename

# Run on Dev env
go run filename

# Error not in GOROOT
old GOPATH, new Go Modules
- activate old GOPATH
go env -w GO111MODULE=off

- activate Go Modules
go env -w GO111MODULE=on

# Notes
- data type 32 -> 8
127 to -128

Progress: To Do, On Progress, Done

# ---- JAVA Topic / Subject ----: - Progress ------------#
# -------------------------------------------------------#
#  1. Dasar                     : To Do        : 61 chap #
#  2. Studi Kasus Dasar:
#       App Todolist            : To Do        :  8 chap #
#  3. OOP                       : To Do        : 16 chap #
#  4. Standard Classes          : To Do        : 28 chap #
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

### 1. JAVA Dasar

## Pengenalan Java
- need Java Virtual Machine (JVM).
- Java Binary File.
- backward compaptible

# Teknologi Java
- Java Standard Edition
- Java Enterprise Edition

# Versi Java
- LTS

# Tools / Technology
# JRE vs JDK
- JRE - Java Runtime Environment
    for Runner

- JDK - Java Development Kit
    for Develop

# Java Virtual Machine
- Java sendiri hanyalah bahasa pemrograman, otak dibalik teknologi Java sebenernya sebuah teknologi yg disebut Java Virtual Machine (JVM).
- JVM merupakan program yg digunakan untuk mengeksekusi binary file Java.
- Karena JVM hanya mengerti binary file, sehingga akhirnya banyak bahasa pemrograman yg mengadopsi teknologi JVM, seperti Kotlin, Scala, Groovy dll.
- Dengan begitu, banyak bahasa pemrograman yg lebih canggih dari Java, namun mereka tetap jalan di JVM yg sudah terbukti stabil dan bagus.

# Proses Development Program Java
         _____               _____
     -- | JDK | -        -- | JRE | --
    |    -----    |     |    -----    |
 Compile       Binary  Run           Run    
    |             |     |             |
Code Java   --> Java Binary  --> Java Archive
(file.java)     (file.class)     (file.jar)


## Menginstall Java
- Open JDK
- openjdk.java.net

# Other JDK
- Oracle JDK        : oracle.com/java/technologies/javase-downloads.html
- Amazon Corretto   : aws.amazon.com/id/corretto
- Zulu              : azul.com/downloads/zulu-community

# How to download and install prebuilt OpenJDK packages
source: openjdk.org/install/

JDK 9 & Later

Oracle's OpenJDK JDK binaries for Windows, macOS, and Linux are available on release-specific pages of jdk.java.net as .tar.gz or .zip archives.

As an example, the archives for JDK 13 may be found on jdk.java.net/13 and may be extracted on the command line using

$ tar xvf openjdk-13*_bin.tar.gz
or

$ unzip openjdk-13*_bin.zip
depending on the archive type.

# Setting PATH
- Add to .bashrc or .profile or .zshrc
export JAVA_HOME="[Java Extraction Path]/[jdk-folder-name].jdk/[to-bin-location]"
export PATH="$JAVA_HOME/bin:$PATH"

- cli
source ~/.zshrc or exec zsh -l

# Check Intallation
# Check Runtime
- java -version

openjdk version "20.0.2" 2023-07-18
OpenJDK Runtime Environment (build 20.0.2+9-78)
OpenJDK 64-Bit Server VM (build 20.0.2+9-78, mixed mode, sharing)

# Check Compiler -> JDK
- javac -version
javac 20.0.2

# Error Case:
- java -version
    The operation couldn’t be completed. Unable to locate a Java Runtime.

# Solution:
- check JAVA_HOME string

# IDE untuk Java
- Intelli JDEA Ultimate (paid):
- Intelli JDEA Community (free): 
    jetbrains.com/idea/
- Eclipse: eclipse.org/downloads/packages/
- NetBeans: netbeans.apache.org/
- JDeveloper: oracle.com/application-development/technologies/jdeveloper.html

## Program Hello World
- class name must be same as filename
- pascal case standard class name
- main function required
- ; required

# Compile Java Code
- go inside src folder
- javac filename.java // create .class file
- ls -l
- java filename or filename.java

## Tipe Data di Java
# Tipe Data Number
- Integer Number
- Floating Point Number

  - Integer Number
  Tipe Data   Min       Max     Size    Default
  byte         -128      128    1 byte  0
  short       -3x10⁴    3x10⁴   2 byte  0
  int         -2x10⁹    2x10⁹   4 byte  0
  long        -9×10¹⁸   9×10¹⁸  8 byte  0

  - Floating Point Number
  Tipe Data   Min       Max     Size    Default
  float       3.4e-038  3.4e+038  4 byte  0.0
  double      1.7e-308  1.7e+308  8 byte  0.0
  
- Notes:  
  e+308 = 10³⁰⁸

# Code: Literals
  int decimalInt  = 25;
  int hexInt      = 0xA132B;      // start with 0x
  int binInt      = 0b01010101;   // start with 0b

# Code: Underscore
  long  balance   = 1_000_000_000_000L;
  int   sum       = 60_000_000;

# Konversi Tipe Data Number
- Widening Casting (Otomatis): byte -> short -> int -> long -> float -> double
- Narrowing Casting (Manual): double -> float -> long -> int -> chat -> short -> byte

Notes:
When doing Manual Conversion
Care for Number Overflow

# Tipe Data Character
- Data Character (huruf) di Java direpresentasikan oleh tipe char.
- Untuk membuat data char di Java, kita bisa menggunakan tanda ' (petik satu) di awal dan di akhir karakter.

# Tipe Data Boolean
- Tipe Data boolean adalah tipe data yg memiliki 2 nilai, yaitu benar dan salah.
- Tipe data boolean di Java direpresentasikan dengan kata kunci boolean.
- Nilai benar direpresentasikan dengan kata kunci true.
- Nilai salah direpresentasikan dengan kata kunci false.
- Default value untuk boolean adalah false.

# Tipe Data String
- Tipe data String adalah tipe data yg berisikan data kumpulan karakter atau sederhananya adalah teks.
- Di Java, tipe data String direpresentasikan dengan kata kunci String.
- Untuk membuat String di Java, kita menggunakan karakter " (petik dua) sebelum dan setelah teks nya.
- Default value untuk String adalah null.

# Variable
- Variable adalah tempat untuk menyimpan data.
- Java adalah bahasa static type, sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yg sama, tidak bisa berubah-ubah tipe data seperti di bahasa pemrograman PHP atau JavaScript.
- Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variable nya.
- Nama variable tidak boleh mengandung whitespace (spasi, entern tab), ,dan tidak boleh seluruhnya number.

# Kata Kunci var
- Sejak versi Java 10, Java mendukung pembuatan variabel dengan kata kuncu var, sehingga kita tidak perlu menyebutkan tipe datanya.
- Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variable, kita harus menginisiasi value / nilai dari variabel tersebut secara langsung.

# Kata Kunci final
- Secara default, variable di Java bisa diubah-ubah nilainya.
- Jika kita ingin membuat sebuah variable yg datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci final.
- Istilah variable seperti ini, banyak juga yg menyebutnya konstan.

# Tipe data Bukan Primitif
- Tipe data primitif adalah tipe data bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi.
- Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value.
- Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null.
- Tipe data bukan primitif bisa memiliki method / function (yg akan dibahas nanti).
- Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitif nya.

# Representasi Tipe Data Primitif
Tipe Data Primitif      Tipe Data Bukan Primitif
-------------------------------------------------
byte                    Byte
short                   Short
int                     Integer
long                    Long
float                   Float
double                  Double
char                    Character
boolean                 Boolean

Notes:
- Tipe Data Bukan Primitif has method for conversion.

# Tipe Data Array
- Array adalah tipe data yg berisikan kumpulan data dengan tipe yg sama.
- Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat.

index 0 - 9
length 10

# Operasi di Array
Operasi Array           Keterangan
-------------------------------------------------
array[index]            Mengmbil data di array
array[index] = value    Mengubah data di array
array.length            Mengambil panjang array


## Operator
# Operasi Matematika
+, -, *, /, %

- Augmented Assignments
- +=, -=, *=, /=, %=

- Unary Operator
- ++, --, -n, +n, !n

# Operasi Perbandingan
- Operasi perbandingan operasi untuk membandingkan dua buah data.
- Operasi perbandingan operasi yg menghasilkan nilai boolean (true or false).
- Jika hasil operasinya benar, maka nilainya adalah true.
- Jika hasil operasinya salah, maka nilainya adalah false.

- Operator Perbandingan
- >, <, >=, <=, ==, !=

# Operasi Boolean
Operator    Keterangan
 &&          Dan
 ||          Atau
 !           Kebalikan

# Expression, Statement dan Block
# Expression
- Expression adalah konstruksi dari variable, operator dan pemanggilan method yg mengevaluasi menjadi sebuah single value.
- Expression adalah core component dari statement.

# Statement
- Statement bisa dibilang kalimat lengkap dalam bahasa.
- Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titi koma.
- Ada beberapa jenis statement:
  - Assignment expression
  - Penggunaan ++ dan --
  - Method invocation
  - Object creation expression

# Block
- BLock adalah kumpulan statement yg terdiri dari nol atau lebih statement.
- Block diawali dan diakhiri dengan kurung kurawal / curly bracket {}.

## Percabangan / Brancing
# If Statement
- Di Java, if adalah salah satu kata kunci yg digunakan untuk percabangan.
- Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi.

# Else Statement
- Blok if akan dieksekusi ketika kondisi if bernilai true
- Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false.
- Hal ini bisa dilakukan menggunakan else expression.

# Else If Statement
- Kadang dalam If, kita butuh membuat beberapa kondisi.
- Kasus seperti ini, di Java kita bisa menggunakan ELse If expression.
- Else if di Java bisa lebih dari satu.

# Switch Statement
- Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==.
- Switch adalah statement percabangan yg sama dengan if, namun lebih sederhana cara pembuatannya.
- Kondisi di switch statement hanya untuk perbandingan ==.

# Switch Lambda
- Di Java versi 14, diperkenalkan switch expression dengan lambda.
- Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break.

# Kata Kunci Yield
- Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch statement.
- Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement.

# Ternary Operator
- Ternary operator adalah operator sederhana dari if statement.
- Ternary operator terdiri dari kondisi yg dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua diambil.


## Perulangan
# For Loop
- For adalah salah satu kata kunci yg bisa digunakan untuk melakukan perulangan.
- Blok kode yg terdapat di dalam for akan selalu diulang selama kondisi for terpenuhi.

# Sintaks Perulangan For
for(init statement; kondisi; post statement) {
    // block perulangan
}

- Init statement akan dieksekusi hanya sekali di awal sebelum perulangan.
- Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan berhenti.
- Post statement akan dieksekusi setiap kali diakhir perulangan.
- Init statement, Kondisi dan Post Statement tidak wajib diisi, jika Kondisi tidak diisi, berarti kondisi selalu bernilai true.

# While Loop
- While loop adalah versi perulangan yg lebih sederhana dibanding for loop.
- Di while loop, hanya terdapat kondisi perulangan, tanpa ada init statement dan post statement.

# Do While Loop
- Do While loop adalah perulangan yg mirip dengan while.
- Perbedaannya hanya pada pengecekan kondisi.
- Pengecakan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan, sedangkan di do while loop dilakukan setelah perulangan dilakukan.
- Oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai true.

## Break dan Continue
- Break digunakan untuk menghentikan seluruh perulangan.
- Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini lalu melanjutkannya ke perulangan selanjutnya.

## For Each
- Kadang kita biasa mengakses data array menggunakan perulangan.
- Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses array menggunakan counter yg kita buat.
- Namun untungnya, di Java terdapat perulangan for each, yg bisa digunakan untuk mengakses seluruh data di Array secara otomatis.

## Method
- Method adalah block kode program yg akan berjalan saat kita panggil.
- Sebelumnya kita sudah menggunakan method println() untuk menampilkan tulisan di console.
- Untuk membuat method di Java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama method, kurung () dan diakhiri dengan block.
- Kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung ().
- Di bahasa pemrograman lain, Method juga disebut dengan Function.

Notes:
- method name use camelcase
- method can only call / execute other method with the same type.
    ex type: static

# Method Parameter / Argument

# Method Return Value
- Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat sebuah method mengembalikan nilai.
- Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yg dihasilkan.
- Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci returnm lalu diikuti dengan data yg sesuai dengan tipe data yg sudah kita deklarasikan di method.
- Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu.

# Method Variable Argument
- Kadang kita butuh mengirim data ke method sejumlah data yg tidak pasti.
- Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut.
- Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yg berisi jumlah tak tentu, bisa nol atau lebih.
- Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter.

# Method Overloading
- Method overloading adalah kemampuan membuat method dengan nama yg sama lebih dari sekali.
- Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda, entah jumlah atau tipe data parameternya.
- Jika ada yg sama, maka program Java kita akan error.

# Recursive Method
- Recursive method adalah kemampuan method memanggil method dirinya sendiri.
- Kadang memang ada banyak problem, yg lebih mudah diselesaikan menggunakan recursive method, seperti contohnya kasus factorial.

# Problem Dengan Recursive
- Walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati.
- Jika recursive terlalu dalam, maka akan ada kemungkinan terjadi error StackOverflow, yaitu error dimana stack method terlalu banyak di Java.
- Kenapa problem ini bisa terjadi? Karena ketika kita memanggil method, Java akan menyimpannya dalam stack, jika method tersebut memanggil method lain, maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan error StackOverflow.

## Scope
- Di Java, variable hanya bisa diakses di dalam area dimana mereka dibuat.
- Hal ini disebut scope.
- Contoh, jika sebuah variable dibuat di method, maka hanya bisa diakses di method tersebut, atau jika dibuat didalam block, maka hanya bisa diakses didalam block tersebut.

## Komentar
- Kadang dalam membuat program, kita sering menempatkan komentar di kode program tersebut.
- Komentar adalah kode program yg akan di hiraukan saat proses compile, sehingga di binary code Java, tidak akan ada kode komentar tersebut.
- Biasanya komentar digunakan untuk dokumentasi.

Multi Line                  : /* content */
                            -> /* + enter
    1. make function first
    2. type above function  -> /** + enter


Single Line                 : //


### 2. Studi Kasus Java Dasar: Aplikasi Todolist
## Membuat Project
- Prototype adalah bentuk dasar dari sebuah aplikasi.
- Saat pertama kali kita membuat aplikasi, sangat disarankan untuk membuat prototype nya terlebih dahulu.
- Prototype bisa kita gunakan agar mudah memahami flow aplikasi yg akan kita buat, sehingga tidak salah ketika membuat aplikasi.
- Dari prototype juga kita bisa melihat data apa yg dibutuhkan, business logic apa yg dibutuhkan, dan seperti apa tampilan aplikasi yg akan kita buat.

ex: UI/UX
    xd.adobe, figma

## Membuat Main Class

## Membuat Model
- Model / Representasi Data
1. text todolist
2. input nambah data secara dynamic

## Menentukan Business Logic
1. Menampilkan todolist
2. Menambah todolist
3. Menghapus todolist

## Menentukan View
## Menampilkan Todolist
## Test Menampilkan Todolist
## Menambah Todolist
## Test Menambah Todolist
## Menghapus Todolist
## Test menghapus Todolist
## Input Data
## View Menampilkan Todolist
## Test View Menampilkan Todolist
## View Menambah Todolist
## Test View Menambah Todolist
## View Menghapus Todolist
## Test View Menghapus Todolist
## Test Seluruh Aplikasi


### 3. Java Object Oriented Programming
## Pengenalan OOP
- Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

- OOP merupakan sudut pandang bahasa pemrograman yg berkonsep "object".
- Ada banyak sudut pandang bahasa pemrograman, namun OOP adalah yg sangat populer saat ini.
- Ada beberapa istilah yg perlu dimengerti dalam OOP, yaitu: Object dan Class.

## Object
- Object adalah data yg berisi field / properties / attrubutes dan method / function.
- Semua data bukan primitif di Java adalah object, dari mulai Integer, Boolean, Character, String, dll.
- Tipe object punya method.

## Class
- Class adalah blueprint, prototype atau cetakan untuk membuat Object.
- Class berisikan deklarasi semua properties dan functions yg dimiliki oleh Object.
- Setiap Object selalu dibuat dari Class.
- Dan sebuah Class bisa membuat Object tanpa batas.

# Class dan Object:
- Object created from blueprint / class.
- Object is independent, no relation with other object.
- from object can call method which class have.

# Membuat Class
- Untuk membuat class, kita bisa menggunakan kata kunci class.
- Penamaan class biasa menggunakaan format Pascal Case.

## Field

## Method

## Constructor
## Constructor Overloading
## Variable Shadowing
## this Keyword

## Inheritance

## Method Overriding
## super Keyword
## Super Constructor
## Object Class
## Polymorphism
## Type Check dan Casts
## Variable Hiding
## Package
## Access Modifier
## Import
## Abstract Class
## Abstract Method
## Getter dan Setter

## Interface

## Interface Inheritance
## Default Method
## toString() Method
## equals() Method
## hashCode() Method
## Final Class
## Final Method
## Inner Class
## Anonymous Class
## static Keyword
## Record Class

## Enum Class

## Exception

## Runtime Exception
## Error
## StackTraceElement Class
## Try with Resource
## Annotation
## Reflection

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

# Package
os, flag, strings, strconv, math,
container list, container ring,
sort, time, reflec, regexp

## Enable gopls
cd current project root
- empty go work
go work init

- go.work with contains
go work use ./repo1 ./repo2

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

