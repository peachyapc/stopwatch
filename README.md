#Stopwatch tasks by Apichaya Tiwcharoensakul (5910545884)


I ran the tasks on Dell Inc., and got these results:
 
Task                                   |  Time
---------------------------------------|--------
Append 50,000 chars to String          | 0.820547 sec
Append 100,000 chars to String         | 2.909180 sec
Append 100,000 chars to StringBuilder  | 0.003680 sec
Add 1 billion double using array       | 1.070976 sec
Add 1 billion Double using array       | 5.641826 sec
Add 1 billion BigDecimal using array   | 10.174910 sec

##Explanation of Results

### 1. Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
> Because 100,000 chars have a bigger size than 50,000 chars, and when changing from char to String, 
The new String is created and replace the old one. Then the memory will keep the new String and also the
old one too, so it will consume the memory and time to copy the old String + new chars of other String.

### 2. Why is appending to StringBuilder so much different than appending to String? What is happening to the String?
> Because everytime you add more String likes, String a += String b;, 
a new String will created and assigned to String a, keep go on until the last String.
 It use too much memory and time. But in StringBuilder has an attribute 'char []' inside its class, 
 so when append a new String or chars onto StringBuilder, it will updates its internal array as like as you 
 assign in it.This means the new memory is only allocated when the String grow and as long as the length of the character 
 sequence contained in the StringBuilder doesn't exceed the capacity, it is automatically made larger.

### Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?
> Double is a wrapper class while double is a primitive type, so double is faster than Double because it not have any attributes or method which
use much more memory like Double. And BigDecimal is slower than Double because it contain a lot of attributes and method more than Double.
 On the other hand, it includes many options for calculating expressions to arbitrary precision like + - * and / which is more accurate for numbers
 given with a finite number of decimal digits.


