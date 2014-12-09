package com.google.ads.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.bq;
import com.google.ads.bt;
import com.google.ads.e;
import com.google.ads.e.a;
import com.google.ads.e.af;
import com.google.ads.e.ag;
import com.google.ads.e.i;
import com.google.ads.g;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public final class y
  implements Runnable
{
  private final bq a;
  private final aa b;
  private volatile boolean c;
  private boolean d;
  private String e;
  private Thread f = null;

  y(bq parambq)
  {
    this(parambq, new z());
  }

  y(bq parambq, aa paramaa)
  {
    this.a = parambq;
    this.b = paramaa;
  }

  private void a(Context paramContext, HttpURLConnection paramHttpURLConnection)
  {
    String str = PreferenceManager.getDefaultSharedPreferences(paramContext).getString("drt", "");
    if ((this.d) && (!TextUtils.isEmpty(str)))
    {
      if (a.a == 8)
        paramHttpURLConnection.addRequestProperty("X-Afma-drt-Cookie", str);
    }
    else
      return;
    paramHttpURLConnection.addRequestProperty("Cookie", str);
  }

  private void a(HttpURLConnection paramHttpURLConnection)
  {
    b(paramHttpURLConnection);
    f(paramHttpURLConnection);
    g(paramHttpURLConnection);
    h(paramHttpURLConnection);
    i(paramHttpURLConnection);
    e(paramHttpURLConnection);
    j(paramHttpURLConnection);
    k(paramHttpURLConnection);
    l(paramHttpURLConnection);
    d(paramHttpURLConnection);
    c(paramHttpURLConnection);
    m(paramHttpURLConnection);
    n(paramHttpURLConnection);
  }

  private void a(HttpURLConnection paramHttpURLConnection, int paramInt)
  {
    if ((300 <= paramInt) && (paramInt < 400))
    {
      String str2 = paramHttpURLConnection.getHeaderField("Location");
      if (str2 == null)
      {
        i.c("Could not get redirect location from a " + paramInt + " redirect.");
        ((n)this.a.b.a()).a(e.d);
        a();
        return;
      }
      a(paramHttpURLConnection);
      this.e = str2;
      return;
    }
    if (paramInt == 200)
    {
      a(paramHttpURLConnection);
      String str1 = a.a(new InputStreamReader(paramHttpURLConnection.getInputStream())).trim();
      i.a("Response content is: " + str1);
      if (TextUtils.isEmpty(str1))
      {
        i.a("Response message is null or zero length: " + str1);
        ((n)this.a.b.a()).a(e.b);
        a();
        return;
      }
      ((n)this.a.b.a()).a(str1, this.e);
      a();
      return;
    }
    if (paramInt == 400)
    {
      i.c("Bad request");
      ((n)this.a.b.a()).a(e.a);
      a();
      return;
    }
    i.c("Invalid response code: " + paramInt);
    ((n)this.a.b.a()).a(e.d);
    a();
  }

  private void b()
  {
    while (!this.c)
    {
      URL localURL = new URL(this.e);
      HttpURLConnection localHttpURLConnection = this.b.a(localURL);
      try
      {
        a((Context)((bt)this.a.a.a()).f.a(), localHttpURLConnection);
        a.a(localHttpURLConnection, (Context)((bt)this.a.a.a()).f.a());
        localHttpURLConnection.setInstanceFollowRedirects(false);
        localHttpURLConnection.connect();
        a(localHttpURLConnection, localHttpURLConnection.getResponseCode());
        localHttpURLConnection.disconnect();
      }
      finally
      {
        localHttpURLConnection.disconnect();
      }
    }
  }

  private void b(HttpURLConnection paramHttpURLConnection)
  {
    String str = paramHttpURLConnection.getHeaderField("X-Afma-Debug-Dialog");
    if (!TextUtils.isEmpty(str))
      ((n)this.a.b.a()).f(str);
  }

  private void c(HttpURLConnection paramHttpURLConnection)
  {
    String str = paramHttpURLConnection.getHeaderField("Content-Type");
    if (!TextUtils.isEmpty(str))
      ((n)this.a.b.a()).b(str);
  }

  private void d(HttpURLConnection paramHttpURLConnection)
  {
    String str = paramHttpURLConnection.getHeaderField("X-Afma-Mediation");
    if (!TextUtils.isEmpty(str))
      ((n)this.a.b.a()).b(Boolean.valueOf(str).booleanValue());
  }

  private void e(HttpURLConnection paramHttpURLConnection)
  {
    String str = paramHttpURLConnection.getHeaderField("X-Afma-Interstitial-Timeout");
    if (!TextUtils.isEmpty(str));
    try
    {
      float f1 = Float.parseFloat(str);
      ((w)((bt)this.a.a.a()).b.a()).a(()(f1 * 1000.0F));
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      i.d("Could not get timeout value: " + str, localNumberFormatException);
    }
  }

  private void f(HttpURLConnection paramHttpURLConnection)
  {
    String str1 = paramHttpURLConnection.getHeaderField("X-Afma-Tracking-Urls");
    if (!TextUtils.isEmpty(str1))
      for (String str2 : str1.trim().split("\\s+"))
        ((w)((bt)this.a.a.a()).b.a()).b(str2);
  }

  private void g(HttpURLConnection paramHttpURLConnection)
  {
    String str1 = paramHttpURLConnection.getHeaderField("X-Afma-Manual-Tracking-Urls");
    if (!TextUtils.isEmpty(str1))
      for (String str2 : str1.trim().split("\\s+"))
        ((w)((bt)this.a.a.a()).b.a()).c(str2);
  }

  private void h(HttpURLConnection paramHttpURLConnection)
  {
    String str1 = paramHttpURLConnection.getHeaderField("X-Afma-Click-Tracking-Urls");
    if (!TextUtils.isEmpty(str1))
      for (String str2 : str1.trim().split("\\s+"))
        ((n)this.a.b.a()).a(str2);
  }

  private void i(HttpURLConnection paramHttpURLConnection)
  {
    String str = paramHttpURLConnection.getHeaderField("X-Afma-Refresh-Rate");
    if (!TextUtils.isEmpty(str));
    w localw;
    do
      try
      {
        float f1 = Float.parseFloat(str);
        localw = (w)((bt)this.a.a.a()).b.a();
        if (f1 > 0.0F)
        {
          localw.a(f1);
          if (!localw.r())
            localw.f();
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        i.d("Could not get refresh value: " + str, localNumberFormatException);
        return;
      }
    while (!localw.r());
    localw.e();
  }

  private void j(HttpURLConnection paramHttpURLConnection)
  {
    String str = paramHttpURLConnection.getHeaderField("X-Afma-Orientation");
    if (!TextUtils.isEmpty(str))
    {
      if (!str.equals("portrait"))
        break label45;
      ((n)this.a.b.a()).a(a.b());
    }
    label45: 
    while (!str.equals("landscape"))
      return;
    ((n)this.a.b.a()).a(a.a());
  }

  private void k(HttpURLConnection paramHttpURLConnection)
  {
    if (!TextUtils.isEmpty(paramHttpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life")));
    try
    {
      long l = Long.parseLong(paramHttpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"));
      ((w)((bt)this.a.a.a()).b.a()).b(l);
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      i.e("Got bad value of Doritos cookie cache life from header: " + paramHttpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life") + ". Using default value instead.");
    }
  }

  private void l(HttpURLConnection paramHttpURLConnection)
  {
    String str = paramHttpURLConnection.getHeaderField("Cache-Control");
    if (!TextUtils.isEmpty(str))
      ((n)this.a.b.a()).c(str);
  }

  private void m(HttpURLConnection paramHttpURLConnection)
  {
    String str = paramHttpURLConnection.getHeaderField("X-Afma-Ad-Size");
    if (!TextUtils.isEmpty(str))
      try
      {
        String[] arrayOfString = str.split("x", 2);
        if (arrayOfString.length != 2)
        {
          i.e("Could not parse size header: " + str);
          return;
        }
        int i = Integer.parseInt(arrayOfString[0]);
        int j = Integer.parseInt(arrayOfString[1]);
        ((n)this.a.b.a()).a(new g(i, j));
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        i.e("Could not parse size header: " + str);
      }
  }

  private void n(HttpURLConnection paramHttpURLConnection)
  {
    String str = paramHttpURLConnection.getHeaderField("X-Afma-Disable-Activation-And-Scroll");
    if (!TextUtils.isEmpty(str))
      ((n)this.a.b.a()).a(str.equals("1"));
  }

  void a()
  {
    this.c = true;
  }

  void a(String paramString)
  {
    try
    {
      if (this.f == null)
      {
        this.e = paramString;
        this.c = false;
        this.f = new Thread(this);
        this.f.start();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public void run()
  {
    try
    {
      b();
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      i.b("Received malformed ad url from javascript.", localMalformedURLException);
      ((n)this.a.b.a()).a(e.d);
      return;
    }
    catch (IOException localIOException)
    {
      i.b("IOException connecting to ad url.", localIOException);
      ((n)this.a.b.a()).a(e.c);
      return;
    }
    catch (Throwable localThrowable)
    {
      i.b("An unknown error occurred in AdResponseLoader.", localThrowable);
      ((n)this.a.b.a()).a(e.d);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.y
 * JD-Core Version:    0.6.2
 */