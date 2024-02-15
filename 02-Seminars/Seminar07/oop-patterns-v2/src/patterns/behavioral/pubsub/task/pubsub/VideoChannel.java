package patterns.behavioral.pubsub.task.pubsub;

import java.util.ArrayList;
import java.util.List;

/**
  Description object of video channel(model).
 */
public class VideoChannel implements Publisher {
    private final List <Subscriber> subscribers;
    private final List<Video> videos;
    private ChannelAdmin admin;

    public VideoChannel() {
        this(new ChannelAdmin("Rob"));
    }

    public VideoChannel(ChannelAdmin admin) {
        this.subscribers = new ArrayList<>();
        this.videos = new ArrayList<>();
        this.admin = admin;
    }

    public void addVideo(Video video) {
        videos.add(video);
        notifyUser("Добавлено новое видео " + video.getName(),video);
    }


    public ChannelAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(ChannelAdmin admin) {
        this.admin = admin;
    }

    @Override
    public void registerUser(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unregisterUser(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyUser(String msg, Video video) {
        System.out.println(msg);
        for (Subscriber subs: subscribers) {
            subs.process(video);
        }
    }
}
