public class Music {
    private String title;
    private String duration;
    private String genre;
    private Date releaseDate;
    private String singer;
    public Music(String title,String duration,String genre,Date releaseDate,String singer){
        this.title=title;
        this.duration=duration;
        this.genre=genre;
        this.releaseDate=releaseDate;
        this.singer=singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setreleaseDate(int date) {
        this.releaseDate = releaseDate;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
public String toString(){
      return String.format("%s %s %s %s %s",this.title,this.duration,this.genre,this.releaseDate,this.singer);

}
}
