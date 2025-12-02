   
public class Employee extends Person {
    private String position; 
    private double salary;   
    private String notes;    

    // الباني (constructor)
    public Employee(int id, String name, String position, double salary, String notes) {
        super(id, name); 
        this.position = position;
        this.salary = salary;
        this.notes = notes;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "الرقم: " + getId() +
               " | الاسم: " + getName() +
               " | الوظيفة: " + position +
               " | الراتب: " + salary +
               " | الملاحظات: " + (notes == null ? "-" : notes);
    }
}