public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.00;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int oralNote1, int note2, int oralNote2, int note3, int oralNote3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (oralNote1 >= 0 && oralNote1 <= 100) {
            this.c1.oralNote = oralNote1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (oralNote2 >= 0 && oralNote2 <= 100) {
            this.c2.oralNote = oralNote2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (oralNote3 >= 0 && oralNote3 <= 100) {
            this.c3.oralNote = oralNote3;
        }
    }

    void isPass() {
        this.average = ((this.c1.note * 0.8) + (this.c1.oralNote * 0.2) +
                (this.c2.note * 0.8) + (this.c2.oralNote * 0.2) +
                (this.c3.note * 0.8) + (this.c3.oralNote * 0.2)) / 3.0;
        if (this.average > 55) {
            System.out.println("Passed!");
            this.isPass = true;
        } else {
            System.out.println("Not passed!");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(c1.name + " Note\t\t" + c1.note);
        System.out.println(c2.name + " Note\t\t" + c2.note);
        System.out.println(c3.name + " Note\t\t" + c3.note);
        System.out.println(c1.name + " Oral Note\t" + c1.oralNote);
        System.out.println(c2.name + " Oral Note\t" + c2.oralNote);
        System.out.println(c3.name + " Oral Note\t" + c3.oralNote);
        System.out.println("Average Note\t\t" + this.average);
    }
}