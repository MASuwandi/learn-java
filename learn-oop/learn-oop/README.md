
### Running app

# Install Dependency

# Run on Dev env

# Error not in GOROOT

# Notes

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
<summary>### 3. Java Object Oriented Programming</summary>
<br>
<!-- EOL 245 -->

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

*Implementation file: Person.

# Membuat Object
- Object adalah hasil instansiasi dari sebuah class.
- Untuk membuat object kita bisa menggunakan kata kuci new, dan diikutin dengan nama Class dan kurung().

*Implementation file: Person, PersonApp.

## Field
- Field / Properties / Attributes adalah data yg bisa kita sisipkan di dalam Object.
- Namun sebelum kita bisa memasukkan data di fields, kita harus mendeklarasikan data apa saja yg dimiliki object tersebut di dalam deklarasi class-nya.
- Membuat field sama seperti membuat variable, namun ditempatkan di block class.

*Implementation file: Person.

# Manipulasi Field
- Field yg ada di object, bisa kita manipulasi. Tergantung final atau bukan.
- Jika final, berarti kita tidak bisa mengubah data field nya, namun jika tidak, kita bisa mengubah field nya.
- Untuk memanipulasi data field, sama seperti cara pada variable.
- Untuk mengakses field, kita butuh kata kunci . (titik) setelah nama object dan diikuti nama field nya.

*Implementation file: Person, PersonApp.

## Method
- Selain menambahkan field, kita juga bisa menambahkan method ke object.
- Caranya dengan mendeklarasikan method itu di dalam block class.
- Sama seperti di method yg ada di dalam block class.
- Untuk mengakses method itu, kita bisa menggunakan tanda titik (.) dan diikuti dengan nama method nya. Sama seperti mengakses field.

*Implementation file: Person, PersonApp.

# access
- person1.walk;

# run
- person1.walk();

## Constructor
- Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung ().
- Di dalam class Java, kita bisa membuat constructor, constructor adalah method yg akan dipanggil saat pertama kali Object dibuat.
- Mirip seperti di method, kita bisa memberi parameter pada constructor.
- Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value.

*Implementation file: Person, PersonApp.

# Constructor Overloading
- Sama seperti di method, di constructor pun kita bisa melakukan overloading.
- Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda, atau jumlah parameter harus berbeda.

# Memanggil Constructor lain
- Constructor bisa memanggil constructor lain.
- Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan.
- Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method, namun dengan kata kunci this.

ex: in Person class
Person(String paramName) {
  this(paramName, null);
}

## Variable Shadowing
- Variable shadowing adalah kejadian ketika kita membuat nama variable dengan nama yg sama di scope yg menutupi variable dengan nama yg sama di scope diatasnya.
- Ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama field di class.
- Saat terjadi variable shadowing, maka secara otomatis variable di scope diatanya tidak bisa diakses.

*Implementation file: Person, PersonApp.

## this Keyword
- Saat kita membuat kode di dalam block constructor atau method di dalam class, kita bisa menggunakan kata kunci this untuk mengakses object saat ini.
- Misal kadang kita butuh mengakses sebuah field yg namanya sama dengan parameter method, hal ini tidak bisa dilakukan jika langsung menyebut nama field, kita bisa mengakses nama field tersebut dengan kata kunci this.
- This juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan untuk mengakses method.
- This bisa digunakan untuk mengatasi masalah variable shadowing.

- Object saat ini: instance yg telah dibuat.

*Implementation file: Person, Computer.

## Inheritance
- Inheritance adalah kemamppuan untuk menurunkan sebuah class ke class lain.
- Dalam artian, kita bisa membuat class Parent dan class Child.
- Class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class Child.
- Saat sebuah class diturunkan, maka semua field dan method yg ada di class Parent, secara otomatis akan dimiliki oleh class Child.
- Untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci extends lalu diikuti dengan nama class parent nya.

*Implementation file: Manager, VicePresident, ManagerApp.

## Method Overriding
- Method overriding adalah kemampuan mendeklarasikan ulang method di child class, yg sudah ada di parent class.
- Saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object dari class child, method yg di class parent tidak bisa diakses lagi.

# Method Overloading
- Method overloading adalah kemampuan mendeklarasikan ulang method dengan nama yg sama dengan tipe parameter, atau jumlah parameter yg berbeda di class yg sama.

