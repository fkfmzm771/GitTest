public class Main {
    public static void main(String[] args) {
        try {
            throw new ETest();
        } catch (ETest e) {
            e.printStackTrace();
        }
    }
}

