package com.nilsson83gmail.linus.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by s060qm on 10/20/2017.
 */

public class BeerExpert {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if(color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("gout Stout");
        }
        return brands;
    }


}
