
public abstract class User {
    private int user_id;
    private String username;
    private String email;

    public User(int user_id, String username, String email) {
        this.user_id = user_id;
        this.username = username;
        this.email = email;
    }

     final void changePass()
    {
        giveOldPass();
        giveNewPass();
    }

    protected abstract void giveOldPass();

    protected abstract void giveNewPass();
}
