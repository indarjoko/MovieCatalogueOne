package com.example.moviecatalogueone;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieHolder> {

    private List<Movie> movie;

    public MovieAdapter(List<Movie> movie) {
        this.movie = movie;
    }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View viewHolder = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_movie_list, viewGroup, false);
        final MovieHolder movieHolder = new MovieHolder(viewHolder);

    movieHolder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Context context = viewHolder.getContext();
            int position = movieHolder.getAdapterPosition();

            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("MOVIE_INFO", movie.get(position));
            context.startActivity(intent);
        }
    });

        return movieHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder movieHolder, int i) {
            movieHolder.setMovieData(movie.get(i));
    }

    @Override
    public int getItemCount() {
        return movie.size();
    }
}
