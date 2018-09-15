package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName(){

        return name;
    }
    public void setName(String tenSV){

        this.name= tenSV;
    }
    public String getID(){

        return id;
    }
    public void setID(String maSV){

        this.id = maSV;
    }
    public String getGroup(){

        return group;
    }
    public void setGroup(String tenGroup){

        this.group = tenGroup;
    }
    public String getEmail(){

        return email;
    }
    public void setEmail(String nEmail) {

        this.email = nEmail;
    }

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n : ten SV
     * @param sid : ID
     * @param em : ten Email
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.name = n;
        this.id = sid;
        this.group = "INT22041";
        this.email = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name = s.getName();
        this.id = s.getID();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

    String getInfo() {
        // TODO:
        return this.getName()+"\n"+this.getID()+"\n"+this.getGroup()+"\n"+this.getEmail();
    }
}
