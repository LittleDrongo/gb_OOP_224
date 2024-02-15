package patterns.behavioral.pubsub.task.pubsub;

public interface Publisher {
        void registerUser(Subscriber subscriber);
        void unregisterUser(Subscriber subscriber);
        void notifyUser(String msg, Video video);
}
