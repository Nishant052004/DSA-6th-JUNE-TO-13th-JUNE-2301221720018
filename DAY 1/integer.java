import java.util.Scanner;

public class integer {
    
    // LeetCode function implementation
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
    public static void main(String[] args) {
        integer sol = new integer();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        
        // Call function and print result
        int result = sol.addDigits(num);
        System.out.println("Result (Single digit sum): " + result);
        
        sc.close();
    }
}