class Member {
    String name;
    int age;
    String phnNum;
    String add;
    double salary;

    Member(String name, int age, String phnNum, String add, double salary) {
        this.name = name;
        this.age = age;
        this.phnNum = phnNum;
        this.add = add;
        this.salary = salary;

    }
    void printSalary(){
        System.out.println("Salary: " + this.salary);
    }

        void printDetails() {
            System.out.println("Name : " + this.name);
            System.out.println("Age : " + this.age);
            System.out.println("Phone Number : " + this.phnNum);
            System.out.println("Address : " + this.add);
            this.printSalary();
            
    
        }    

}

class Employee extends Member {
    String specialization;
    Employee(String name, int age, String phnNum, String add, double salary,String specialization) {
        super(name, age, phnNum, add, salary);
        this.specialization =specialization;
    }
    void printDetails() {
     super.printDetails();
        System.out.println("Specialization : " + this.specialization);

    }

}

class Manager extends Member {
    String department;
    Manager(String name, int age, String phnNum, String add, double salary,String department) {
        super(name, age, phnNum, add, salary);
        this.department =department;
    }

    void printDetails() {
       super.printDetails();
        System.out.println("Department : " + this.department);

    }



}

public class MemberDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Het", 18, "8888888888", "kjbsjhasj", 32656, "none");
        e1.printDetails();


    }

}       
