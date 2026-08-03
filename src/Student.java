public class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int year;
    private String email;
    private String phone;
    private String address;
    private double cgpa;
    private double attendance;
    public Student(int id, String name, int age, String gender,
               String department, int year,
               String email, String phone,
               String address,
               double cgpa, double attendance) {

    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.department = department;
    this.year = year;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.cgpa = cgpa;
    this.attendance = attendance;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }
    public void displayDetails() {
    System.out.println("\n========== Student Details ==========");
    System.out.println("Student ID  : " + id);
    System.out.println("Name        : " + name);
    System.out.println("Age         : " + age);
    System.out.println("Gender      : " + gender);
    System.out.println("Department  : " + department);
    System.out.println("Year        : " + year);
    System.out.println("Email       : " + email);
    System.out.println("Phone       : " + phone);
    System.out.println("Address     : " + address);
    System.out.println("CGPA        : " + cgpa);
    System.out.println("Attendance  : " + attendance + "%");
    System.out.println("=====================================");
}
public String toFileString() {

    return id + "," +
            name + "," +
            age + "," +
            gender + "," +
            department + "," +
            year + "," +
            email + "," +
            phone + "," +
            address + "," +
            cgpa + "," +
            attendance;
}
}