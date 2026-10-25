package StreamApi;

public class Student {
    // for Test3
    private int id;
    private String studentName;
    private int age;
    private int mobileNumber;

    public Student(int id, String studentName, int age, int mobileNumber) {
        this.id = id;
        this.studentName = studentName;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}
