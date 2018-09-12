package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public Student[] students = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        // TODO:
        System.out.println("Danh sach sinh vien lop INT22041:");
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getGroup().equals("INT22041")) {
                System.out.println(this.students[i].getInfo());
            }
        }
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getGroup().equals("INT22042")) {
                System.out.println(this.students[i].getInfo());
            }
        }
    }

    void removeStudent(String id) {
        // TODO:
        int i, j;
        for (i = 0; i < this.students.length; i++) {
            if (this.students[i].getID().equals(id)) {
                break;
            }
        }
        for (j = i; j < this.students.length; j++) {
            this.students[j] = this.students[j + 1];
        }
    }


    public static void main(String[] args) {
        // TODO:
        int i;
        Student s = new Student();
        s.setName("Cao Quy Dang");
        s.setID("17020680");
        s.setGroup("INT22042");
        s.setEmail("hadesi1999@gmail.com");
        Student b = new Student("KimSoHyun","17020170","wowKimSoHuyn@gmail.com");
        Student a = new Student(s);
        Student c = new Student("Luong Thi Nhu Nguyet", "17020172","nguyet@gmail.com");
        System.out.println("Thong tin sv la:\n"+a.getInfo());
        System.out.println(c.getInfo());
        StudentManagement sm = new StudentManagement();
        System.out.println(sm.sameGroup(s, a));

        Student[] stlist = sm.students;

        for (i=0;i<100;i++){
            stlist[i] = new Student();
        }
        stlist[0]=s;
        stlist[1]=b;
        stlist[2]=c;
        sm.studentsByGroup();
        System.out.println("Danh sach sinh vien sau khi xoa ID: 17020170");
        sm.removeStudent("17020170");
        for(i=0;i<5;i++){
            stlist[i].getInfo();
        }

    }
}
