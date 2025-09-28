public class WhileLoopPractice {
    public static void main(String[] args) {
        System.out.println("=== WHILE LOOP EXERCISES ===\\n");

        // TODO 1: Count from 1 to 10
        // Write a while loop to print numbers 1 to 10
        System.out.println("TODO 1: Count 1 to 10");
        int count = 1;
        // Your code here:
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
        System.out.println("Counting complete.");
        System.out.println();

        // TODO 2: Count Down from 10 to 1
        // Write a while loop to print numbers 10 to 1
        System.out.println("TODO 2: Count down 10 to 1");
        int countdown = 10;
        // Your code here:
        while (countdown >= 1) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Countdown complete.");
        System.out.println();

        // TODO 3: Even Numbers
        // Write a while loop to print even numbers from 2 to 20
        System.out.println("TODO 3: Even numbers 2 to 20");
        int evenNum = 2;
        // Your code here:
        while (evenNum <= 20) {
            System.out.println(evenNum);
            evenNum += 2;
        }
        System.out.println("Even numbers complete.");
        System.out.println();

        // TODO 4: Sum of Numbers
        // Write a while loop to calculate sum of numbers 1 to 100
        System.out.println("TODO 4: Sum of 1 to 100");
        int i = 1;
        int sum = 0;
        // Your code here:
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Sum calculation complete.");
        System.out.println();

        // TODO 5: Factorial Calculation
        // Write a while loop to calculate factorial of 5 (5! = 5*4*3*2*1)
        System.out.println("TODO 5: Factorial of 5");
        int n = 5;
        int factorial = 1;
        int counter = 1;
        // Your code here:
        while (counter <= n) {
            factorial *= counter;
            counter++;
        }
        System.out.println("Factorial calculation complete.");
        System.out.println("5! = " + factorial);
        System.out.println();

        // TODO 6: Find First Multiple
        // Write a while loop to find first number divisible by both 3 and 7
        System.out.println("TODO 6: First multiple of 3 and 7");
        int number = 1;
        // Your code here:
        while (number % 3 != 0 || number % 7 != 0) {
            number++;
        }
        System.out.println("First multiple: " + number);
        System.out.println("Multiple finding complete.");
        System.out.println();

        // TODO 7: String Character Count
        // Write a while loop to count vowels in a string
        System.out.println("TODO 7: Count vowels in 'programming'");
        String text = "programming";
        int index = 0;
        int vowelCount = 0;
        // Your code here:
        while (index < text.length()) {
            // Ambil karakter pada index saat ini
            char ch = text.charAt(index);

            // Cek apakah karakter adalah vokal (a, e, i, o, u)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }

            index++;
        }
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Vowel counting complete.");
        System.out.println();

        // TODO 8: Power Calculation
        // Write a while loop to calculate 2^8 (2 to the power of 8)
        System.out.println("TODO 8: Calculate 2^8");
        int base = 2;
        int exponent = 8;
        int result = 1;
        int exp = 0;
        // Your code here:
        while (exp < exponent) {
            result *= base;
            exp++;
        }
        System.out.println("2^8 = " + result);
        System.out.println("Power calculation complete.");
        System.out.println();

        // TODO 9: Digit Sum
        // Write a while loop to calculate sum of digits in number 12345
        System.out.println("TODO 9: Sum of digits in 12345");
        int num = 12345;
        int digitSum = 0;
        // Your code here:
        while (num > 0) {
            // 1. Ambil digit terakhir menggunakan operator modulo (%)
            int digit = num % 10;

            // 2. Tambahkan digit ke total
            digitSum += digit;

            // 3. Hilangkan digit terakhir menggunakan pembagian integer (/)
            num /= 10;
        }
        System.out.println("Sum of digits: " + digitSum);
        System.out.println("Digit sum calculation complete.");
        System.out.println();

        // TODO 10: Number Guessing Simulation
        // Write a while loop to simulate finding a target number
        // Keep incrementing a guess until it matches target
        System.out.println("TODO 10: Find target number 47");
        int target = 47;
        int guess = 1;
        int attempts = 0;
        // Your code here:
        while (guess != target) {
            attempts++;
            guess++;
        }
        System.out.println("Found " + target + " in " + attempts + " attempts");
        System.out.println("Guessing simulation complete.");

    }
}
