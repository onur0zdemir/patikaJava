public class Teacher {
    String name;
    String mobilePhone;
    String branch;

    Teacher(String name, String branch, String mobilePhone) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.branch = branch;
    }

    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone: " + this.mobilePhone);
        System.out.println("Branch: " + this.branch);
    }
}