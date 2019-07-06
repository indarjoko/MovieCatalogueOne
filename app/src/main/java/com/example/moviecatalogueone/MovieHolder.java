package com.example.moviecatalogueone;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class MovieHolder extends RecyclerView.ViewHolder {

    private ImageView imgPhoto;
    private ImageView imgStar;
    private TextView tvMovie;
    private TextView tvRating;
    private TextView tvDesc;

    public MovieHolder(@NonNull View itemView) {
        super(itemView);
        imgPhoto = itemView.findViewById(R.id.imgImage);
        imgStar = itemView.findViewById(R.id.imgstar);
        tvMovie = itemView.findViewById(R.id.tv_movie);
        tvRating = itemView.findViewById(R.id.tv_rating);
        tvDesc = itemView.findViewById(R.id.tv_desc);
    }

    public void setMovieData(Movie movie){
        Picasso.get().load(movie.getImage()).into(imgPhoto);
        Picasso.get().load(movie.getStar()).into(imgStar);
        tvMovie.setText(movie.getName());
        tvRating.setText(String.valueOf(movie.getRating()));
        tvDesc.setText(movie.getDescription());
    }

}
