package homework;

public class Main{
    public static void main(String[] args){

        UserRepository userRepository = new UserRepository(new User("Bob"), new Persister());
        userRepository.report();
        userRepository.save();
    }
}