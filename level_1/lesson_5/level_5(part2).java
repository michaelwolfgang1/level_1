public class Personal {
    private String name;
    private String position;
    private  String email;
    private  long phone;
    private  int salary;
    private  int age;




    public Personal(String name, String position, String email, long phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int oldAge() {
    return age;
};

public int getAge() {
    return age;
}

public int getSalary() {
    return salary;
}

public long getPhone() {
    return phone;
}

public String getEmail() {
    return email;
}

public String getPosition() {
    return position;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public void setPosition(String position) {
    this.position = position;
}

public void setEmail(String email) {
    this.email = email;
}

public void setPhone(long phone) {
    this.phone = phone;
}

public void setSalary(int salary) {
    this.salary = salary;
}

public void setAge(int age) {
    this.age = age;
}
}



