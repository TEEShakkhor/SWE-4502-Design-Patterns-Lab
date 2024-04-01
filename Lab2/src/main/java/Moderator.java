public class Moderator extends User {

    public Moderator(int user_id, String username, String email) {
        super(user_id, username, email);
    }

    @Override
    protected void giveOldPass() {
        System.out.println("Moderator old pass");
    }
    @Override
    protected void giveNewPass() {
        System.out.println("Moderator new pass");
    }

}
