# appEmployeeInfo
This Java code implements a menu-driven program that allows the user to manage employee information. The program uses an array of Employee objects and a while loop to display a menu of options until the user chooses to exit the program.

The program has the following menu options:

    Add Employee: This option allows the user to add a new employee to the system by entering the employee's first name, last name, annual salary, and residence details (street, city, zip code, province, and country). The program creates a new Employee object and a new Residence object for the employee and stores them in the employees array.

    Generate Payroll: This option calculates and displays the total payment for the month by adding up the annual salaries of all employees in the system and dividing the sum by 12.

    Find an Employee information: This option allows the user to find and display information about a specific employee by entering the employee's ID number. The program searches the employees array for an employee with a matching ID and displays their details if found.

    Exit: This option allows the user to exit the program.

The program uses a try-catch block to handle exceptions that may occur when calculating the total payment for the month. If an exception occurs, the program ignores it and continues with the next employee.

Java: Import class into IDEA Intellij and run main function.


