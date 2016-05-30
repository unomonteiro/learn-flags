package io.monteirodev.learnflags.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import io.monteirodev.learnflags.MainActivity;
import io.monteirodev.learnflags.R;
import io.monteirodev.learnflags.model.Flag;

public class CountryActivity extends AppCompatActivity
    implements View.OnClickListener {

    private static final String TAG = CountryActivity.class.getSimpleName();

    private String colors[];
    private TextView instructionsView;
    private ImageView linesImageView;
    private ImageView firstImageView;
    private ImageView secondImageView;
    private ImageView thirdImageView;
    private ImageView countryImageView;

    private HorizontalScrollView colorsView;
    private Button backButton;
    private Flag flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        Intent intent = getIntent();
        String countryCode = intent.getStringExtra(MainActivity.COUNTRY_KEY);
        String countryName = intent.getStringExtra(MainActivity.COUNTRY_NAME);

        flag = new Flag(countryCode,countryName);

        instructionsView = (TextView) findViewById(R.id.instructions_view);
        instructionsView.setText(getString(R.string.instructions, flag.getNationality()));

        linesImageView = (ImageView) findViewById(R.id.lines_image_view);
        linesImageView.setImageResource(flag.getSrcLines());

        firstImageView = (ImageView) findViewById(R.id.first_image_view);
        firstImageView.setImageResource(flag.getSrcOne());

        secondImageView = (ImageView) findViewById(R.id.second_image_view);
        secondImageView.setImageResource(flag.getSrcTwo());

        thirdImageView = (ImageView) findViewById(R.id.third_image_view);
        thirdImageView.setImageResource(flag.getSrcThree());

        countryImageView = (ImageView) findViewById(R.id.country_image_view);
        countryImageView.setImageResource(flag.getSrcFlag());

        colors = new String[] {flag.getColorOne(),flag.getColorTwo(), flag.getColorThree()};

        colorsView = (HorizontalScrollView) findViewById(R.id.colors_view);

        backButton = (Button) findViewById(R.id.back_button);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.black_button) {
            colorBelongsToFlag("black");
        } else if (v.getId() == R.id.blue_button){
            colorBelongsToFlag("blue");
        } else if (v.getId() == R.id.green_button){
            colorBelongsToFlag("green");
        } else if (v.getId() == R.id.orange_button){
            colorBelongsToFlag("orange");
        } else if (v.getId() == R.id.red_button){
            colorBelongsToFlag("red");
        } else if (v.getId() == R.id.yellow_button){
            colorBelongsToFlag("yellow");
        } else if (v.getId() == R.id.white_button){
            colorBelongsToFlag("white");
        } else if (v.getId() == backButton.getId()){
            finish();
        } else {
//            Toast.makeText(CountryActivity.this, "Try again!", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean colorBelongsToFlag(String pressedColor){
        for (String color : colors) {
            if (pressedColor.equals(color)) {
                addColorToFlag(color);
                return true;
            }
        }
        Toast.makeText(CountryActivity.this, "Try again!", Toast.LENGTH_SHORT).show();
        return false;
    }

    private void addColorToFlag(String color){
        if (color.equals(flag.getColorOne()) && !firstImageView.isShown()){
            firstImageView.setVisibility(View.VISIBLE);
            validateFlag();
        } else if (color.equals(flag.getColorTwo()) && !secondImageView.isShown()){
            secondImageView.setVisibility(View.VISIBLE);
            validateFlag();
        } else if (color.equals(flag.getColorThree()) && !thirdImageView.isShown()){
            thirdImageView.setVisibility(View.VISIBLE);
            validateFlag();
        }


    }
    private void validateFlag(){
        if (firstImageView.isShown() && secondImageView.isShown() &&
                thirdImageView.isShown()){
            countryImageView.setVisibility(View.VISIBLE);
            colorsView.setVisibility(View.GONE);
            backButton.setVisibility(View.VISIBLE);
            Toast.makeText(CountryActivity.this, "You completed the flag! Move to the next flag.", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(CountryActivity.this, "Well done!", Toast.LENGTH_SHORT).show();
        }
    }
}
