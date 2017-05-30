package com.example.what_to_watch;

        import android.content.Context;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView movieTitle = (TextView) findViewById(R.id.textView1);
        Button suggest = (Button) findViewById(R.id.buttonSuggest);

        final String[] list = {"The Dark Knight", "The Godfather", "Pulp Fiction", "Fight Club",
                "Forrest Gump", "Inception", "The Matrix", "Silence of the Lambs", "Se7en",
                "The Usual Suspects", "Raiders of the Lost Ark", "The Departed", "The Terminator",
                "Alien", "Aliens", "Whiplash", "Memento", "The Prestige", "Good Will Hunting",
                "Die Hard", "Inglourious Basterds", "Up", "Pan's Labyrinth", "Blade Runner",
                "Ocean's Eleven", "The Sixth Sense", "The Thing", "Spotlight", "Jurassic Park",
                "The Truman Show", "Rocky", "Catch Me If You Can", "Groundhog Day", "Zootopia",
                "Donnie Darko", "Prisoners", "Amores Perros", "Million Dollar Baby",
                "Mad Max: Fury Road", "No Country for Old Men", "The Big Lebowski",
                "Fargo", "V for Vendetta", "Room", "Monty Python and the Holy Grail",
                "2001: A Space Odyssey", "Full Metal Jacket", "The Shining", "Grave of the Fireflies",
                "Apocalypse Now", "Gladiator"}; //51

        suggest.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                int random = (int) (Math.random() * 51);
                movieTitle.setText(list[random]);
            }
        });

        final Context context = this;

        Button browse = (Button) findViewById(R.id.buttonBrowse);
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BrowseActivity.class);
                startActivity(intent);
            }
        });

    }

}
