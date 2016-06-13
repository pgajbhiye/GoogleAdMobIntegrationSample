package snowdonout.adsintegration;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends Activity {

    //replace with your device id; find this in logcat after app runs on device
    private static final String LOG_TAG = "46E941232E69EF8E6C121DEDBF77A53A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(getApplicationContext(), getString(R.string.ad_app_id));

        AdView mAdView = (AdView) findViewById(R.id.bannerView);
        AdRequest adRequest = new AdRequest.Builder().
                addTestDevice("46E941232E69EF8E6C121DEDBF77A53A")
                .setGender(AdRequest.GENDER_FEMALE)
                .build();// An example device ID
        mAdView.loadAd(adRequest);
    }

}
