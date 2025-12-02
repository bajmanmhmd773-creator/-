
public class Person {
    private int id;   // رقم التعريف
    private String name; // اسم الشخص

    // دالة الباني (Constructor) لتعيين القيم عند إنشاء الكائن
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    // دوال Getter و Setter (للتغليف Encapsulation)
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
}