package patterns.behavioral.pubsub.task.pubsub;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
  Video channel's subscriber.
 */
public class User implements Subscriber {
    private final String nickname;
    private boolean isLikeVideo;
    private final List channelAdministrators;

    public User(String nickname) {
        this.nickname = nickname;
        this.isLikeVideo = false;
        this.channelAdministrators = new ArrayList<>();
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isLikeVideo() {
        return isLikeVideo;
    }

    public void setLikeVideo(boolean likeVideo) {
        isLikeVideo = likeVideo;
    }

    @Override
    public void process(Video video) {
        Random rand = new Random();

        int result = rand.nextInt(100);
        if (result > video.getDuration()){
            System.out.println(nickname + ": Мне нравится видео: " + video.getName());
        } else {
            System.err.println(nickname + ": Мне не нравится видео: " + video.getName());
        }

    }
}
