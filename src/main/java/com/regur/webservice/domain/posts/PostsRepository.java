package com.regur.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query(
            "select p "+
                    "from Posts p " +
                    "ORDER BY p.id desc"
    )
    Stream<Posts> findAllDesc();

}
