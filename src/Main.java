public class Main {

  int num = 1;
  static int num2 = 2;

  public void print() {
    System.out.print(num);
  }

  // write a method that takes in a string and removes numbers and punctuation except spaces, outputting only letters and spaces
  public static String removeNumbersAndPunctuation(String str) {
    // Create a new StringBuilder object to hold the result.
    StringBuilder result = new StringBuilder();

    // Iterate over the characters in the string.
    for (int i = 0; i < str.length(); i++) {
      // If the character is a letter, add it to the result.
      if (Character.isLetter(str.charAt(i)) || str.charAt(i) == ' ' ) {
        result.append(str.charAt(i));
      }
    }

    // Return the result.

    // Return the result.
    return result.toString();
  }

//translate from English to  French and vice versa


  public static double addAndDivide(int a, int b) {
    // Generate a random prime number between 2 and 100.
    int prime = (int) (Math.random() * 100 + 2);
    // Write a line of code that prints the words "the prime number is: " then prints the value of the variable 'prime' and with a newline at the end
    System.out.println("The prime number is: " + prime);

    // Add the two numbers together.
    int sum = a + b;

    System.out.println("The sum is: " + sum);

    // Divide the sum by the random prime number where the result is not an integer


    double quotient = (double) sum / prime;

    return quotient;
  }

  // write a method that outputs the number 7 to the console
  public static void printSeven() {
    System.out.println(7);
  }

  // write a method that takes a string and outputs all the different permutations of that string
  public static void printPermutations(String str) {
    // Create a new StringBuilder object to hold the result.
    StringBuilder result = new StringBuilder();
  }


//write a method that adds two numbers
  public int add(int a, int b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return add(add(a, b), c);
  }

 // write a method that calls the add method and uses the output to print the result

  public int addOutput(int a, int b, int c) {
    return add(add(a, b), c);
  }

  //replace all
  public static void main(String[] args) {

    System.out.println("Hello world!");
    // write a line of code that states "the result is: " then print the result from method addAndDivide with random values passed in on each call

    System.out.println("The result is: " + addAndDivide((int) (Math.random() * 100), (int) (Math.random() * 100)));

    System.out.println("Hello world!");
    // write a line of code that states "the result is: " then print the result from method addAndDivide with random values passed in on each call

    System.out.println("The result is: " + addAndDivide((int) (Math.random() * 100), (int) (Math.random() * 100)));

    // print the result of removeNumbersAndPunctuation given a randomly generated string

// print the result of removeNumbersAndPunctuation given a randomly generated string
String randomString = "Thi--s is ;a random44444 strin42g w12ith nu.mbers and pun21ctuation.";
System.out.println("The original string is: " + randomString);
System.out.println("The string with numbers and punctuation removed is: " + removeNumbersAndPunctuation(randomString));


  }

}



