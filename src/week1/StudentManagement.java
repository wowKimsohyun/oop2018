package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public Student[] students = new Student[100];

    /**
     * Phương thức kiểm tra xem 2 student có cùng nhóm không
     * @param s1 - đối tượng student 1
     * @param s2 - đối tượng student 2
     * @return trả về true nếu cùng nhóm, false nếu khác nhóm
     */
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Phương thức in ra các học sinh theo nhóm
     */
    void studentsByGroup() {
        // TODO:
        int k = this.students.length;
        System.out.println("Danh sach sinh vien lop INT22041:");
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getGroup().equals("INT22041") && this.students[i].getName()!= "Student") {
                System.out.println(this.students[i].getInfo());
            }
        }
        System.out.println("Danh sach sinh vien lop INT22042:");
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getGroup().equals("INT22042") && this.students[i].getName()!= "Student") {
                System.out.println(this.students[i].getInfo());
            }
        }
    }

    /**
     * Xóa 1 student ra khỏi danh sách
     * @param id - mã student cần xóa
     */
    void removeStudent(String id) {
        // TODO:
        int i,j;
        for (i = 0; i < this.students.length; i++) {
            if (this.students[i].getID().equals(id)) {
                break;
            }
        }
        for (j = i; j < (this.students.length)-1; j++) {
            this.students[j] = this.students[j + 1];
        }
        this.students[(this.students.length)-1] = new Student();
    }


    public static void main(String[] args) {
        // TODO:
        // cau 1:
        Student s = new Student();
        // cau 6:
        Student a = new Student();
        a.setName("Cao Quy Dang");
        a.setID("17020680");
        a.setGroup("INT22042");
        a.setEmail("hadesi1999@gmail.com");
        System.out.println(a.getInfo());
        // cau 8:
        Student b = new Student();
        Student c = new Student("KimSoHyun","17020170","wowKimSoHuyn@gmail.com");
        Student d = new Student(c);
        System.out.println(b.getInfo());
        System.out.println(c.getInfo());
        System.out.println(d.getInfo());
        // cau 10:
        StudentManagement sm = new StudentManagement();
        Student e = new Student("Luong Thi Nhu Nguyet","17020172","nguyet@gmail.com");
        System.out.println(sm.sameGroup(a,c));
        System.out.println(sm.sameGroup(c,e));
        // cau 11+12+13:
        Student[] stlist = sm.students;
        for (int i=0;i<100;i++){
            stlist[i] = new Student();
        }
        // Them 3 sinh vien vao danh sach stlist
        stlist[0]=a;
        stlist[1]=c;
        stlist[2]=e;
        sm.studentsByGroup();
        System.out.println("Danh sach sinh vien sau khi xoa ID: 17020170");
        sm.removeStudent("17020170");
        for (int i=0;i<sm.students.length;i++){
            if (sm.students[i].getName()!="Student"){
                System.out.println(sm.students[i].getInfo());
            }
        }

    }
}
