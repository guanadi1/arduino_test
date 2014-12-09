package com.raon.aremotefreegalaxy;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.util.Log;
import com.raon.remotelib.a;
import com.raon.remotelib.d;
import com.raon.remotelib.f;
import com.raon.remotelib.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Globals extends Application
{
  public a a;
  public b b;
  public ap c;
  public boolean d;
  public boolean e;
  public boolean f;
  public boolean g;
  Vibrator h;
  private ArrayList i;
  private int j;

  private void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    Context localContext = getApplicationContext();
    String str = localContext.getDatabasePath(paramString2).getPath();
    File localFile = new File(str);
    if ((paramBoolean) || (!localFile.exists()))
    {
      InputStream localInputStream = localContext.getAssets().open(paramString1);
      FileOutputStream localFileOutputStream = new FileOutputStream(str);
      byte[] arrayOfByte = new byte[1024];
      int k = 0;
      while (true)
      {
        int m = localInputStream.read(arrayOfByte);
        if (m <= 0)
          break;
        localFileOutputStream.write(arrayOfByte, 0, m);
        k += m;
      }
      localFileOutputStream.flush();
      localFileOutputStream.close();
      localInputStream.close();
      Log.i("raon", "DB file copied");
    }
  }

  private void n()
  {
    try
    {
      this.i = this.b.b();
      label11: if (this.i == null)
        this.i = new ArrayList();
      if (this.i.size() == 0)
        a(getString(2131427384) + "1");
      SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
      this.j = localSharedPreferences.getInt("roomidx", 0);
      this.d = localSharedPreferences.getBoolean("vibrate", true);
      this.e = localSharedPreferences.getBoolean("htc6mode", false);
      if (this.j >= this.i.size())
        this.j = 0;
      return;
    }
    catch (Exception localException)
    {
      break label11;
    }
  }

  public int a(Context paramContext)
  {
    FeatureInfo[] arrayOfFeatureInfo = paramContext.getPackageManager().getSystemAvailableFeatures();
    int k = arrayOfFeatureInfo.length;
    int m = 0;
    int n = 0;
    FeatureInfo localFeatureInfo;
    if (m < k)
    {
      localFeatureInfo = arrayOfFeatureInfo[m];
      if (localFeatureInfo.name != null);
    }
    String str;
    do
    {
      do
      {
        m++;
        break;
        str = localFeatureInfo.name.toLowerCase();
      }
      while (!str.contains("com.htc.software.sense"));
      if (str.contains("sense6"))
      {
        n = 6;
        return n;
      }
    }
    while (!str.contains("sense5"));
    return 5;
  }

  public int a(String paramString, int paramInt, d paramd, g paramg)
  {
    f localf = new f();
    localf.a = paramString;
    localf.b = paramInt;
    localf.c = paramd;
    localf.d = paramg;
    ad localad = d();
    localad.c.add(localf);
    k();
    return -1 + localad.c.size();
  }

  public void a()
  {
    File localFile = new File("/data/data/" + getPackageName() + "/databases");
    if (!localFile.exists())
      localFile.mkdir();
  }

  public void a(int paramInt)
  {
    this.j = paramInt;
  }

  public void a(g paramg, int paramInt)
  {
    if (this.d)
      this.h.vibrate(50L);
    this.a.a(paramg, paramInt);
  }

  public void a(String paramString)
  {
    this.i.add(new ad(paramString));
    this.j = (-1 + this.i.size());
  }

  public void a(boolean paramBoolean)
  {
    Intent localIntent = new Intent("android.intent.action.SUPERSK");
    localIntent.setData(Uri.parse("LED:"));
    localIntent.putExtra("isshow", paramBoolean);
    sendBroadcast(localIntent);
  }

  public int b()
  {
    return this.j;
  }

  public void b(int paramInt)
  {
    d().b = paramInt;
  }

  public void b(String paramString)
  {
    g().a = paramString;
    k();
  }

  public int c()
  {
    ad localad = d();
    if (localad == null)
      return 0;
    if (localad.b >= localad.c.size())
      localad.b = 0;
    return localad.b;
  }

  public ArrayList c(int paramInt)
  {
    return this.a.a(paramInt);
  }

  public void c(String paramString)
  {
    d().a = paramString;
    k();
  }

  public ad d()
  {
    if (this.j >= this.i.size())
      this.j = 0;
    return (ad)this.i.get(this.j);
  }

  public int[] d(int paramInt)
  {
    return this.a.b(paramInt);
  }

  public d e(int paramInt)
  {
    return this.a.c(paramInt);
  }

  public String[] e()
  {
    String[] arrayOfString = new String[this.i.size()];
    for (int k = 0; k < this.i.size(); k++)
      arrayOfString[k] = ((ad)this.i.get(k)).a;
    return arrayOfString;
  }

  public g f(int paramInt)
  {
    return this.a.d(paramInt);
  }

  public String[] f()
  {
    ArrayList localArrayList = d().c;
    String[] arrayOfString = new String[localArrayList.size()];
    for (int k = 0; k < localArrayList.size(); k++)
      arrayOfString[k] = ((f)localArrayList.get(k)).a;
    return arrayOfString;
  }

  public f g()
  {
    ad localad = d();
    int k = localad.b;
    if ((k >= 0) && (localad.c.size() > 0))
      return (f)d().c.get(k);
    return null;
  }

  public g h()
  {
    if (g() != null)
      return g().d;
    return null;
  }

  public void i()
  {
    int k = c();
    d().c.remove(k);
    if (k > 0)
      b(k - 1);
    k();
  }

  public void j()
  {
    int k = this.j;
    this.i.remove(k);
    if (k > 0)
      this.j = (k - 1);
    if (this.i.size() == 0)
      a("Room1");
    k();
  }

  public void k()
  {
    this.b.a(this.i);
    l();
  }

  public void l()
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
    localSharedPreferences.edit().putInt("roomidx", this.j).commit();
    localSharedPreferences.edit().putBoolean("vibrate", this.d).commit();
    localSharedPreferences.edit().putBoolean("htc6mode", this.e).commit();
  }

  public void m()
  {
    this.a.a();
  }

  public void onCreate()
  {
    super.onCreate();
    this.h = ((Vibrator)getSystemService("vibrator"));
    a();
    try
    {
      k = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
      localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
      int m = localSharedPreferences.getInt("version", 0);
      boolean bool = false;
      if (k != m)
        bool = true;
      this.g = bool;
    }
    catch (Exception localException1)
    {
      try
      {
        SharedPreferences localSharedPreferences;
        a("asmart.mp4", "arc.db", this.g);
        label87: localSharedPreferences.edit().putInt("version", k).commit();
        this.a = new a(this);
        this.a.a(getApplicationContext().getDatabasePath("arc.db").getPath());
        this.b = new b(this);
        n();
        this.c = new ap();
        this.c.a = this;
        return;
        localException1 = localException1;
        int k = 0;
      }
      catch (Exception localException2)
      {
        break label87;
      }
    }
  }

  public void onTerminate()
  {
    super.onTerminate();
    k();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.Globals
 * JD-Core Version:    0.6.2
 */