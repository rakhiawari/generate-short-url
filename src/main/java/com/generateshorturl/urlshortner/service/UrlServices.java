package com.generateshorturl.urlshortner.service;

import com.generateshorturl.urlshortner.entity.Url;
import com.generateshorturl.urlshortner.repository.UrlRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Service
public class UrlServices {

    @Autowired
    private UrlRepository urlRepository;


    public ResponseEntity< String > shortenUrl(String longUrl) {
        Integer shortUrl=longUrl.hashCode();
        Url url = new Url(longUrl,shortUrl.toString());
        urlRepository.save(url);
//        return ResponseEntity.status(HttpStatus.CREATED).build();
        return ResponseEntity.status(HttpStatus.CREATED).body("https://shortUrl/"+url.getShortUrl());
    }
    public ResponseEntity<String> sendLongUrl(String shortUrl) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(urlRepository.);
        return  null;
    }


   /*public List<Url> getAllUrl() {
       List<Url> urls = (List<Url>) urlRepository.findAll();
       return urls;
   }

    public Url findLongUrl(String shortUrl) {
        System.out.println("hashcode to be search " + shortUrl);
        if (urlRepository.existsById(shortUrl)) {
            Url entity = urlRepository.findById(shortUrl).get();
            return entity;
        }
        return null;
    }*/
}
