package com.mclaughlin.tracie.nerdlauncher;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NerdLauncherMainActivity extends SingleFragmentActivity{

    @Override
    public Fragment createFragment(){
        return new NerdLauncherFragment();
    }
}
