package co.edu.eafit.parkingmobile.models;

import java.util.ArrayList;

/**
 * Created by jonatanlondonotaborda on 12/2/16.
 */

public class ModelManager {
    private static final String TAG = ModelManager.class.getSimpleName();

    private static ModelManager instance;

    public ArrayList<Parking> parkings = new ArrayList<>();

    public ModelManager() {
        instance = this;
    }

    public static synchronized ModelManager getInstance() {
        if (instance == null) {
            instance = new ModelManager();
        }

        return instance;
    }
}
