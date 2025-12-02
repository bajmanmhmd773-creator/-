import java.util.ArrayList;
import java.util.List;


public class EmployeeService {
    private List<Employee> employees = new ArrayList<>(); // قائمة الموظفين

    
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public boolean deleteEmployee(int id) {
        for (Employee e : employees) {
            if (e.getId()== (id)) {
                employees.remove(e);
                return true;
            }
        }
        return false;
    }

    public boolean editEmployee(int id, String newName, String newPosition, double newSalary, String newNotes) {
        for (Employee e : employees) {
            if (e.getId()== (id)) {
                if (!newName.isEmpty()) e.setName(newName);
                if (!newPosition.isEmpty()) e.setPosition(newPosition);
                if (newSalary > 0) e.setSalary(newSalary);
                if (!newNotes.isEmpty()) e.setNotes(newNotes);
                return true;
            }
        }
        return false;
    }

    // البحث عن موظف بالرقم
    public Employee findById(int id) {
        for (Employee e : employees) {
            if (e.getId()==(id)) {
                return e;
            }
        }
        return null;
    }

    public void showAll() {
        if (employees.isEmpty()) {
            System.out.println("لا توجد سجلات موظفين بعد.");
        } else {
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }
}