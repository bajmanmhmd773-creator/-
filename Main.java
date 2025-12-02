import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeService service = new EmployeeService(); 

        while (true) {
            // عرض القائمة للمستخدم
            System.out.println("\n====================================");
            System.out.println("\n===== نظام إدارة شؤون العاملين =====");
            System.out.println("\n====================================");
            System.out.println("a. إضافة موظف جديد");
            System.out.println("b. تعديل موظف");
            System.out.println("c. حذف موظف");
            System.out.println("d. البحث عن موظف");
            System.out.println("e. عرض جميع الموظفين");
            System.out.println("f. خروج");
            System.out.print("اختر رقم العملية: ");
            

            String choice = input.nextLine();

            switch (choice) {
                case "a": 
                    System.out.print("أدخل رقم الموظف: ");
                    int id = Integer.parseInt(input.next());
                     input.nextLine();

                    System.out.print("أدخل اسم الموظف: ");
                    String name = input.nextLine();
 
                    System.out.print("أدخل الوظيفة: ");
                    String position = input.nextLine();

                    System.out.print("أدخل الراتب: ");
                    double salary = Double.parseDouble(input.nextLine());

                    System.out.print("أدخل ملاحظات: ");
                    String notes = input.nextLine();

                    Employee emp = new Employee(id, name, position, salary, notes);
                    service.addEmployee(emp);
                    System.out.println("تمت الإضافة بنجاح.");
                    break;

                case "b": 
                    System.out.print("أدخل رقم الموظف للتعديل: ");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.print("الاسم الجديد (أو اتركه فارغ): ");
                    name = input.nextLine();
                    System.out.print("الوظيفة الجديدة (أو اتركه فارغ): ");
                    position = input.nextLine();
                    System.out.print("الراتب الجديد (أو 0 لعدم التغيير): ");
                    salary = Double.parseDouble(input.nextLine());
                    System.out.print("الملاحظات الجديدة (أو اتركها فارغة): ");
                    notes = input.nextLine();

                    boolean updated = service.editEmployee(id, name, position, salary, notes);
                    System.out.println(updated ? "تم التعديل." : "الموظف غير موجود.");
                    break;

                case "c": 
                    System.out.print("أدخل رقم الموظف للحذف: ");
                    id = input.nextInt();
                    input.nextLine();
                    boolean deleted = service.deleteEmployee(id);
                    System.out.println(deleted ? "تم الحذف." : "الموظف غير موجود.");
                    break;

                case "d":
                    System.out.print("أدخل رقم الموظف للبحث: ");
                    id = input.nextInt();
                    input.nextLine();
                    Person found = service.findById(id);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("الموظف غير موجود.");
                    }
                    break;

                case "e": 
                    service.showAll();
                    break;

                case "f":
                    System.out.println("تم الخروج من النظام ");
                    input.close();
                    return;

                default:
                    System.out.println("خيار غير صحيح، حاول مرة أخرى.");
            }
        }
    }
}
