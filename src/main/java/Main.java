public class Main {
    public static void main(String[] args) {
        System.out.println( toNameFormat("anna"));
    }
    public static String toNameFormat(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
