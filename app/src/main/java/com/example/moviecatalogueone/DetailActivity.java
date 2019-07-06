package com.example.moviecatalogueone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private ImageView imgPhoto;
    private ImageView imgStar;
    private TextView tvMovie;
    private TextView tvRating;
    private TextView tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgPhoto = findViewById(R.id.imgImage);
        imgStar = findViewById(R.id.imgstar);
        tvMovie = findViewById(R.id.tv_movie);
        tvRating = findViewById(R.id.tv_rating);
        tvDescription = findViewById(R.id.tv_desc);

        Movie movie =getIntent().getParcelableExtra("MOVIE_INFO");

        Picasso.get().load(movie.getImage()).into(imgPhoto);
        Picasso.get().load(movie.getImage()).into(imgStar);
        tvMovie.setText(movie.getName());
        tvRating.setText(String.valueOf(movie.getRating()));
        tvDescription.setText(movie.getDescription());
    }
}
