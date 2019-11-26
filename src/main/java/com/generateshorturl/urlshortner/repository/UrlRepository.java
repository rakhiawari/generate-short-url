package com.generateshorturl.urlshortner.repository;

import com.generateshorturl.urlshortner.entity.Url;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends CrudRepository<Url,String> {

}
