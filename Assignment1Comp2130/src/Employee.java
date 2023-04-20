import java.util.Scanner;

public class Employee {

    private int empId;

    private String empFirstName;
    private String empLastName;
    private int empAnnualSalary;
    private Residence empResidence;

    public Employee(){}

    public Employee(int empId, String empFirstName, String empLastName,int empAnnualSalary, Residence empResidence){

            this.empId = empId;
            this.empFirstName = empFirstName;
            this.empLastName = empLastName;
            this.empAnnualSalary = empAnnualSalary;
            this.empResidence = empResidence;
        }


        public int getEmpId () {
            return empId;
        }

        public void setEmpId ( int empId){
            this.empId = empId;
        }

        public String getEmpFirstName () {
            return empFirstName;
        }

        public void setEmpFirstName (String empFirstName){
            this.empFirstName = empFirstName;
        }

        public String getEmpLastName () {
            return empLastName;
        }

        public void setEmpLastName (String empLastName){
            this.empLastName = empLastName;
        }

        public int getEmpAnnualSalary () {
            return empAnnualSalary;
        }

        public void setEmpAnnualSalary ( int empAnnualSalary){
            this.empAnnualSalary = empAnnualSalary;
        }

        public Residence getEmpResidence () {
            return empResidence;
        }

        public void setEmpResidence (Residence empResidence){
            this.empResidence = empResidence;
        }

        @Override
        public String toString () {
            return "Employee{" +
                    "empId=" + empId + '\n' +
                    ", empFirstNane=" + empFirstName + '\n' +
                    ", empLastName='" + empLastName + '\n' +
                    ", empAnnualSalary=" + empAnnualSalary + '\n' +
                    ", empResidence=" + empResidence + '\n' +
                    '}';
        }


}