*Implementation file: Manager, VicePresident, ManagerApp.

## super Keyword
- Kadang kita ingin mengakses method yg terdapat di class parent yg sudah terlanjur kita override di class child.
- Untuk mengakses method milik class parent, kita bisa menggunakan kata kunci super.
- Sederhananya, super digunakan untuk mengakses class parent.
- Tidak hanya method, field milik parent class pun bisa kita akses menggunakan kata kunci super.

ex: super.getCorner(), super.name

*Implementation file: Shape, ShapeApp.

## Super Constructor
- Tidak hanya untuk mengakses method atau field yg ada di parent class, kata kunci super juga bisa digunakan untuk mengakses constructor.
- Namun syarat untuk mengakses parent class constructor, kita harus mengaksesnya di dalam class child constructor.
- Jika sebuah class parent memiliki constructor yg ada parameter nya, maka class child wajib mengakses constructor class parent tersebut.
- Default constructor Person() {}

ex: in manager and vp
Person(String name) {
    super(null);
}

*Implementation file: Manager, VicePresident, ManagerApp.

## Object Class
- Di Java, setiap class yg kita buat secara otomatis adalah turunan dari class Object.
- Walaupun tidak secara langsung kita eksplisit menyebutkan extends Object, tapi secara otomatis Java akan membuat class kita extends Object.
- Bisa dikatakan class Object adalah superclass untuk semua class yg ada di Java.

- Bisa mengakses method milik super class / parent object.
ex:
- instance.toString()

shift x 2 -> class -> Object

*Implementation file: Object.java, ManagerApp.

## Polymorphism
- Polymorphism berasal dari bahasa Yunani yg berarti banyak bentuk.
- Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain.
- Polymorphism erat hubungannya dengan Inheritance.

ex: Instance Object yg di generate dari class yg berbeda bisa menggunakan satu tipe variable class yg sama, yaitu tipe dari ancestor class tersebut.

# Method Polymorphism
- dengan begitu bisa menggunakan static method yg mempunyai tipe parameter yg sama.

*Implementation file: Employee, Manager, VicePresident, PolymorphismApp.

Notes:
shift click all the class file ->
right click ->
Diagrams ->
Show Diagram...

# Diagrams
C. Employee
    ↑
C. Manager
    ↑
C. VicePresident


## Type Check dan Casts (Conversion)
- Sebelumnya kita sudah tau cara melakukan konversi tipe data (casts) di tipe data primitif.
- Casts juga bisa digunakan untuk tipe data bukan primitif.
- Namun agar aman, sebelum melakukan casts, pastikan kita melakukan type check (pengecekan tipe data), dengan menggunakan kata kunci instanceof.
- Hasil opertator instanceof adalah boolean, true jika tipe data sesuai, false jika tidak sesuai.

*Implementation file: PolymorphismApp.

## Variable Hiding
- Variable hiding merupakan masalah yg terjadi ketika kita membuat nama field sama di class child dengan nama field di class parent.
- Tidak ada yg namanya field overriding, ketika kita buat ulang nama field di class class, itu berarti variable hiding.
- Untuk mengatasi variable hiding, caranya kita bisa menggunakan super keyword.
- Yang membedakan variable hiding dan method overriding adalah ketika sebuah object di casts.
- Saat object di casts, method akan tetap mengakses method overriding, namun variable akan mengakses variable yg ada di class nya.

*Implementation file: Parent, ParentApp.

## Package
- Saat kita membuat aplikasi, bisa dipastikan kita akan banyak sekali membuat class.
- Jika class terlalu banyak, kadang akan menyulitkan kita untuk mencari atau mengklassifikasikan jenis-jenis class.
- Java memiliki fitur package, yaitu fitur mirip folder / dir, dimana kita bisa menyimpan class-class kita di dalam package.
- Sama seperti folder / dir, package juga bisa nested, kita bisa menggunakan tanda titik (.) untuk membuat nested package.
- Ketika kita menyimpan class di dalam package, maka diatas file Java nya, kita wajib menyebutkan nama package nya.

ex: src/programmer/zaman/now
        /application
        /data
        /util

package programmer.zaman.now.data;

*Implementation file: Product.

