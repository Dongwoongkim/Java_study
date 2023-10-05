package aboutCollections.queue.priority_queue;

public class Student implements Comparable<Student> {

    private String name;
    private int priority;

    public Student(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Student o) {
        // 우선순위 숫자가 낮은 것부터 뽑기
        if (this.priority < o.priority) {
            return -1;
        } else if (this.priority == o.priority) {
            return 0;
        }
        return 1;
    }
}
