public class main {
    public static void main(String[] args) {
        User admin1 = new Admin(1, "Shak", "asdf");
        User moderator1 = new Moderator(3,"dihan","qwer");

        admin1.changePass();
        moderator1.changePass();

    }
}
