
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

