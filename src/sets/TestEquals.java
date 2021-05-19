package sets;

public class TestEquals {
    public static void main(String[] args) {
        Pays mali = new Pays("Mali", 20_000_000,  879.01);
        Pays mali2 = new Pays("Mali", 20_000_000,  879.01);
        System.out.println("Equals -> " + mali.equals(mali2));
        System.out.println("== -> " + (mali==mali2));
        mali2 = mali;
        System.out.println("== -> " + (mali==mali2));

    }
}
