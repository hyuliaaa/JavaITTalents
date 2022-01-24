# REGEX
[abc] - a,b or c  
[^abc] - any character except a,b or c  
[a-z] - a to z  
[A-Z] - A to Z  
[a-zA-z} - a to z,A to Z  
## Quantifiers - using them we can tell the pc how many times we want smth to repeat
[ ]? - "occurs 0 or 1 times"  
[ ]+ - "occurs 1 or more times"  
[ ]* - "occurs 0 or more times"  
[ ]{n} - "occurs n times"  
[ ]{n, } - "occurs n or more times(at least n times)"  
[ ]{y,z} - "occurs at least y times but less than z times"

## Regax metacharacters(short forms)
\d = [0-9]  
\D = [^0-9]  
\w = [a-zA-z_0-9]  
\W = [^w]  

\ will tell the PC to treat the following characters as search characters: "+", "."  
If we want to search for "-", we need to write \-
### ex: 1 Write a regex for a mobile number that starst with 8 or 9 and has 10 digits
[89][0-9]{9}
### ex: 2 First character uppercase, contains lowercase alpabets and only 1 digit is allowed between them
[A_Z][a-z]+[0-9][a-z]+
### ex: 3 email ID: "hel_1-2.3@gmail.com"
[a-zA-z_0-9\-\.]+[@][a-z]+[\.][a-z]{2-3}
