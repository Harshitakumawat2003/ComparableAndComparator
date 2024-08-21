package sort1_comparator;

public class Emp1 {
    private String name;
    private String phone;
    private int empId;


    public Emp1(String name, String phone, int empId) {
        this.name = name;
        this.phone = phone;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getempId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empId=" + empId +

                '}';
    }

}








