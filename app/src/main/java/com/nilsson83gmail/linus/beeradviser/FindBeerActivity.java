package com.nilsson83gmail.linus.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends Activity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);

        Spinner color = (Spinner) findViewById(R.id.color);

        String beerType = String.valueOf(color.getSelectedItem());

        List<String> listOfBeers = expert.getBrands(beerType);

        StringBuilder beers = new StringBuilder();
        for (String beer : listOfBeers) {
            beers.append(beer).append("\n");
        }

        brands.setText(beers);
    }

}
