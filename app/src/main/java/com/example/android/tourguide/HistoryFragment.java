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
        final ArrayList<Word> history = new ArrayList<Word>();
        history.add(new Word(getString(R.string.brookgreen), getString(R.string.brookgreendate), R.mipmap.myrtlebeach));
        history.add(new Word(getString(R.string.castle), getString(R.string.castledate), R.mipmap.myrtlebeach));
        history.add(new Word(getString(R.string.pavilion), getString(R.string.paviliondate), R.mipmap.myrtlebeach));
        history.add(new Word(getString(R.string.peaches), getString(R.string.peachesdate), R.mipmap.myrtlebeach));
        history.add(new Word(getString(R.string.georgetown), getString(R.string.georgetowndate), R.mipmap.myrtlebeach));
        history.add(new Word(getString(R.string.hopsewee), getString(R.string.hopseweedate), R.mipmap.myrtlebeach));
        history.add(new Word(getString(R.string.hobcaw), getString(R.string.hobcawdate), R.mipmap.myrtlebeach));
        history.add(new Word(getString(R.string.vereen), getString(R.string.vereendate), R.mipmap.myrtlebeach));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), history, R.color.category_history);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

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
                Word word = history.get(position);

            }
        });

        return rootView;
    }


}
