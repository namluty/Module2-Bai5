package Study;

class Students {
    private String name = "Nam Luty";
    private String classes = "C0521G1";

    public Students(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}
public class TestStudents {
    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students();
        student1.setName("Xuan Van");
        student1.setClasses("C0521I1");
        student2.setName("Huy Nam");
        student2.setClasses("C0521K1");
    }
}
