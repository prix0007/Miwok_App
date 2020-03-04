package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mactivity_color;
    public WordAdapter(Activity context, ArrayList<Word> words, int activity_color) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        this.mactivity_color = activity_color;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        RelativeLayout content_background = (RelativeLayout) listItemView.findViewById(R.id.content_background);
        content_background.setBackgroundResource(mactivity_color);
        //content_background.setBackgroundColor(this.activity_color);
        Word currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_translation);

        nameTextView.setText(currentWord.getmMiwokTranslation());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_translation);

        numberTextView.setText(currentWord.getmDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the currentWord object and
        // set the image to iconView
        if(currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getmResourcecId());
            iconView.setVisibility(View.VISIBLE);
        } else{
            iconView.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
