public class SwitchStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== SWITCH STATEMENT EXERCISES ===\n");

        // TODO 1: Day of Week
        // Write a switch statement for day numbers (1-7):
        // 1: "Monday", 2: "Tuesday", 3: "Wednesday", 4: "Thursday"
        // 5: "Friday", 6: "Saturday", 7: "Sunday"
        // default: "Invalid day"
        int dayNumber = 3;
        // Your code here:
        String dayName = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println("1. Day " + dayNumber + ": " + dayName);


        // TODO 2: Grade to GPA
        // Write a switch statement for letter grades:
        // 'A': "4.0 GPA", 'B': "3.0 GPA", 'C': "2.0 GPA"
        // 'D': "1.0 GPA", 'F': "0.0 GPA"
        // default: "Invalid grade"
        char letterGrade = 'B';
        // Your code here:
        String gpa = switch (letterGrade) {
            case 'A' -> "4.0 GPA";
            case 'B' -> "3.0 GPA";
            case 'C' -> "2.0 GPA";
            case 'D' -> "1.0 GPA";
            case 'F' -> "0.0 GPA";
            default -> "Invalid grade";
        };
        System.out.println("2. Grade " + letterGrade + ": " + gpa);


        // TODO 3: Month Days
        // Write a switch statement for months (1-12) showing number of days:
        // 1,3,5,7,8,10,12: "31 days"
        // 4,6,9,11: "30 days"
        // 2: "28 or 29 days"
        // default: "Invalid month"
        int month = 4;
        // Your code here:
        String daysInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31 days";
            case 4, 6, 9, 11 -> "30 days";
            case 2 -> "28 or 29 days";
            default -> "Invalid month";
        };
        System.out.println("3. Month " + month + ": " + daysInMonth);


        // TODO 4: Traffic Light Action
        // Write a switch statement for traffic light colors:
        // "red": "Stop and wait"
        // "yellow": "Prepare to stop"
        // "green": "Go safely"
        // default: "Invalid signal"
        String trafficLight = "yellow";
        // Your code here:
        String trafficAction = switch (trafficLight) {
            case "red" -> "Stop and wait";
            case "yellow" -> "Prepare to stop";
            case "green" -> "Go safely";
            default -> "Invalid signal";
        };
        System.out.println("4. Traffic Light (" + trafficLight + "): " + trafficAction);


        // TODO 5: Calculator Operations
        // Write a switch statement for basic math operations:
        // '+': "Addition operation"
        // '-': "Subtraction operation"
        // '*': "Multiplication operation"
        // '/': "Division operation"
        // default: "Unknown operation"
        char operation = '*';
        // Your code here:
        String operationName = switch (operation) {
            case '+' -> "Addition operation";
            case '-' -> "Subtraction operation";
            case '*' -> "Multiplication operation";
            case '/' -> "Division operation";
            default -> "Unknown operation";
        };
        System.out.println("5. Operation '" + operation + "': " + operationName);


        // TODO 6: Season by Month
        // Write a switch statement grouping months into seasons:
        // 12,1,2: "Winter"
        // 3,4,5: "Spring"
        // 6,7,8: "Summer"
        // 9,10,11: "Fall"
        // default: "Invalid month"
        int seasonMonth = 7;
        // Your code here:
        String season = switch (seasonMonth) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Invalid month";
        };
        System.out.println("6. Month " + seasonMonth + ": " + season);


        // TODO 7: Exam Grade Range
        // Write a switch statement for score ranges (use score/10):
        // 10,9: "Excellent"
        // 8: "Very good"
        // 7: "Good"
        // 6: "Satisfactory"
        // default: "Needs improvement"
        int examScore = 85; // Hint: use examScore/10 in switch
        // Your code here:
        String gradeRange = switch (examScore / 10) {
            case 10, 9 -> "Excellent";
            case 8 -> "Very good";
            case 7 -> "Good";
            case 6 -> "Satisfactory";
            default -> "Needs improvement";
        };
        System.out.println("7. Score " + examScore + ": " + gradeRange);


        // TODO 8: Browser Type
        // Write a switch statement for browser names:
        // "chrome": "Google Chrome browser"
        // "firefox": "Mozilla Firefox browser"
        // "safari": "Apple Safari browser"
        // "edge": "Microsoft Edge browser"
        // default: "Unknown browser"
        String browser = "chrome";
        // Your code here:
        String browserName = switch (browser) {
            case "chrome" -> "Google Chrome browser";
            case "firefox" -> "Mozilla Firefox browser";
            case "safari" -> "Apple Safari browser";
            case "edge" -> "Microsoft Edge browser";
            default -> "Unknown browser";
        };
        System.out.println("8. Browser '" + browser + "': " + browserName);


        // TODO 9: Priority Level
        // Write a switch statement for priority numbers:
        // 1: "Critical priority"
        // 2: "High priority"
        // 3: "Medium priority"
        // 4: "Low priority"
        // default: "Invalid priority"
        int priority = 2;
        // Your code here:
        String priorityLevel = switch (priority) {
            case 1 -> "Critical priority";
            case 2 -> "High priority";
            case 3 -> "Medium priority";
            case 4 -> "Low priority";
            default -> "Invalid priority";
        };
        System.out.println("9. Priority " + priority + ": " + priorityLevel);


        // TODO 10: File Extension
        // Write a switch statement for file extensions:
        // "jpg", "png", "gif": "Image file"
        // "mp4", "avi", "mkv": "Video file"
        // "txt", "doc", "pdf": "Document file"
        // default: "Unknown file type"
        String fileExtension = "png";
        // Your code here:
        String fileType = switch (fileExtension) {
            case "jpg", "png", "gif" -> "Image file";
            case "mp4", "avi", "mkv" -> "Video file";
            case "txt", "doc", "pdf" -> "Document file";
            default -> "Unknown file type";
        };
        System.out.println("10. Extension '" + fileExtension + "': " + fileType);
    }
}
