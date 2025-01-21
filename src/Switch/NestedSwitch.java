package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Krish Raj");
                break;
            case 2:
                System.out.println("Aman Raj");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (department) {
                    case "CSE":
                        System.out.println("CSE Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department");
                }
                break;
            default:
                System.out.println("Enter correct EmpId");
        }
    }
}