## Access Modifier
- Access Modifier adalah kemampuan membuat class, field, method dan constructor dapat diakses dari mana saja.
- Sebelumnya teman-teman sudah melihat 2 access modifier, yaitu public dan default (no-modifier).
- Sekarang kita akan bahas access modifier lainnya.

*Implementation file /data          : Product, ProductApp.
                     /application   : Application

# Access Level
Modifier    Class   Package  Subclass    World
- - - - - - - - - - - - - - - - - - - - - - - - 
public        Y        Y        Y          Y
protected     Y        Y        Y          N
no modifier   Y        Y        N          N
private       Y        N        N          N

# Public Class
- Saat kita membuat public class, kita hanya bisa membuat 1 public class di 1 file Java.
- Selain itu, nama public class harus sama dengan nama file.

## Import
- Import adalah kemampuan untuk menggunakan class yg berada di package yg berbeda.
- Syarat class yg bisa digunakan jika package nya berbeda adalah class yg harus public.

ex:
- import class Product inside package data;
import data.main.Product;
- import all public class inside package data;
import programmer.zaman.now.data.*;

*Implementation file /data          : Product.
                     /application   : Application

# Default Import
- Secara default, semua class yg ada di package java.lang sudah auto import, jadi kita tidak perlu melakukan import secara manual.
- Contoh class String, Integer, Long, Boolean, dll terdapat di package java.lang. Oleh karena itu, kita tidak perlu meng-import nya secara manual.

## Abstract Class
- Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract class.
- Abstract class artinya, class tersebut tidak bisa dibuat sebagai object secara langsung, hanya bisa diturunkan.
- Untuk membuat sebuah class menjadi abstract, kita bisa menggunakan kata kunci abstract sebelum kata kunci class.
- Dengan demikian abstract class bisa kita gunakan sebagai kontrak untuk class child.

ex: public abstract class Location {}

*Implementation file /data          : Location, City.
                     /application   : AbstractClassApp.

## Abstract Method
- Saat kita membuat class yg abstract, kita bisa membuat abstract method juga di dalam class abstract tersebut.
- Saat kita membuat sebuah abstract method, kita tidak boleh membuat block method untuk method tersebut.
- Artinya, abstract method wajib di ovrride di class child.
- Abstract method tidak boleh memiliki access modifier private.

*Implementation file /data          : Animal, Cat.
                     /application   : AbstractMethodApp.

## Getter dan Setter
# Encapsulation
- Encapsulation artinya memastikan data sensitif sebuah object tersembunyi dari akses luar.
- Hal ini bertujuan agar kita bisa menjaga agar data sebuah object tetap baik dan valid.
- Untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier private, sehingga tidak bisa diakses atau diubah dari luar.
- Agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut.

sum: melindungi data sensitif, dengan menggunakan access modifier keyword "private", sehingga data tidak bisa diakses dari luar class.

advantages:
- bisa menambahkan validasi di setter agar data diupdate dengan value yg valid

*Implementation file /data          : Category.
                     /application   : CategoryApp.

# Getter dan Setter
- Di Java, proses encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan Getter dan Setter method.
- Getter adalah function yg dibuat untuk mengambil data field.
- Setter ada function untuk mengubah data field.

# Getter dan Setter Method
Tipe Data       Getter Method   Setter Method
- - - - - - - - - - - - - - - - - - - - - - - - - - - -
boolean         isXxx()         setXxx(boolean value)
primitif        getXxx()        setXxx(primitif value)
Object          getXxx()        setXxx(Object value)

- auto generate
click the code ->
ctrl + N ->
getter setter ->
click + shift / cmd

## Interface
- Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk class child nya.
- Namun sebenernya yg lebih tepat untuk kontrak adalah interface.
- Jangan salah sangka bahwa Interface disini bukanlah User Interface.
- Interface mirip seperti abstract class, yg membedakan adalah di Interface, semua method otomatis abstract, tidak memiliki block.
- Di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yg tidak bisa diubah).
- Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melaikan implements.

- all method inside interface has public and abstract type.
- sebagai kontrak.

*Implementation file /data          : Car, R8.
                     /application   : CarApp.

