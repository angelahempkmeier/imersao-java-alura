package vo;

public class MoviesInfoVO {

    private String title;
    private String img;
    private String imDbRating;

    public String getTitle() {
        return title;
    }

    public String getImg() {
        return img;
    }

    public String getImDbRating() {
        return imDbRating;
    }

    @Override
    public String toString() {
        return "MovieInfos{" +
                "title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", imDbRating='" + imDbRating + '\'' +
                '}';
    }}
