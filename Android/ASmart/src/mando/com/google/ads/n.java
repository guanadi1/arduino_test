package com.google.ads;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.google.ads.b.c;
import com.google.ads.b.e;
import com.google.ads.b.h;
import com.google.ads.b.w;
import com.google.ads.e.a;
import com.google.ads.e.i;
import com.google.ads.e.q;
import java.util.HashMap;

public class n
  implements bu
{
  private static final h a = (h)h.a.b();

  protected int a(HashMap paramHashMap, String paramString, int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    String str = (String)paramHashMap.get(paramString);
    if (str != null);
    try
    {
      float f = TypedValue.applyDimension(1, Integer.parseInt(str), paramDisplayMetrics);
      paramInt = (int)f;
      return paramInt;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      i.a("Could not parse \"" + paramString + "\" in a video gmsg: " + str);
    }
    return paramInt;
  }

  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("action");
    if (str1 == null)
    {
      i.a("No \"action\" parameter in a video gmsg.");
      return;
    }
    e locale;
    AdActivity localAdActivity;
    if ((paramWebView instanceof e))
    {
      locale = (e)paramWebView;
      localAdActivity = locale.i();
      if (localAdActivity == null)
        i.a("Could not get adActivity for a video gmsg.");
    }
    else
    {
      i.a("Could not get adWebView for a video gmsg.");
      return;
    }
    boolean bool1 = str1.equals("new");
    boolean bool2 = str1.equals("position");
    if ((bool1) || (bool2))
    {
      DisplayMetrics localDisplayMetrics1 = a.a(localAdActivity);
      int i = a(paramHashMap, "x", 0, localDisplayMetrics1);
      int j = a(paramHashMap, "y", 0, localDisplayMetrics1);
      int k = a(paramHashMap, "w", -1, localDisplayMetrics1);
      int m = a(paramHashMap, "h", -1, localDisplayMetrics1);
      if ((bool1) && (localAdActivity.a() == null))
      {
        localAdActivity.b(i, j, k, m);
        return;
      }
      localAdActivity.a(i, j, k, m);
      return;
    }
    c localc = localAdActivity.a();
    if (localc == null)
    {
      a.a(locale, "onVideoEvent", "{'event': 'error', 'what': 'no_video_view'}");
      return;
    }
    if (str1.equals("click"))
    {
      DisplayMetrics localDisplayMetrics2 = a.a(localAdActivity);
      int n = a(paramHashMap, "x", 0, localDisplayMetrics2);
      int i1 = a(paramHashMap, "y", 0, localDisplayMetrics2);
      long l = SystemClock.uptimeMillis();
      localc.a(MotionEvent.obtain(l, l, 0, n, i1, 0));
      return;
    }
    if (str1.equals("controls"))
    {
      String str3 = (String)paramHashMap.get("enabled");
      if (str3 == null)
      {
        i.a("No \"enabled\" parameter in a controls video gmsg.");
        return;
      }
      if (str3.equals("true"))
      {
        localc.setMediaControllerEnabled(true);
        return;
      }
      localc.setMediaControllerEnabled(false);
      return;
    }
    if (str1.equals("currentTime"))
    {
      String str2 = (String)paramHashMap.get("time");
      if (str2 == null)
      {
        i.a("No \"time\" parameter in a currentTime video gmsg.");
        return;
      }
      try
      {
        localc.a((int)(1000.0F * Float.parseFloat(str2)));
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        i.a("Could not parse \"time\" parameter: " + str2);
        return;
      }
    }
    if (str1.equals("hide"))
    {
      localc.setVisibility(4);
      return;
    }
    if (str1.equals("load"))
    {
      localc.b();
      return;
    }
    if (str1.equals("pause"))
    {
      localc.c();
      return;
    }
    if (str1.equals("play"))
    {
      localc.d();
      return;
    }
    if (str1.equals("show"))
    {
      localc.setVisibility(0);
      return;
    }
    if (str1.equals("src"))
    {
      localc.setSrc((String)paramHashMap.get("src"));
      return;
    }
    i.a("Unknown video action: " + str1);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.n
 * JD-Core Version:    0.6.2
 */