## Interface Inheritance
- Sebelumnya kita sudah tahu kalau di Java, child class hanya bisa punya 1 class parent.
- Namun berbeda dengan interface, sebuah child class bisa implement lebih dari 1 interface.
- Bahkan interface pun bisa implement interface lain, bisa lebih dari 1. Namun jika interface ingin mewarisi interface lain, kita menggunakan kata kunci extends, bukan implements.

- class has multiple interface.
- interface has multiple parent or inherit other interface.

*Implementation file /data          : HashBrand, Car, IsMaintenance, R8.
                     /application   : CarApp.

## Default Method
- Sebelumnya kita tahu bahwa di interface, kita tidak bisa membuat method konkrit yg memiliki block method.
- Namun sejak versi Java 8, ada fitur default method di interface.
- Fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yg implement interface tersebut.
- Ketika kita menambah satu method di interface, secara otomatis semua class yg implement akan rusak karena harus meng-override method tersebut.
- Dengan menggunakan default method, kita bisa menambahkan konkrit method di interface.

- sehingga semua pengguna interface tidak wajib menambahkan method / tidak error ketika kita menambahkan method di interface.

*Implementation file /data          : Car, R8, Bus.
                     /application   : CarApp.

## toString() Method
- toString() adalah method yg terdapat di class Object.
- Method ini biasanya digunakan untuk merepresentasikan object dalam bentuk String.
- Secara default, toString() ini akan menghasilkan:
    -       namaclass + @ +hashCode
- Namun kita bisa mengubahnya jika kita mau, agar object yg kita buat lebih mudah dibaca.

*Implementation file /data          : Product.
                     /application   : ProductApp.

## equals() Method
- Hal yg agak membingungkan di Java adalah, cara membandingkan object.
- Di bahasa ppemrograman lain, untuk mengecek apakah sebuah object sama, biasanya menggunakan operator ==, di Java, operator == hanya untuk mengecek data primitif.
- Untuk non primitif pengecekan nya menggunakan method equals.
- Dan secara default, method equals itu akan membandingkan dua buah object secara kesamaan posisi object di memory, artinya jika kita membuat 2 object yg isi fields nya sama, tetap dianggap beda oleh method equals.
- Oleh karena itu, ada baiknya kita meng-override method equals milik class Object tersebut.

ctrl + N ->
equals and hashcode ->
select template

*Implementation file /data          : Product.
                     /application   : EqualsApp, ProductApp.

## HashCode Method
- Method hashCode adalah method representasi integer object kita, mirip toString yg merupakan representasi String, hashCode adalah representasi integer.
- HashCode sangat bermanfaat untuk membuat struktur data unique seperti HashMap, Set, dll, karena cukup menggunakan hashCode method untuk mendapatkan identitas unique object kita.
- Secara default hashCode akan mengembalikan nilai integer sesuai data di memory, namun kita bisa mengoverride nya jika kita ingin.

*Implementation file /data          : Product.
                     /application   : ProductApp.

# Kontrak HashCode Method
Tidak mudah meng-override method hashCode, karena ada kontraknya:

- Sebanyak apapun hashCode dipanggil, untuk object yg sama, harus menghasilkan data integer yg sama.
- Jika ada 2 object yg sama jika dibandingkan menggunakan method equals, maka nilai hashCode nya juga harus sama.
- Tidak wajib hashCode berbeda jika method equals menghasilkan false, karena memang keterbatasan jumlah integer sekitar 2 milyar.

## Final Class
- Sebelumnya kita pernah menggunakan kata kunci final di Java.
- Jika digunakan di variable, maka variable tersebut tidak bisa berubah lagi datanya.
- Final pun bisa digunakan di class, diaman jika kita menggunakan kata kunci final sebelum class, maka kita menan dakan bahwa class tersebut tidak bisa diwariskan lagi.
- Secara otomatis semua class child nya akan error.

*Implementation file /data          : SocialMedia.

## Final Method
- Kata kunci final juga bisa digunakan di Method.
- Jika sebuah method kita tambahkan kata kunci final, maka artinya method tersebut tidak bisa di override lagi di class child nya.
- Ini sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah lagi oleh class child nya.

*Implementation file /data          : SocialMedia.

## Inner Class
- Di Java, kita bisa membuat class di dalam class, atau disebut dengan Inner Class.
- Salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class yg saling berhubungan, dimana sebuah class tidak bisa dibuat tanpa class lain.
- Misal kita perlu membuat class Employee, dimana membutuhkan class Company, maka kita bisa membuat class Employee sebagain inner class Company.
- Cara membuat inner class, cukup membuatnya di dalam blok class outer class nya.

