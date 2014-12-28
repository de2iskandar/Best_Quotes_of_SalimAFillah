package com.salimafillah.bestquotes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private Quotes mQuotes = new Quotes();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView1 = (TextView) this.findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, AboutActivity.class));
            }
        }
        );

        final TextView quoteLabel = (TextView) findViewById(R.id.quoteTextView);
        final Button showQuoteButton = (Button) findViewById(R.id.showQuoteButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String quote = mQuotes.getQuotes();
                // Update the label with our dynamic fact
                quoteLabel.setText(quote);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showQuoteButton.setTextColor(color);
            }
        };
        showQuoteButton.setOnClickListener(listener);

        //Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG,"We're logging from the onCreate() method!");
    }


}
