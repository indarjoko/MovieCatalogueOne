package com.example.moviecatalogueone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movies;
    private MovieAdapter adapter;
    private RecyclerView listMovie;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMovie = findViewById(R.id.list_movie);

        movieData();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listMovie.setLayoutManager(linearLayoutManager);

        adapter = new MovieAdapter(movies);
        listMovie.setAdapter(adapter);



    }

    private void movieData(){
        movies = new ArrayList<>();
        movies.add(new Movie("Aquaman"," Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm.", R.drawable.poster_aquaman, R.drawable.star, 6.0f));
        movies.add(new Movie("Avenger: Infinity War", "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos.", R.drawable.poster_avengerinfinity, R.drawable.star, 8.0f));
        movies.add(new Movie("Avenger: Endgame","After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos.", R.drawable.poster_endgame, R.drawable.star, 9.0f));
        movies.add(new Movie("Bohemian Rhapsody", "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970.", R.drawable.poster_bohemian, R.drawable.star, 7.0f));
        movies.add(new Movie("Creed II", "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.", R.drawable.poster_creed, R.drawable.star, 6.5f));
        movies.add(new Movie("Hunter Killer", "Captain Glass of the USS Arkansas discovers that a coup d'état is taking place in Russia, so he and his crew join an elite group working on the ground to prevent a war.", R.drawable.poster_hunterkiller, R.drawable.star, 7.5f));
        movies.add(new Movie("Mortal Engines", "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources.", R.drawable.poster_mortalengine, R.drawable.star, 7.0f));
        movies.add(new Movie("Robin Hood", "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.", R.drawable.poster_robinhood, R.drawable.star,7.5f));
        movies.add(new Movie("Spiderman: Into the Spider Verse", "Miles Morales is juggling his life between being a high school student and being a spider-man.", R.drawable.poster_spiderman, R.drawable.star, 8.0f));
        movies.add(new Movie("Venom", "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote", R.drawable.poster_venom, R.drawable.star,8.5f));
    }
}
