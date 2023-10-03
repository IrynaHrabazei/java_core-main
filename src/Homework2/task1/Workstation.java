package Homework2.task1;

public class Workstation extends Laptop{
    VideoCard videoCard;

    public Workstation() {
    }

    public Workstation(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public Workstation(int weight, VideoCard videoCard) {
        super(weight);
        this.videoCard = videoCard;
    }

    public Workstation(int CPus, int RAM, double monitor, int weight, VideoCard videoCard) {
        super(CPus, RAM, monitor, weight);
        this.videoCard = videoCard;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "videoCard=" + videoCard +
                '}'+ super.toString();
    }
}
