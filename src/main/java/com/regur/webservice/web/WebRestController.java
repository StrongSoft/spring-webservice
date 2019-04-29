package com.regur.webservice.web;

import com.regur.webservice.dto.posts.PostsSaveRequestDto;
import com.regur.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author leeseungmin on 2019-04-25
 */
@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;
    private Environment env;

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsService.save(dto);
    }

    @GetMapping("/profile")
    public String getProfile(){
        return Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse("");
    }

}
