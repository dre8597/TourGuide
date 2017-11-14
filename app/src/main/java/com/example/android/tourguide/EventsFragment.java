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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> event = new ArrayList<Word>();
        event.add(new Word(getString(R.string.christmas), getString(R.string.christmasdate), R.mipmap.myrtlebeach));
        event.add(new Word(getString(R.string.medieval), getString(R.string.medieval_date), R.mipmap.myrtlebeach));
        event.add(new Word(getString(R.string.landing), getString(R.string.landing_date), R.mipmap.myrtlebeach));
        event.add(new Word(getString(R.string.thanksgiving), getString(R.string.thanksgiving_date), R.mipmap.myrtlebeach));
        event.add(new Word(getString(R.string.firework), getString(R.string.firework_date), R.mipmap.myrtlebeach));
        event.add(new Word(getString(R.string.fun), getString(R.string.sun_date), R.mipmap.myrtlebeach));
        event.add(new Word(getString(R.string.race), getString(R.string.race_date), R.mipmap.myrtlebeach));
        event.add(new Word(getString(R.string.lights), getString(R.string.light_date), R.mipmap.myrtlebeach));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), event, R.color.category_events);

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
                Word word = event.get(position);

            }
        });

        return rootView;
    }


}
