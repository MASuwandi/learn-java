
### Running app

# Install Dependency

# Run on Dev env

# Notes

Progress: To Do, On Progress, Done

# ---- JAVA Topic / Subject ----: - Progress ------------#
# -------------------------------------------------------#
#  2. Studi Kasus Dasar:
#       App Todolist            : Done         : 23 chap #
# -------------------------------------------------------#


<details>
<summary>### 2. Studi Kasus Java Dasar: Aplikasi Todolist</summary>
<br>
<!-- EOL 245 -->

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
</details>

<details>
<summary>### 5. Studi Kasus Java OOP: Aplikasi Todolist</summary>
<br>
<!-- EOL 245 -->

### 5. Studi Kasus Java OOP: Aplikasi Todolist
## One of Best Practice Structure:
## Clean Architecture
# Clean Architecture Diagram
# Layer Division of Code Structure
- Entities  : Enterprise Business Rules
ex: Data Representation
- Use Cases : Application Business Rules
ex: Business Logic
- Controllers / Presenters / Gateways : Interface Adapters
ex: View
- Web / UI / External Interfaces / DB / Devices : Frameworks & Drivers
ex: technology Java, Spring Framework, Driver Database
(handle by technology)

Presenter  -> Use Case
              Output Port
Flow of          ⬆
Control          ⬆
              Use Case
              Interactor
                 ⬆
Controller -> Use Case
              Input Port

# Clean Architecture Versi Java
Web     call           call               use
Desktop - - -> Service - - -> Repository - - -> entity
                                  ⬇ call
                               Database

# 4 layer:
- Web Desktop : Interface
- Service     : Business Logic
- Repository  : Data Manipulation, Database, Repository Layer
- Entity      : Representasi Data
- Database    : 

### Steps:
## 1. Membuat Entity
- Entity

## 2. Membuat Repository
- Repository
- RepositoryImpl (change implementation here / logic)

## 3. Membuat Service
- Service
- ServiceImpl

## 4. Repository & Service : Menampilkan Todolist
- Repository Impl
- Service Impl
- complex stuff in repository
- logic in repository

## 5. Test Repository & Service : Menampilkan Todolist
- Test service will also include testing service.
- todolist return memory address

##    Repository & Service : Menambah Todolist
##    Test Repository & Service : Menambah Todolist
##    Repository & Service : Menghapus Todolist
##    Test Repository & Service : Menghapus Todolist
## 6. View : Menampilkan Todolist
## 7. Test View : Menampilkan Todolist
##    View : Menambah Todolist
##    Test View : Menambah Todolist
##    View : Menghapus Todolist
##    Test View : Menghapus Todolist
## 8. Test : Seluruh Aplikasi

### Materi Selanjutnya
- Object Oriented Programming
- Standard Classes
- Generic
- Collection (for data structure)
- Lambda
- Apache Maven
- Unit Test
- Stream

### Noted Feature:
- 

# Package

### 5. end
<!-- SOL 138 -->
</details>

### Error
if is already define, retype, comment -> uncomment.

### IntelliJ Shortcut Key
- Soft-wrap     : ⌘ ⇧ A    -> cmd  + shift  + A
- Reformat Code : ⌘ ⌥ L    -> cmd  + option + L
- Increase Font : ^ ⇧ .    -> ctrl + shift  + .
- Terminal      : ⌥ fn f12 -> option + fn + f12
- Search        : ⇧ x 2    -> shift x 2


### Snippet Trigger
## Java Intellij Snipet
    - main class    : psvm
    - println       : sout
    - 
