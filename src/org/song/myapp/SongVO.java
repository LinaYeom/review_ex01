package org.song.myapp;

import java.util.Objects;

public class SongVO {
    private String title;
    private String singer;
    private String genre;

    public SongVO(String title, String singer, String genre){
        this.title = title;
        this.singer = singer;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongVO that = (SongVO) o;
        return Objects.equals(title, that.title) && Objects.equals(singer, that.singer) && Objects.equals(genre, that.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, singer, genre);
    }

    @Override
    public String toString() {
        return "SongController{" +
                "title='" + title + '\'' +
                ", singer='" + singer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }


}
