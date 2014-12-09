package com.google.ads;

import android.app.Activity;
import android.webkit.WebView;
import com.google.ads.b.w;
import com.google.ads.e.ag;
import com.google.ads.e.ah;
import com.google.ads.e.i;
import java.util.HashMap;

public class m
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    if ((Activity)paramw.h().c.a() == null)
      i.e("Activity was null while responding to touch gmsg.");
    while (true)
    {
      return;
      String str1 = (String)paramHashMap.get("tx");
      String str2 = (String)paramHashMap.get("ty");
      String str3 = (String)paramHashMap.get("td");
      try
      {
        int i = Integer.parseInt(str1);
        int j = Integer.parseInt(str2);
        int k = Integer.parseInt(str3);
        ai localai = (ai)paramw.h().r.a();
        if (localai != null)
        {
          localai.a(i, j, k);
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        i.e("Could not parse touch parameters from gmsg.");
      }
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.m
 * JD-Core Version:    0.6.2
 */