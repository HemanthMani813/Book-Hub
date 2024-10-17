package com.example.BookHub.Repository;


import com.example.BookHub.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PublisherJpaRepository extends JpaRepository<Publisher,Integer> {

}