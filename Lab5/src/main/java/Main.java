public class Main
{
    public static void main(String[] args)
    {
        LegacyLibrary legacyLibrary = new LegacyLibrary();
        ModernInterface adapter = new LegacyAdapter(legacyLibrary);

        System.out.println("Using Legacy Library via Adapter:");
        adapter.doSomethingModern();
    }
}
