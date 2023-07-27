package io.github.ibtehajraza.springbootjokeapp.model;

import io.github.ibtehajraza.springbootjokeapp.repository.JokeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeService implements JokeRepository {

//    private
//    Return a joke from the list using random
    public Joke getRandomJoke(){
        Random rand = new Random();
        List<Joke> jokes = populateJokes();
        return jokes.get(rand.nextInt(jokes.size()));
    }

    private List<Joke> populateJokes(){
        List<Joke> jokes = new ArrayList<>();

        jokes.add(new Joke("When Chuck Norris enters a room, he doesn't turn the lights on. He turns the dark off."));
        jokes.add(new Joke("Chuck Norris doesn't do push-ups. He pushes the Earth down."));
        jokes.add(new Joke("Chuck Norris can divide by zero."));
        jokes.add(new Joke("Chuck Norris can slam a revolving door."));
        jokes.add(new Joke("When the Boogeyman goes to bed, he checks his closet for Chuck Norris."));
        jokes.add(new Joke("When Chuck Norris jumps into the water, he doesn't get wet. The water gets Chuck Norris."));
        jokes.add(new Joke("Chuck Norris can unscramble an egg."));
        jokes.add(new Joke("When Chuck Norris does a push-up, he's not lifting himself up, he's pushing the Earth down."));
        jokes.add(new Joke("Chuck Norris can hear sign language."));
        jokes.add(new Joke("When Chuck Norris enters a room, he doesn't turn the lights on. He turns the dark off."));
        jokes.add(new Joke("Chuck Norris can build a snowman out of rain."));
        jokes.add(new Joke("Chuck Norris can hear space."));
        jokes.add(new Joke("Chuck Norris can divide by zero."));
        jokes.add(new Joke("Chuck Norris doesn't age. He levels up."));
        jokes.add(new Joke("When Chuck Norris plays hide and seek, even the seeker hides."));
        jokes.add(new Joke("Chuck Norris doesn't wear a watch. He decides what time it is."));
        jokes.add(new Joke("Chuck Norris can hear silence."));
        jokes.add(new Joke("Chuck Norris can delete the Recycling Bin."));
        jokes.add(new Joke("Chuck Norris can speak Braille."));
        jokes.add(new Joke("When the Boogeyman goes to bed, he checks his closet for Chuck Norris."));
        jokes.add(new Joke("Chuck Norris counted to infinity. Twice."));
        jokes.add(new Joke("When the Boogeyman goes to bed, he checks his closet for Chuck Norris."));
        jokes.add(new Joke("Chuck Norris can speak in sign language."));
        jokes.add(new Joke("Chuck Norris can unscramble an egg."));
        jokes.add(new Joke("When Chuck Norris enters a room, he doesn't turn the lights on. He turns the dark off."));
        jokes.add(new Joke("Chuck Norris can build a snowman out of rain."));
        jokes.add(new Joke("Chuck Norris can hear space."));
        jokes.add(new Joke("Chuck Norris can divide by zero."));
        jokes.add(new Joke("Chuck Norris doesn't age. He levels up."));
        jokes.add(new Joke("When Chuck Norris plays hide and seek, even the seeker hides."));
        jokes.add(new Joke("Chuck Norris doesn't wear a watch. He decides what time it is."));
        jokes.add(new Joke("Chuck Norris can hear silence."));
        jokes.add(new Joke("Chuck Norris can delete the Recycling Bin."));
        jokes.add(new Joke("Chuck Norris can speak Braille."));
        jokes.add(new Joke("When the Boogeyman goes to bed, he checks his closet for Chuck Norris."));
        jokes.add(new Joke("Chuck Norris counted to infinity. Twice."));
        jokes.add(new Joke("When the Boogeyman goes to bed, he checks his closet for Chuck Norris."));
        jokes.add(new Joke("Chuck Norris can speak in sign language."));
        jokes.add(new Joke("Chuck Norris can unscramble an egg."));
        jokes.add(new Joke("When Chuck Norris enters a room, he doesn't turn the lights on. He turns the dark off."));
        jokes.add(new Joke("Chuck Norris can build a snowman out of rain."));
        jokes.add(new Joke("Chuck Norris can hear space."));
        jokes.add(new Joke("Chuck Norris can divide by zero."));
        jokes.add(new Joke("Chuck Norris doesn't age. He levels up."));
        jokes.add(new Joke("When Chuck Norris plays hide and seek, even the seeker hides."));
        jokes.add(new Joke("Chuck Norris doesn't wear a watch. He decides what time it is."));
        jokes.add(new Joke("Chuck Norris can hear silence."));
        jokes.add(new Joke("Chuck Norris can delete the Recycling Bin."));
        jokes.add(new Joke("Chuck Norris can speak Braille."));
        jokes.add(new Joke("When the Boogeyman goes to bed, he checks his closet for Chuck Norris."));
        jokes.add(new Joke("Chuck Norris counted to infinity. Twice."));
        jokes.add(new Joke("When the Boogeyman goes to bed, he checks his closet for Chuck Norris."));
        jokes.add(new Joke("Chuck Norris can speak in sign language."));
        jokes.add(new Joke("Chuck Norris can unscramble an egg."));

        return jokes;
    }
}
