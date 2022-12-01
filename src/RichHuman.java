public class RichHuman extends DefHuman {
    public long money;

    public RichHuman(String name, int age, String colorEyes) {
        super(name, age, colorEyes); // так предложила идея
    }

    public long getMoney() {
        return money;
    }
}