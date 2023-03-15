public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("zhangsan");
        employee1.setAge(21);
        employee1.setTelephone("13245667890");
        employee1.setOccupation("Senior Engineer");
        employee1.setSalary(100000);
        employee1.printInfo();

        Employee employee2 = new Employee();
        employee2.setName("lisi");
        employee2.setAge(22);
        employee2.setTelephone("13245667891");
        employee2.setOccupation("Junior Engineer");
        employee2.setSalary(80000);
        employee2.printInfo();
    }
}

class Employee {
    String name;
    String occupation;
    String telephone;
    int age;
    int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("telephone:" + telephone);
        System.out.println("Occupation:" + occupation);
        System.out.println("Salary:" + salary);
    }
}