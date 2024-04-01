public class Admin extends User {
    public Admin(int user_id, String username, String email) {
        super(user_id, username, email);
    }

    @Override
    protected void giveOldPass() {
        System.out.println("Admin old pass");
    }
    @Override
    protected void giveNewPass() {
        System.out.println("Admin new pass");
    }

}
