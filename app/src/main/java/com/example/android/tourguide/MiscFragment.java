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
public class MiscFragment extends Fragment {


    public MiscFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> misc = new ArrayList<Word>();
        misc.add(new Word("Myrtle Beach is located in Horry County", "It's the largest county in all of South Carolina", R.drawable.myrtlebeach));
        misc.add(new Word("Boiled Peanuts!!!", "This is the official state snack food offered roadside May through November", R.drawable.myrtlebeach));
        misc.add(new Word("Hungry??", "There are over 1400 restaurants in the area serving up everything from seafood Calabash style to ethnic to local specialty. ", R.drawable.myrtlebeach));
        misc.add(new Word("Need a place to stay?", "There are more than 425 hotels and 89,600 accommodation units for every taste and budget.", R.drawable.myrtlebeach));
        misc.add(new Word("I LOVE WHEEL OF FORTUNE!!!", "Myrtle Beach is the birthplace of Wheel of Fortune hostess, Vanna White.", R.drawable.myrtlebeach));
        misc.add(new Word("I bet you wish you invested !!", "Oceanfront lots in MB were $25 in 1905. If your lot was at least $500 you got a second one free", R.drawable.myrtlebeach));
        misc.add(new Word("What came first ?", "The frist inhabitants were the Waccamaw and Winyah Indians.", R.drawable.myrtlebeach));
        misc.add(new Word("So where did Myrtle Beach get it's name from anyway", "The area received its name from the Sweet Myrtle Tree native to the area. ", R.drawable.myrtlebeach));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), misc, R.color.category_misc);

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
                Word word = misc.get(position);

            }
        });

        return rootView;
    }


}
