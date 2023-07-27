
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

## StringBuffer dan StringBuilder Class
- 
## StringJoiner Class
- 
## StringTokenizer Class
- 
## Number Class
- 
## Math Class
- 
## BigNumber Class
- 
## Scanner Class
- 
## Date dan Calendar Class
- 
## System Class
- 
## Runtime Class
- 
## UUID Class
- 
## Base64 Class
## Objects Class
## Random Class
## Properties Class
## Arrays Class
## Regular Expression


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

