import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {

    PriorityQueue<Student> queue = new PriorityQueue<>();

    List<Student> getStudents(List<String> events) {
        int n = Integer.parseInt(events.get(0));
        for (String event : events) {
            if (event.startsWith("SERVED")) {
                queue.poll();
            } else if (event.startsWith("ENTER")) {
                String[] str = event.split(" ");
                Student student = new Student(Integer.parseInt(str[3]), str[1], Double.parseDouble(str[2]));
                queue.add(student);
            }
        }
        List<Student> remaining = new ArrayList<Student>();
        while (!queue.isEmpty()) {
            remaining.add(queue.poll());
        }
        return remaining;
    }
}
