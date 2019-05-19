package com.chat.gson.Gsonparser.Models;

import java.util.List;

public class MovieModel {

    private String name;
    private String year;
    private String rating, duration, director, tagline, image, story;
    private List<Cast> castList;

    public MovieModel() {
    }

    public MovieModel(String name, String year, String rating, String duration, String director, String tagline, String image, String story, List<Cast> castList) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.duration = duration;
        this.director = director;
        this.tagline = tagline;
        this.image = image;
        this.story = story;
        this.castList = castList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public List<Cast> getCastList() {
        return castList;
    }

    public void setCastList(List<Cast> castList) {
        this.castList = castList;
    }

    public static class Cast {
        private String name;


        public Cast() {

        }
        public Cast(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
