public class LegacyAdapter implements ModernInterface
{
    private LegacyLibrary legacyLibrary;

    public LegacyAdapter(LegacyLibrary legacyLibrary)
    {
        this.legacyLibrary = legacyLibrary;
    }

    @Override
    public void doSomethingModern()
    {
        legacyLibrary.doSomethingLegacy();
    }

}
