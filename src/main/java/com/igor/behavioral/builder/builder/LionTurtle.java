package com.igor.behavioral.builder.builder;

import com.igor.behavioral.builder.model.Bending;

import java.util.List;

public class LionTurtle {
    public void createBender(BenderBuilder benderBuilder, List<Bending> bending) {
        for (int i = 0; i < bending.size(); i++) {
            switch (bending.get(i)) {
                case AIRBENDING:
                    benderBuilder.addAirBending();
                    break;
                case FIREBENDING:
                    benderBuilder.addFireBending();
                    break;
                case EARTHBENDING:
                    benderBuilder.addEarthBending();
                    break;
                case WATERBENDING:
                    benderBuilder.addWaterBending();
                    break;
            }
        }
    }
}
