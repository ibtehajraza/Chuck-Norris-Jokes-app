package io.github.ibtehajraza.springbootjokeapp.repository;

import io.github.ibtehajraza.springbootjokeapp.model.Joke;

public interface JokeRepository {
    public Joke getRandomJoke();
}
