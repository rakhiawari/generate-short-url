package com.generateshorturl.urlshortner.controller;

import com.generateshorturl.urlshortner.entity.Url;
import com.generateshorturl.urlshortner.service.UrlServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class UrlController {

    @Autowired
    private UrlServices urlServices;

//    @RequestMapping(method = RequestMethod.POST, value = ("/shortenUrl"))
    @PostMapping("/shortenUrl")
    public ResponseEntity< String > shortenUrl(@RequestBody String longUrl) {
       return urlServices.shortenUrl(longUrl);
    }


    public ResponseEntity< String > getUrl(@RequestBody String shortUrl) {
        return urlServices.shortenUrl(shortUrl);
    }


        
 /*@PostMapping("/redirectPostToPost")
    public ModelAndView redirectPostToPost(HttpServletRequest request) {
        request.setAttribute(
                View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.TEMPORARY_REDIRECT);
        return new ModelAndView("redirect:/redirectedPostToPost");
    }*/

    /*@GetMapping("/{shortUrl}")
    public RedirectView redirect(@PathVariable String shortUrl) {
        List<Url> urls = urlServices.getAllUrl();
        Url url = urlServices.findLongUrl(shortUrl);
        RedirectView rv = new RedirectView();
        rv.setUrl("" + url.getLongUrl());
        return new RedirectView(" " + url.getLongUrl());
    }*/


}