*Implementation file /data          : Company.
                     /application   : NestedApp.

# Mengakses Outer Class
- Keuntungan saat kita membuat inner class adalah, kemampuan untuk mengakses outer class nya.
- Inner class bisa membaca semua private member yg ada di outer class nya.
- Untuk mengakses object outer class nya, kita bisa menggunakan nama class outer nya diikutin dengan kata kunci this, misal Company.this.
- Dan untuk mengakses super class outer class nya, kita bisa menggunakan nama class outer nya diikuti dengan kata kunci super, misal Company.super.

## Anonymous Class
- Anonymous class atau class tanpa nama.
- Adalah kemampuan mendeklarasikan class, sekaligus meng-instansiasi object-nya secara langsung.
- Anonymous class sebenarnya termasuk inner class, dimana outer class nya adalah tempat dimana kita membuat anonymous class tersebut.
- Anonymous class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface atau abstract class sederhana, tanpa harus membuat implementasi class nya.

*Implementation file /data          : HelloWorld.
                     /application   : HelloWorldApp.

## Static Keyword
- Sebelumnya kita sudah sering melihat kata kunci static, namun belum pernah kita bahas.
- Dengan menggunakan kata kunci static, kita bisa membuat field, method atau class bisa diakses langsung tanpa melalui object nya.
- Perlu diingat, static hanya bisa mengakses static lainnya.

# Static Dapat Digunakan di:
- Field, atau disebut class variable, artinya field tersebut bisa diakses langsung tanpa membuat object terlebih dahulu.
- Method, atau disebut class method, artinya method tersebut bisa diakses langsung tanpa membuat object terlebih dahulu.
- Block, static block akan otomatis dieksekusi ketika sebuah class di load.
- Inner Class, artinya inner class tersebut bisa diakses secara langsung tanpa harus membuat object outer ckass terlebih dahulu. Static pada inner class menyebabkan kita tidak bisa mengakses lagi object outer class nya.

ex: Field, Method, Block, Inner Class.
use for helper.

*Implementation file /data          : Constant, Country, Application.
                     /util          : MathUtil.
                     /application   : StaticApp.

# Static Import
import static

## Record Class
# Java 14 - Experimental
- Fitur ini masih versi preview dan belum stabil di versi Java 14, namun kita sudah bisa mencobanya.
- Tapi perlu diingat, bahwa karena fitur ini masih experimental, artinya tidak ada jaminan di versi Java mendatang, fitur ini akan tetap ada, bisa saja dihilangkan.

# Record Class
- Kadang kita sering membuat class, hanya untuk class yg berisikan data. Hanya berisi getter, equals, hashCode, dan toString method.
- Record class digunakan untuk mempermudah pembuatan jenis class tersebut.
- Saat kita membuat record class, secara otomatis Java akan membuatkan getter, equals, hashCode dan toString method secara otomatis, dan juga constructor secara otomatis.
- Saat membuat record class, secara otomatis kita akan meng-extends class java.lang.Record, yg artinya kita tidak bisa extends class lain. Namun kita tetap bisa meng-implement interface.

- immutable
- no method setter
- value can't be change

*Implementation file /data          : LoginRequest.
                     /application   : RecordApp.

# Record Class Constructor
- Secara default, constructor di record class akan dibuat secara otomatis, sesuai dengan definisi record class parameter.
- Namun jika kita ingin melakukan sesuatu di constructor  tersebut, kita bisa membuat compact constructor, yaitu constructor tanpa tanda ().
- Selain itu, kita juga bisa melakukan constructor overloading, namun ada syaratnya, yaitu constructor overloading nya harus tetap memanggil constructor utama yg secara otomatis dibuatkan di record class.

- can't extends
- interface allowed

## Enum Class
- Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yg nilainya terbatas.
- Misal, gender, ada male dan female, atau tipe customer, ada standard, premium atau vip, dll.
- Dalam kasus seperti ini, kita bisa menggunakan enum class, yaitu class yg berisikan nilai terbatas yg sudah ditentukan.
- Saat membuat enum class, secara otomatis dia akan meng-extends class java.lang.Enum, oleh karena itu class enum tidak bisa extends class lain, namun masih tetap bisa implements interface.

