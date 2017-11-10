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
        event.add(new Word("Dickens Christmas Show and Festival", "November 11, 2017", R.drawable.myrtlebeach));
        event.add(new Word("Mythical & Medieval", "November 11-12, 2017", R.drawable.myrtlebeach));
        event.add(new Word("Lighting of the Landing", "November 18, 2017", R.drawable.myrtlebeach));
        event.add(new Word("Thanksgiving Celebration", "November 22-26, 2017", R.drawable.myrtlebeach));
        event.add(new Word("Firework Extravaganza", "November 25, 2017", R.drawable.myrtlebeach));
        event.add(new Word("Sun and Fun in beautiful Myrtle Beach", "June 17-December 31, 2017", R.drawable.myrtlebeach));
        event.add(new Word("The 25th Annuel Myrtle Beach 400' Race (week 1)", "November 9, 2017", R.drawable.myrtlebeach));
        event.add(new Word("Light Show", "November 25, 2017", R.drawable.myrtlebeach));


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
