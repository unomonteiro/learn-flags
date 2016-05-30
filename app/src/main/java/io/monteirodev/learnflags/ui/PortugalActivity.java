package io.monteirodev.learnflags.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Toast;

import io.monteirodev.learnflags.R;

public class PortugalActivity extends AppCompatActivity
    implements View.OnClickListener {

    private static final String TAG = PortugalActivity.class.getSimpleName();

    private String colors[] = {"green", "red", "yellow"};
    private ImageView greenImageView;
    private ImageView redImageView;
    private ImageView yellowImageView;
    private ImageView portugalImageView;

    private HorizontalScrollView colorsView;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portugal);

        greenImageView = (ImageView) findViewById(R.id.greenImageView);
        redImageView = (ImageView) findViewById(R.id.redImageView);
        yellowImageView = (ImageView) findViewById(R.id.yellowImageView);
        portugalImageView = (ImageView) findViewById(R.id.portugal_image_view);
        colorsView = (HorizontalScrollView) findViewById(R.id.colors_view);
        nextButton = (Button) findViewById(R.id.next_button);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.green_button){
            colorBelongsToFlag("green");
        } else if (v.getId() == R.id.red_button){
            colorBelongsToFlag("red");
        } else if (v.getId() == R.id.yellow_button){
            colorBelongsToFlag("yellow");
        } else {
            Toast.makeText(PortugalActivity.this, "Try again!", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean colorBelongsToFlag(String pressedColor){
        for (String color : colors) {
            if (pressedColor.equals(color)) {

                addColorToFlag(color);
                return true;
            }
        }
        return false;
    }

    private void addColorToFlag(String color){
        if (color.equals("green") && !greenImageView.isShown()){
            greenImageView.setVisibility(View.VISIBLE);
            validateFlag();
        } else if (color.equals("red") && !redImageView.isShown()){
            redImageView.setVisibility(View.VISIBLE);
            validateFlag();
        } else if (color.equals("yellow") && !yellowImageView.isShown()){
            yellowImageView.setVisibility(View.VISIBLE);
            validateFlag();
        }


    }
    private void validateFlag(){
        if (greenImageView.isShown() && redImageView.isShown() &&
                yellowImageView.isShown()){
            portugalImageView.setVisibility(View.VISIBLE);
            colorsView.setVisibility(View.GONE);
            nextButton.setVisibility(View.VISIBLE);
            Toast.makeText(PortugalActivity.this, "You completed the flag! Move to the next flag.", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(PortugalActivity.this, "Well done!", Toast.LENGTH_SHORT).show();
        }
    }
}
