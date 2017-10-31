package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by demondrelivingston on 9/1/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int mColorResourceId;

    public WordAdapter(@NonNull Activity context, @NonNull ArrayList<Word> words, int category_colors) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listListView = convertView;
        if (listListView == null) {
            listListView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwok = (TextView) listListView.findViewById(R.id.miwok);

        miwok.setText(currentWord.getmMiwokTranslation());

        TextView defaultLanguage = (TextView) listListView.findViewById(R.id.english);

        defaultLanguage.setText(currentWord.getmDefaultTranslation());

        ImageView imageView = (ImageView) listListView.findViewById(R.id.image);
        // Set the theme color for the list item
        View textContainer = listListView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        if (currentWord.hasImage()) {
            //if an image is availble, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getimageResourceId());
            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listListView;
    }
}
