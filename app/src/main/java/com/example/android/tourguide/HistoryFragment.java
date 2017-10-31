package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("red", "weṭeṭṭi", R.drawable.myrtlebeach));
        colors.add(new Word("green", "chokokki", R.drawable.myrtlebeach));
        colors.add(new Word("brown", " ṭakaakki", R.drawable.ic_launcher_background));
        colors.add(new Word("gray", "ṭopoppi", R.drawable.ic_launcher_background));
        colors.add(new Word("black", "kululli", R.drawable.ic_launcher_background));
        colors.add(new Word("white", "kelelli", R.drawable.ic_launcher_background));
        colors.add(new Word("dusty yellow", "ṭopiisә", R.drawable.ic_launcher_background));
        colors.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.ic_launcher_background));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), colors, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Release the media player if it currently exists because we are about to
                // play a different sound file

                // Get the {@link Word} object at the given position the user clicked on
                Word word = colors.get(position);

            }
        });

        return rootView;
    }


}
