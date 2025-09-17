### Kotlin Playground

This module serves as a playground for writing and running sample Kotlin code for testing and experimentation. Inspired
by [Kotlin Playground](https://play.kotlinlang.org), it allows you to run code directly in your IDE instead of a
browser, making it easier to try out external libraries and explore Kotlin in a flexible environment.

#### Running the Playground

Run the following Gradle command to start the playground. By default, Gradle runs
[Playground.kt](/kotlin-playground/src/main/kotlin/com/kotlin/playground/Playground.kt) since it’s set as the main
class.

```shell
  ./gradlew kotlin-playground:run
```

#### Running the Tests

The tests are located in the `src/test` directory under the `com.kotlin.playground` package. Run the following Gradle
command to execute the tests.

```shell
  ./gradlew kotlin-playground:test
```

### Trying Kotlin

Kotlin is a modern, concise, and expressive language packed with helpful features that make coding more enjoyable and
efficient. Its clean syntax allows you to write code that is concise, readable, and easy to maintain.

This module lists essential Kotlin features with code snippets to help you get started or refresh your knowledge. For a
deeper understanding, explore the [official Kotlin documentation](https://kotlinlang.org/docs/home.html).

Here's the list of topics I've covered:

1. Writing a basic `Hello World` program.
2. Displaying output with `println()`.
3. Printing multi-line text using triple quotes `""" """`.
4. Writing single-line and multi-line comments.
5. Declaring immutable variables with `val`.
6. Declaring mutable variables with `var`.
7. Using **string template** to embed variables in strings.
8. Using **template expressions** to embed expressions inside strings.
9. Common data types: `String`, `Int`, `Boolean`, `Char`, and `Double`.
10. Defining a function using the `fun` keyword.
11. Writing a function that returns a value.
12. Creating a function with parameters.
13. Calling a function using named arguments.
14. Defining a function with default parameter values.
15. Implementing two functions: one with a block body and another with an expression body.
16. Iterating in Kotlin with a `for` loop.
17. Iterating in Kotlin with a `while` loop.
18. Iterating in Kotlin with a `do-while` loop.
19. Using conditional statements with the `if` keyword.
20. Using conditional statements with the `if-else` keyword.
21. Using conditional statements with the `when` keyword.
22. Checking if a list contains a specific element using the `in` keyword.
23. Writing expressions with the `if-else` keyword.
24. Writing expressions with the `when` keyword.
25. Declaring nullable variables.
26. Accessing a nullable variable with the `?.` safe call operator.
27. Accessing a nullable variable with the `!!` non-null assertion operator.
28. Using the `?:` Elvis operator to provide a default value when a variable is null.
29. Creating a lambda function without the `fun` keyword.
30. Storing a function in a variable using the `::` function reference operator.
31. Passing a function as an argument to another function.
32. Using trailing lambda syntax to pass a function as an argument to another function.
33. Using the `repeat()` higher order function to repeat a block of code a specified number of times.
34. Defining a class with the `class` keyword.
35. Creating a data class to store data.
36. Creating an `enum` class to define a set of constants.
37. Adding extra functions to an existing class using extension functions.
38. Adding extra properties to an existing class using extension properties.
39. Creating a generic class to hold any type of data.
40. Implementing inheritance using the `open` modifier.
41. Customizing property accessors using the `get()` and `set()` functions.
42. Using property delegation to delegate work.
43. Using scope functions to simplify code.
44. Creating an `immutable` (read-only) list in Kotlin.
45. Creating a `mutable` list in Kotlin.
46. Creating an `immutable` (read-only) map in Kotlin.
47. Creating a `mutable` map in Kotlin.
48. Creating an `immutable` (read-only) set in Kotlin.
49. Creating a `mutable` set in Kotlin.
50. Using `varargs` to pass any number of elements to a function.

### Practice solutions

This module contains all the coding challenges I’ve solved using Kotlin. It starts with very basic programs, which I’ve
included intentionally. I believe these small programs help you get familiar with the syntax and understanding of the
language, and then you can gradually increase the challenge level after a certain point.

1. Create a function that takes two numbers as arguments and returns their sum.
   [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program1.kt)
2. Write a function that takes an integer minute and converts it to seconds.
   [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program2.kt)
3. Create a function that takes a number as an argument, increments the number by +1 and returns the result.
   [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program3.kt)
4. Write a function that takes the base and height of a triangle and return its area.
   [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program4.kt)
5. Create a function that takes the age in years and returns the age in days.
   [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program5.kt)
6. Create a function that takes an array containing only numbers and return the first element.
   [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program6.kt)
7. Create a function that takes voltage and current and returns the calculated power.
   [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program7.kt)
8. Write a function that converts hours into seconds.
   [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program8.kt)
9. Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
   [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program9.kt)
10. Create a function that returns the remainder of the division of two numbers.
    [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program10.kt)
11. Create a function that takes length and width and finds the perimeter of a rectangle.
    [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program11.kt)
12. Write a function that returns the string "something" joined with a space " " and the given argument a.
    [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program12.kt)
13. Create a function that takes a number as its only argument and returns true if it's less than or equal to zero,
    otherwise return false.
    [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program13.kt)
14. Given an n-sided regular polygon n, return the total sum of internal angles (in degrees).
    [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program14.kt)
15. You are counting points for a basketball game, given the amount of 2-pointers scored and 3-pointers scored, find the
    final points for the team and return that value.
    [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program15.kt)
16. Given two numbers, return true if the sum of both numbers is less than 100. Otherwise, return false.
    [View solution](https://github.com/heyysudarshan/exploring-the-world-of-kotlin/blob/main/practice-solutions/src/main/kotlin/com/practice/solutions/Program16.kt)

### Thank you 🙌

I'm glad you checked out this repository. I understand the struggle of learning a new language or transitioning to
another one. I've been there. But believe me: you’ll soon start loving Kotlin more than anything.

When I first started programming, I loved Java and JavaScript. I never imagined that Kotlin would replace them for me,
but here I am. Now, all other languages feel awkward to me. All the best, and welcome to the world of Kotlin. And thank
you so much for checking out this repository.