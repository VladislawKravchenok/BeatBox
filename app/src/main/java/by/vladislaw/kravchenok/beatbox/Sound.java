package by.vladislaw.kravchenok.beatbox;

import android.util.Log;

/**
 * Created by Vladislaw Kravchenok on 17.07.2019.
 */
public class Sound {
    private static final String TAG = "Sound";
    private String mAssetPath;
    private String mName;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        Log.d(TAG, mAssetPath);
        String[] components = assetPath.split("/");
        for(String str: components){
            Log.d(TAG, str);
        }

        String fileName = components[components.length - 1];
        mName = fileName.replace(".wav","");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