-Class yg berisikan nilai terbatas yg sudah ditentukan.

*Implementation file /data          : Level, Customer.
                     /application   : EnumApp.

# Enum Members
- Sama seperti class biasanya, di class enum pun kita bisa menambahkan members (field, method dan constructor).
- Khusus constructor, kita tidak bisa membuat public constructor, karena memang tujuan enum bukan untuk di instansiasi secara bebas.

*Implementation file /data        : Level.
                     /application : EnumApp.

## Exception
- Saat kita membuat aplikasi, kita tidak akan terhindar dengan yg namanya error.
- Di Java, error direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam bentuk class exception.
- Kita bisa menggunakan class exception sendiri, atau menggunakan yg sudah disediakan oleh Java.
- Jika kita ingin membuat exception, maka kita harus membuat class yg extends class Throwable atau turunan-turunannya.

- Create package error / exception
- you can check Throwable

*Implementation file /error       : ValidationException.
                     /util        : ValidationUtil.
                     /application : ValidationApp.

# Membuat Exception
- Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka method tersebut harus ditandai dengan kata kunci throw diikuti dengan class exception nya.
- Jika method tersebut bisa menimbulkan lebih dari satu class exception.
- Di dalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw, diikutin dengan object exception nya.

# Try Catch
- Saat kita memanggil sebuah function yg bisa menyebabkan exception, maka kita wajib menggunakan try-catch expression di Java.
- Ini gunanya agar kita bisa menangkap exception yg terjadi, karena jika tidak ditangkap, lalu terjadi exception, maka secara otomatis program kita akan berhenti.
- Cara menggunakan try-catch expression di Java sangat mudah, di block try, kita tinggal panggil method yg bisa menyebabkan exception dan di block catch, kita bisa melakukan sesuatu jika terjadi exception.

# Multiple Try Catch
1. catch() {} catch() {}
2. catch(type1 | type2 err) {}

# Finally Keyword
- Dalam try-catch, kita bisa menambahkan block finally.
- Block finally ini adalah block dimana akan selalu dieksekusi baik terjadi exception ataupun tidak.
- Ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses ataupun gagal, misal di block try kita ingin membaca file, di block catch kita akan tangkap jika terjadi error, dan di block finally error ataupun sukses membaca file, kita wajib menutup koneksi ke file tersebut, biar tidak menggantung data di memory.

# Jenis Exception
Secara garis besar, di Java, exception dibagi 3 jenis.
- Checked Exception, yaitu exception yg wajib di try catch, seperti yg sudah kita bahas.
- Runtime Exception, dan
- Error

## Runtime Exception
- Runtime exception adalah jenis exception yg tidak wajib di tangkap menggunakan try catch.
- Kompiler Java tidak akan protes walaupun kita tidak menggunakan try catch ketika kita memanggil method yg bisa menyebabkan runtime exception.
- Untuk membuat class runtime exception, kita wajib mengextends class RuntimeException.
- Ada banyak di Java yg merupakan runtime exception, seperti NullPointerException, IllegalArgumentException, dll.

Notes:
- Walaupun runtime exception tidak wajib di try-catch, tapi disarankan tetap melakukan try-catch.
- Karena jika terjadi runtime exception, juga bisa membuat program berhenti.

*Implementation file /error       : BlankException.
                     /util        : ValidationUtil.
                     /application : ValidationApp.

# Centralize Error Handler (Best Practice)
- minimize try catch usage in every code.

## Error
- Error adalah jenis exception yg terakhir.
- Error adalah sebuah class di Java, yg tidak direkomendasikan untuk di try-catch.
- Biasanya error terjadi ketika ada masalah serius, dan sangat tidak direkomendasikan untuk di try-catch.
- Artinya, direkomendasikan untuk mematikan aplikasi.
- Contoh, misal jika diawal aplikasi kita tidak bisa terkoneksi ke database, direkomendasikan untuk membuat exception jenis Error, dan menghentikan aplikasi.

*Implementation file /error       : DatabaseError.
                     /application : DatabaseApp.

