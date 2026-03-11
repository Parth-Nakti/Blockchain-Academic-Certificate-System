package model;

public class Certificate {

    private String certificateId;
    private String studentName;
    private String rollNumber;
    private String course;
    private int marks;
    private String university;

    public Certificate(String certificateId, String studentName, String rollNumber,
                       String course, int marks, String university) {

        this.certificateId = certificateId;
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.course = course;
        this.marks = marks;
        this.university = university;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }

    public String getUniversity() {
        return university;
    }

    // Needed for tampering demonstration
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "ID='" + certificateId + '\'' +
                ", Name='" + studentName + '\'' +
                ", Roll='" + rollNumber + '\'' +
                ", Course='" + course + '\'' +
                ", Marks=" + marks +
                ", University='" + university + '\'' +
                '}';
    }
}