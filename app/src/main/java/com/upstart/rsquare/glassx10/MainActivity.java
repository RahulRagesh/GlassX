package com.upstart.rsquare.glassx10;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetInstalledApps(true);
    }


    private ArrayList<InstalledAppModel> GetInstalledApps(boolean getSysPackages) {
        ArrayList<InstalledAppModel> installedAppModels = new ArrayList<>();
        List<PackageInfo> Packages = getPackageManager().getInstalledPackages(0);

        for (PackageInfo p : Packages) {
            if ((!getSysPackages) && (p.versionName == null)) {
                continue;
            }
            InstalledAppModel newModel = new InstalledAppModel(
                    p.applicationInfo.loadLabel(getPackageManager()).toString(),
                    p.packageName,
                    p.applicationInfo.loadIcon(getPackageManager()),
                    p.versionName,
                    p.versionCode);
            installedAppModels.add(newModel);
            Log.d("Installed Apps", newModel.toString());
        }
        return installedAppModels;
    }

}