## StackTraceElement Class
- Throwable memiliki method yg bernama getStackTrace(), dimana menghasilkan Array dari StackTraceElement object.
- StackTraceElement berisikan informasi tentang, class, file bahkan baris lokasi terjadinya error.
- Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yg terjadi.
- Cara yg paling mudah, kita bisa memanggil method printStackTrace() class Throwable, untuk memprint ke console detail error StackTraceElement nya.

*Implementation file /data          : HelloWorld.
                     /application   : StackTraceApp.

# Multiple StackTraceElement

## Try with Resource
- Di Java 7, terdapat fitur baru bernama try with resource.
- Try with resource adalah sebuah mekanisme agar kita lebih mudah menggunakan resource (yg wajib di close) dalam block try.
- Jika kita ingin menggunakan fitur ini, kita wajib menggunakan interface AutoCloseable.

# Code: Manual Close Resource
search BufferedReader class ->
BufferedReader extends Reader ->
Reader implements Closeable ->
Closeable extends AutoCloseable ->
close();

*Implementation file /application : ReadApp.
                     /root        : README-PZN.md

# Code: Try with Resource
- try(Object of AutoCloseable descendant)
- no need finally, and manual close()

## Annotation
- Annotation adalah menambahkan metadata ke kode program yg kita buat.
- Tidak semua orang membutuhkan Annotation, biasanya Annotation digunakan saat kita ingin membuat library / framework.
- Annotation sendiri bisa diakses menggunakan Reflection, yg akan kita bahas nanti.
- Untuk membuat Annotation, kita bisa menggunakan kata kunci @interface.
- Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value.

# Attribute Annotation
Attribute      | Keterangan
@Target        | Memberitahu Annotation bisa digunakan di mana? Class, method, field, dll.
@Retention     | Memberitahu Annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection?

# Code: Membuat Annotation
*Implementation file /annotation  : Fancy.

# Code: Menggunakan Annotation
*Implementation file /application  : AbstractMethodApp.
                     /data          : Car, Level.

rule base on Fancy @Target ElementType

# Predefined Annotation
Java juga sudah memiliki annotation bawaan, seperti:
- @Override, untuk menandai bahwa method yg meng-override method parent class nya.
- @Deprecated, untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan.
- @FunctionalInterface, untuk menandai bahwa class tersebut bisa dibuat sebagai lambda expression.
- dll.

ex:
@Override
public String getMessage() { return super.getMessage(); }

@Deprecated
public class BlankException extends RuntimeException {}
- will make class has strike mark

## Reflection (Intro) - Full Content in Section 17
- Reflection adalah kemampuan melihat struktur aplikasi kita pada saat berjalan.
- Reflection biasanya sangat berguna saat kita ingin membuat library ataupun framework, sehingga bisa meng-otomatisasi pekerjaan.
- Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan method getClass() atau NamaClass.class

*Implementation file /annotation  : NotBlank.
                     /util        : ValidationUtil
                     /data        : CreateUserRequest
                     /application : ReflectionApp

Required:
# Code: Annotation di Field
add annotation @NotBlank

# Code: Validation menggunakan Reflection
add validation 

Advantages:
- can create validation framework

Perlu Diperhatikan
- Reflection adalah materi yg sangat panjang.
- Oleh karena itu materi Java Reflection akan dibuatkan course terpisah.

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

### 3. end
<!-- SOL 50 -->
</details>

### Error
if is already define, retype, comment -> uncomment.

### IntelliJ IDEA Guide
- Soft-wrap     : ⌘ ⇧ A    -> cmd  + shift  + A
- Reformat Code : ⌘ ⌥ L    -> cmd  + option + L
- Increase Font : ^ ⇧ .    -> ctrl + shift  + .
- Terminal      : ⌥ fn f12 -> option + fn + f12
- Search        : ⇧ x 2    -> shift x 2


### Snippet Trigger
## Java
    - main class    : psvm
    - println       : sout
    - 

## Progress Java:
# Objective: 3,720 minutes
# Remaining: 3,271
# Progress: 449

# Total Section     : 273
# Progress Section  : 156
# Remaining Section : 117

# Total Content     : 43
# Progress Content  : 28
# Remaining Content : 15

# Current Content   : 85
# End Content       : 99

# Jul:
Fri 21: 104
Sat 22: 117
Sun 23: 94

Mon 24: 62
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

