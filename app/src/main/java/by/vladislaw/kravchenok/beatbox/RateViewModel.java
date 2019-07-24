package by.vladislaw.kravchenok.beatbox;

import android.content.Context;

import androidx.databinding.BaseObservable;

/**
 * Created by Vladislaw Kravchenok on 24.07.2019.
 */
public class RateViewModel extends BaseObservable {
    private static final String TAG = "RateViewModel";

    private BeatBox mBeatBox;
    private Context mContext;

    public RateViewModel(BeatBox beatBox, Context context) {
        mBeatBox = beatBox;
        mContext = context;
    }

    public void setSoundRate(int rate) {
        mBeatBox.setSoundRate(rate);
        notifyChange();
    }

    public String getSoundRateText() {
        String rate = mBeatBox.getSoundRate() + "%";
        String soundRateText = mContext.getString(R.string.play_back_speed, rate);
        return soundRateText;
    }
}
