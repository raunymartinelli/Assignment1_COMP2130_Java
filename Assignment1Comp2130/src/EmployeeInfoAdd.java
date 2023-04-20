import java.util.Scanner;

public class EmployeeInfoAdd {

    public static void main(String[] args) {
        int count = 0;
        Employee[] employees = new Employee[10];

        System.out.println("=================== System Menu ===================");
        while (true) {


            System.out.println("1. Add Employee" + "\n" +
                    "2. Generate Payroll" + "\n" +
                    "3. Find an Employee information " + "\n" +
                    "4. Exit \n");

            Scanner scanner= new Scanner(System.in);
            System.out.print("Choice your option : ");
            int x = scanner.nextInt();
            if (x == 1){
                System.out.print("Employee first name: ");
                Employee employee = new Employee();
                employee.setEmpId(count + 1);
                employee.setEmpFirstName(scanner.next());
                System.out.print("Employee last name: ");
                employee.setEmpLastName(scanner.next());
                System.out.print("Enter the salary: ");
                employee.setEmpAnnualSalary(scanner.nextInt());
                Residence residence = new Residence();
                System.out.print("Enter the street: ");
                residence.setStreetName(scanner.next());
                System.out.print("Enter the city: ");
                residence.setCityName(scanner.next());
                System.out.print("Enter the zipcode: ");
                residence.setZipCode(scanner.next());
                System.out.print("Enter the Province: ");
                residence.setProvince(scanner.next());
                System.out.print("Enter the Country: ");
                residence.setCountry(scanner.next());
                employee.setEmpResidence(residence);
                employees[count] = employee;
                count++;
            }
            else if (x == 2) {
                float ttl = 0;
                for (Employee employee: employees) {
                    try {
                        ttl += (float) employee.getEmpAnnualSalary() / 12;
                    }
                    catch (Exception ignored) {
                    }
                }
                System.out.println("Total payment for the month is " + ttl);
            }

            else if (x == 3) {
                System.out.print("Please, enter with ID employee : ");
                int y = scanner.nextInt();
                for (Employee employee: employees) {
                    if (y == employee.getEmpId()) {
                        System.out.println(employee);
                        break;
                    }
                }
            }

            else  if (x == 4) {
                break;
            }
        }
    }
}


