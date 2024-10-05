public class Example {
    int id;
    Example(int id) {
        this.id = id;
    }

    public String toString() {
        return "Example ID: " + id;
    }
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        Example e = new Example(1);
        System.out.println(e);  // Output: Example ID: 1
        System.out.println(e.hashCode());  // Output: 1 (or a unique hash code based on the id)
    }
}
