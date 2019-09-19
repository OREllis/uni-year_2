# Explanation of Decisions taken to solve Exercise 1.17:

The Problem of calculating the probability of Duplicate Birthdays has been
split into three smaller problems:

1. Generating 24 -> (n) sized list of random days in a year
2. Checking if there are duplicates in the list of random days in a year
3. Calculating the probability of duplicates days in the list of days

The logic taken to solve the above issues shall be explained as follows:

## 1. Generating the list of dates
This in and of itself is one that has several solutions of varying amounts
of complexity to it. One of the easiest ways of doing this would be to 
generate an (n) sized list of random numbers between 1 -> 365.

In my program I chose to use the SecureRandom class instead of the Random
class is because it offers a greater amount of randomness than the base
Random class due to its usage in the java.security package and its 
compliance with the tests in the [FIPS 140-2, Security Requirements for 
Cryptographic Models](https://csrc.nist.gov/publications/detail/fips/140/2/final)
requirements laid out by the National Institute of Standards and Technology.


## 2. Checking if there are duplicates in the list
The way that Implemented this was through the use of the HashSet object, as set
objects cannot contain any duplicates, so I created a new HashSet, instantiated it
through the constructor, and compared the size of it against the size of the list of
dates. 

If the HashSet size was smaller than the size of the list of dates, then that means
there was one or more duplicates within the list, and the function returns
true. 


## 3. Calculating the Probability of duplicates
This one required that I look at online implementations of the Birthday Paradox,
and the way that this was done was by generating a random list of (n) number of 
dates, checking if it's a duplicate, incrementing a variable counting the number of
duplicates if there are duplicate dates in the list, and repeating that 499 more
times.

```
Generate (n) list of dates -> Check if duplicates exist
               A                        |
              / \                       |
               |    Repeat 500 times    |
               |                       \ /
               |                        V
               | - - -    increment counter if duplicate exists
```

Once that is completed, to get the probability, the variable that counts the number
of duplicates has to be divided by 500 to get the percentage possibility of there
being duplicate dates in a randomly generated list of (n) days in a year.


## Ways the efficiency could be improved
There are a variety of ways that this could theoretically by made more efficient, as the avg.
time that it takes to get the Percentage chance of duplicates is between 1.5 & 1.8 seconds 
until it gets the result. The easiest way I could think of increasing the efficiency would be
to use Random instead of SecureRandom to generate the number used as it uses the System Clock 
as the seed to generate numbers instead of using Random data from the OS like Secure Random
does.

Another one could be to implement a duplicate checking function that iterates over the list 
of Dates and checks for duplicates instead of using the way Sets work to remove duplicates, 
such functions may exist in external libraries similar to Apache's Collections library, but
at this time I am not aware of any.

Probably the key thing that's likely slowing down the execution time is the use of LocalDate 
objects instead of using a primitive datatype (e.g. a short or an integer) to store the dates
being compared. By using a Primitive like a Short to store the date number instead of Creating 
and instantiating a LocalDate Object, then assigning it to a List of LocalDate objects, all 
that would need to be done would be to directly assign the random value to the List.
