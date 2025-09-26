public class ElseIfStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== ELSE IF STATEMENT EXERCISES ===\n");

        // TODO 1: Grade Classification
        // Write if-else if-else to classify grades:
        // score >= 90: "A grade"
        // score >= 80: "B grade"
        // score >= 70: "C grade"
        // else: "F grade"
        int score = 85;
        // Your code here:
        if (score >= 90) {
            System.out.println("1. A grade");
        } else if (score >= 80) {
            System.out.println("1. B grade"); // score is 85, this block executes
        } else if (score >= 70) {
            System.out.println("1. C grade");
        } else {
            System.out.println("1. F grade");
        }


        // TODO 2: Age Category
        // Write if-else if-else to categorize age:
        // age < 13: "Child"
        // age < 20: "Teenager"
        // age < 60: "Adult"
        // else: "Senior"
        int age = 25;
        // Your code here:
        if (age < 13) {
            System.out.println("2. Child");
        } else if (age < 20) {
            System.out.println("2. Teenager");
        } else if (age < 60) {
            System.out.println("2. Adult"); // age is 25, this block executes
        } else {
            System.out.println("2. Senior");
        }


        // TODO 3: Temperature Description
        // Write if-else if-else for temperature:
        // temp > 35: "Very hot"
        // temp > 25: "Hot"
        // temp > 15: "Warm"
        // temp > 5: "Cool"
        // else: "Cold"
        double temperature = 18.5;
        // Your code here:
        if (temperature > 35) {
            System.out.println("3. Very hot");
        } else if (temperature > 25) {
            System.out.println("3. Hot");
        } else if (temperature > 15) {
            System.out.println("3. Warm"); // temperature is 18.5, this block executes
        } else if (temperature > 5) {
            System.out.println("3. Cool");
        } else {
            System.out.println("3. Cold");
        }


        // TODO 4: BMI Classification
        // Write if-else if-else for BMI categories:
        // bmi >= 30: "Obese"
        // bmi >= 25: "Overweight"
        // bmi >= 18.5: "Normal"
        // else: "Underweight"
        double bmi = 22.5;
        // Your code here:
        if (bmi >= 30) {
            System.out.println("4. Obese");
        } else if (bmi >= 25) {
            System.out.println("4. Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("4. Normal"); // bmi is 22.5, this block executes
        } else {
            System.out.println("4. Underweight");
        }


        // TODO 5: Day Type
        // Write if-else if-else for day classification:
        // day 1 or 7: "Weekend"
        // day 2-6: "Weekday"
        // else: "Invalid day"
        int day = 3; // 1=Sunday, 2=Monday, etc.
        // Your code here:
        if (day == 1 || day == 7) {
            System.out.println("5. Weekend");
        } else if (day >= 2 && day <= 6) {
            System.out.println("5. Weekday"); // day is 3, this block executes
        } else {
            System.out.println("5. Invalid day");
        }


        // TODO 6: Traffic Light
        // Write if-else if-else for traffic light colors:
        // "red": "Stop"
        // "yellow": "Caution"
        // "green": "Go"
        // else: "Invalid color"
        String lightColor = "yellow";
        // Your code here:
        if (lightColor.equals("red")) {
            System.out.println("6. Stop");
        } else if (lightColor.equals("yellow")) {
            System.out.println("6. Caution"); // lightColor is "yellow", this block executes
        } else if (lightColor.equals("green")) {
            System.out.println("6. Go");
        } else {
            System.out.println("6. Invalid color");
        }


        // TODO 7: Discount Rate
        // Write if-else if-else for purchase discounts:
        // amount >= 1000: "20% discount"
        // amount >= 500: "10% discount"
        // amount >= 100: "5% discount"
        // else: "No discount"
        double purchaseAmount = 750.0;
        // Your code here:
        if (purchaseAmount >= 1000) {
            System.out.println("7. 20% discount");
        } else if (purchaseAmount >= 500) {
            System.out.println("7. 10% discount"); // purchaseAmount is 750.0, this block executes
        } else if (purchaseAmount >= 100) {
            System.out.println("7. 5% discount");
        } else {
            System.out.println("7. No discount");
        }


        // TODO 8: Speed Category
        // Write if-else if-else for vehicle speed:
        // speed > 120: "Very fast"
        // speed > 80: "Fast"
        // speed > 50: "Moderate"
        // speed > 0: "Slow"
        // else: "Stopped"
        int speed = 95;
        // Your code here:
        if (speed > 120) {
            System.out.println("8. Very fast");
        } else if (speed > 80) {
            System.out.println("8. Fast"); // speed is 95, this block executes
        } else if (speed > 50) {
            System.out.println("8. Moderate");
        } else if (speed > 0) {
            System.out.println("8. Slow");
        } else {
            System.out.println("8. Stopped");
        }


        // TODO 9: Password Strength
        // Write if-else if-else for password strength:
        // length >= 12: "Very strong"
        // length >= 8: "Strong"
        // length >= 6: "Moderate"
        // else: "Weak"
        String password = "mypassword"; // length is 10
        // Your code here:
        if (password.length() >= 12) {
            System.out.println("9. Very strong");
        } else if (password.length() >= 8) {
            System.out.println("9. Strong"); // length is 10, this block executes
        } else if (password.length() >= 6) {
            System.out.println("9. Moderate");
        } else {
            System.out.println("9. Weak");
        }


        // TODO 10: Student Performance
        // Write if-else if-else combining score and attendance:
        // score >= 90 AND attendance >= 95: "Excellent"
        // score >= 80 AND attendance >= 85: "Good"
        // score >= 70 AND attendance >= 75: "Satisfactory"
        // else: "Needs improvement"
        int studentScore = 88;
        int attendance = 90;
        // Your code here:
        if (studentScore >= 90 && attendance >= 95) {
            System.out.println("10. Excellent");
        } else if (studentScore >= 80 && attendance >= 85) {
            System.out.println("10. Good"); // score is 88 and attendance is 90, this block executes
        } else if (studentScore >= 70 && attendance >= 75) {
            System.out.println("10. Satisfactory");
        } else {
            System.out.println("10. Needs improvement");
        }

    }
}
