package io.github.ibtehajraza.springbootjokeapp.controller;

import io.github.ibtehajraza.springbootjokeapp.model.Joke;
import io.github.ibtehajraza.springbootjokeapp.model.JokeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JokeController {

    @GetMapping("/get-joke")
    public Joke getRandomJoke(){
        return new JokeService().getRandomJoke();
    }
}
