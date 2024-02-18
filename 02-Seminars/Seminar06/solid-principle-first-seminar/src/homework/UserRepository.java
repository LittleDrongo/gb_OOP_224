package homework;

public class UserRepository {

    private User user;
    private Persister persister;

    public UserRepository(User user, Persister persister) {
        this.user = user;
        this.persister = persister;
    }

    public void save() {
        persister.save(user);
    }

    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
