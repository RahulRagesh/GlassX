package com.upstart.rsquare.glassx10;

import android.graphics.drawable.Drawable;

class InstalledAppModel {
    private String AppName;
    private String PackageName;
    private Drawable Icon;
    private String VersionName;
    private int VersionCode;

    InstalledAppModel(String mAppName, String mPackageName, Drawable mIcon, String mVersionName, int mVersionCode) {
        this.AppName = mAppName;
        this.PackageName = mPackageName;
        this.Icon = mIcon;
        this.VersionName = mVersionName;
        this.VersionCode = mVersionCode;
    }

    public String toString() {
        return PackageName + " " + AppName;
    }

    public String GetAppName() {
        return AppName;
    }

    public String GetPackageName() {
        return PackageName;
    }

    public Drawable GetIcon() {
        return Icon;
    }

    public String GetVersionName() {
        return VersionName;
    }

    public int GetVersionCode() {
        return VersionCode;
    }
}
