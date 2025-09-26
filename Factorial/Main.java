// Class definition
class Solution {

    // Function to calculate factorial using recursion
    public int factorial(int n) {
        if (n == 0 || n == 1) {   // base case
            return 1;
        }
        return n * factorial(n - 1);  // recursive call
    }

    // Main method to run the program
    public static void main(String[] args) {
        Solution obj = new Solution();  // create object of Solution class

        int number = 5;  // input value
        int result = obj.factorial(number);  // call factorial function

        System.out.println("Factorial of " + number + " is: " + result);
    }
}
