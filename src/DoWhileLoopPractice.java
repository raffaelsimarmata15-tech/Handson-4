import java.util.Scanner;

public class DoWhileLoopPractice {
    public static void main(String[] args) {
        System.out.println("=== DO-WHILE LOOP EXERCISES ===\n");

        // TODO 1: Basic Do-While Count
        // Write a do-while loop to print numbers 1 to 5
        System.out.println("TODO 1: Count 1 to 5");
        int count = 1;
        // Your code here:
        do {
            System.out.println(count);
            count++;
        } while (count <= 5);
        System.out.println();

        // TODO 2: Menu Simulation
        // Write a do-while loop to simulate a menu that runs at least once
        // Print "Menu: 1. Start 2. Exit" and set choice = 2 to exit
        // NOTE: Scanner is closed here, which is standard practice after use.
        Scanner scanner = new Scanner(System.in);
        System.out.println("TODO 2: Menu simulation");
        int choice = 1;
        // Your code here:
        do {
            System.out.println("------------------------------------");
            System.out.println("Menu Pilihan:");
            System.out.println("1. Mulai Aplikasi");
            System.out.println("2. Keluar");
            System.out.print("Masukkan pilihan Anda (1 atau 2): ");

            // Memeriksa apakah input berikutnya adalah bilangan bulat
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println(">> Aplikasi dimulai. Selamat datang!");
                    // Tambahkan fungsionalitas aplikasi di sini
                } else if (choice == 2) {
                    System.out.println(">> Keluar dari program. Terima kasih!");
                } else {
                    System.out.println(">> Pilihan tidak valid: " + choice + ". Silakan coba lagi.");
                }
            } else {
                System.out.println(">> Input tidak valid. Harap masukkan angka (1 atau 2).");
                // Membersihkan input yang salah agar loop tidak error
                scanner.next();
                choice = 0; // Set pilihan ke 0 agar loop berlanjut
            }

            // Loop akan berlanjut selama pilihan BUKAN 2
        } while (choice != 2);

        // Penting: Tutup objek scanner setelah selesai digunakan
        scanner.close();

        System.out.println("Program telah selesai dijalankan.");
        System.out.println();

        // TODO 3: Input Validation Simulation
        // Write a do-while loop to simulate input validation
        // Start with invalid input, then make it valid
        System.out.println("TODO 3: Input validation simulation");
        int inputValue = -1; // Start with invalid
        int attempts = 0;
        // Your code here (validate inputValue should be between 1-10):
        do {
            System.out.println("Attempt " + (++attempts) + ": Checking input value " + inputValue);
            if (inputValue < 1 || inputValue > 10) {
                System.out.println("Input is invalid. Must be between 1-10.");
                if (attempts == 1) {
                    inputValue = 5;
                } else {
                    inputValue++;
                }
            }
        } while (inputValue < 1 || inputValue > 10);
        System.out.println("Valid input accepted: " + inputValue);
        System.out.println();

        // TODO 4: At Least Once Execution
        // Write a do-while that demonstrates execution even when condition is false
        System.out.println("TODO 4: Executes even when condition is false");
        boolean condition = false;
        // Your code here:
        int executionCount = 0;

        do {
            executionCount++;
            System.out.println("This message has printed " + executionCount + " time(s).");
            System.out.println("The 'while' condition is currently: " + condition);
        } while (condition);
        System.out.println();

        // TODO 5: Sum Until Zero
        // Write a do-while to add numbers until you encounter zero
        // Use array: {5, 3, 8, 2, 0, 7, 1}
        System.out.println("TODO 5: Sum until zero");
        int[] numbers = {5, 3, 8, 2, 0, 7, 1};
        int index = 0;
        int sum = 0;
        // Your code here:
        do {
            // Add the current number to the sum
            sum += numbers[index];

            // Move to the next index
            index++;
        } while (index < numbers.length && numbers[index - 1] != 0);
        System.out.println("Sum until zero: " + sum);
        System.out.println();

        // TODO 6: Reverse Number
        // Write a do-while to reverse digits of number 12345
        System.out.println("TODO 6: Reverse number 12345");
        int number = 12345;
        int reversed = 0;
        // Your code here:
        do {
            // 1. Get the last digit (5, 4, 3, 2, 1)
            int digit = number % 10;

            // 2. Append the digit to the 'reversed' number
            reversed = reversed * 10 + digit;

            // 3. Remove the last digit from the original number
            number /= 10;
        } while (number > 0);
        System.out.println("Reversed: " + reversed);
        System.out.println();

        // TODO 7: Find Character
        // Write a do-while to find first occurrence of 'a' in "programming"
        System.out.println("TODO 7: Find 'a' in 'programming'");
        String text = "programming";
        int charIndex = 0;
        char target = 'a';
        // Your code here:
        do {
            if (text.charAt(charIndex) != target) {
                charIndex++;
            }
        } while (charIndex < text.length() && text.charAt(charIndex) != target);
        System.out.println("Found 'a' at index: " + charIndex);
        System.out.println();

        // TODO 8: Countdown Timer
        // Write a do-while for countdown from 5 to 1, then print "Go!"
        System.out.println("TODO 8: Countdown timer");
        int timer = 5;
        // Your code here:
        do {
            // Print the current timer value
            System.out.println(timer);

            // Decrement the timer
            timer--;

        } while (timer >= 1);
        System.out.println("Go!");
        System.out.println();

        // TODO 9: Password Attempts
        // Write a do-while to simulate password attempts (max 3 tries)
        System.out.println("TODO 9: Password attempts simulation");
        String correctPassword = "secret123";
        String enteredPassword = "wrong"; // Start with wrong password
        int attemptCount = 0;
        int maxAttempts = 3;
        // Your code here:
        do {
            attemptCount++;
            System.out.println("Attempt #" + attemptCount + ": Checking password...");

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Password incorrect. Attempts remaining: " + (maxAttempts - attemptCount));
            }
            // Loop condition checks if password is wrong AND we have more attempts left
        } while (!enteredPassword.equals(correctPassword) && attemptCount < maxAttempts);

        // Final check after the loop terminates
        if (!enteredPassword.equals(correctPassword)) {
            System.out.println("Access denied. Max attempts reached (" + maxAttempts + ").");
        }
        System.out.println();

        // TODO 10: Game Level Completion
        // Write a do-while to simulate completing game levels
        // Start at level 1, complete levels until level 5
        System.out.println("TODO 10: Game level completion");
        int currentLevel = 1;
        int targetLevel = 5;
        // Your code here:
        do {
            // Announce the level being completed
            System.out.println("Completing Level " + currentLevel + "...");

            // Advance to the next level
            currentLevel++;

            // The loop continues as long as the current level hasn't exceeded the target.
        } while (currentLevel <= targetLevel);
        System.out.println("All levels completed!");
        System.out.println();
    }
}
