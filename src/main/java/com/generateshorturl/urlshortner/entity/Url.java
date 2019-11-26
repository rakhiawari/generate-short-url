package com.generateshorturl.urlshortner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Url {
    @Id
    private String shortUrl;
    private String longUrl;

    public Url() {}

    public Url(String shortUrl, String longUrl) {
        this.longUrl = shortUrl;
        this.shortUrl = longUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}
