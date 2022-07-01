public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Munir Ozkul", "HIST", "555");
        Teacher t2 = new Teacher("Graham Bell", "PHYS", "000");
        Teacher t3 = new Teacher("Ertugrul Bilda", "BIO", "111");

        Course history = new Course("History", "101", "HIST");
        history.addTeacher(t1);

        Course physics = new Course("Physics", "101", "PHYS");
        physics.addTeacher(t2);

        Course biology = new Course("Biology", "101", "BIO");
        biology.addTeacher(t3);

        Student s1 = new Student("Kemal Sunal", "123", "4", history, physics, biology);
        s1.addBulkExamNote(50, 50, 50, 50, 50, 50);
        System.out.println(s1.name);
        s1.isPass();

        Student s2 = new Student("Halit Akcatepe", "444", "4", history, physics, biology);
        System.out.println("==========================\n" + s2.name);
        s1.addBulkExamNote(60, 60, 60, 60, 60, 60);
        s2.isPass();
    }
}