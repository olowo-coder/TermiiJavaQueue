
public class Student implements Comparable<Student>{

    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }


    @Override
    public int compareTo(Student o) {
        if(cgpa == o.cgpa){
            if(name.compareTo(o.name) == 0){
                return Integer.compare(id, o.id);
            }
            else {
                return name.compareTo(o.name);
            }

        }
        else if (cgpa > o.cgpa) {
            return -1;
        }
        else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", cgpa: " + cgpa +
                '}';
    }
}
