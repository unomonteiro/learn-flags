package io.monteirodev.learnflags;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.monteirodev.learnflags.ui.CountryActivity;
import io.monteirodev.learnflags.ui.PortugalActivity;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener {

    public static final String COUNTRY_KEY = "country_key";
    public static final String COUNTRY_NAME = "country_name";
    Button angolaButton;
    Button brazilButton;
    Button japanButton;
    Button portugalButton;
    Button unitedKingdomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angolaButton = (Button) findViewById(R.id.angola_button);
        brazilButton = (Button) findViewById(R.id.brazil_button);
        japanButton = (Button) findViewById(R.id.japan_button);
        portugalButton = (Button) findViewById(R.id.portugal_button);
        unitedKingdomButton = (Button) findViewById(R.id.united_kingdom_button);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == angolaButton.getId()) {
            Intent intentAO = new Intent(this, CountryActivity.class);
            intentAO.putExtra(COUNTRY_KEY, "ao");
            intentAO.putExtra(COUNTRY_NAME, getString(R.string.angola));
            startActivity(intentAO);
        } else if (v.getId() == brazilButton.getId()) {
            Intent intentAO = new Intent(this, CountryActivity.class);
            intentAO.putExtra(COUNTRY_KEY,"br");
            intentAO.putExtra(COUNTRY_NAME,getString(R.string.brazil));
            startActivity(intentAO);
        } else if (v.getId() == japanButton.getId()) {
            Intent intentAO = new Intent(this, CountryActivity.class);
            intentAO.putExtra(COUNTRY_KEY,"jp");
            intentAO.putExtra(COUNTRY_NAME,getString(R.string.japan));
            startActivity(intentAO);
        } else if (v.getId() == unitedKingdomButton.getId()) {
            Intent intentAO = new Intent(this, CountryActivity.class);
            intentAO.putExtra(COUNTRY_KEY,"uk");
            intentAO.putExtra(COUNTRY_NAME,getString(R.string.united_kingdom));
            startActivity(intentAO);
        } else if (v.getId() == portugalButton.getId()) {
            Intent intentPT = new Intent(this, PortugalActivity.class);
            startActivity(intentPT);
        }

    }
}
