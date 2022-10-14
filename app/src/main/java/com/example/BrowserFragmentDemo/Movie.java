package com.example.BrowserFragmentDemo;

import java.net.URI;
import java.net.URISyntaxException;

public class Movie {
//The serialVersionUID is a universal version identifier for a Serializable class.
// Deserialization uses this number to ensure that a loaded class corresponds exactly to a serialized object.
// If no match is found, then an InvalidClassException is thrown.

    private long id;
    private String title;
    private String studio;
    public Movie() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }

    private String cardImageUrl;

    public String getCardImageUrl() {
        return cardImageUrl;
    }

    public void setCardImageUrl(String cardImageUrl) {
        this.cardImageUrl = cardImageUrl;
    }
    public URI getCardImageURI() {
        try {
            return new URI(getCardImageUrl());
        } catch (URISyntaxException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cardImageUrl='" + cardImageUrl + '\'' +
                '}';
    }


}
