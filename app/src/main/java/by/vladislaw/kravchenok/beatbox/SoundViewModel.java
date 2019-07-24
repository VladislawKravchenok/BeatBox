package by.vladislaw.kravchenok.beatbox;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;


/**
 * Created by Vladislaw Kravchenok on 17.07.2019.
 */
public class SoundViewModel extends BaseObservable {
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

    public void onButtonClick() {
        mBeatBox.play(mSound);
    }


}
