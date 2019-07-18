package by.vladislaw.kravchenok.beatbox;

import android.nfc.Tag;
import android.util.Log;
import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.library.baseAdapters.BR;

/**
 * Created by Vladislaw Kravchenok on 17.07.2019.
 */
public class SoundViewModel extends BaseObservable implements View.OnClickListener {
    private static final String TAG = "SoundViewModel";

    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        //notifyChange();
        notifyPropertyChanged(BR.title);
    }

    @Override
    public void onClick(View view){
        Log.d(TAG, mSound.getName());
    }

}
