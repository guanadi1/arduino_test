package com.google.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.b.h;
import com.google.ads.b.w;
import com.google.ads.e.i;
import com.google.ads.e.q;
import java.util.HashMap;

public class bw
  implements bu
{
  private static final h a = (h)h.a.b();

  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("urls");
    if (str1 == null)
    {
      i.e("Could not get the urls param from canOpenURLs gmsg.");
      return;
    }
    String[] arrayOfString1 = str1.split(",");
    HashMap localHashMap = new HashMap();
    PackageManager localPackageManager = paramWebView.getContext().getPackageManager();
    int i = arrayOfString1.length;
    int j = 0;
    if (j < i)
    {
      String str2 = arrayOfString1[j];
      String[] arrayOfString2 = str2.split(";", 2);
      String str3 = arrayOfString2[0];
      String str4;
      if (arrayOfString2.length >= 2)
      {
        str4 = arrayOfString2[1];
        label100: if (localPackageManager.resolveActivity(new Intent(str4, Uri.parse(str3)), 65536) == null)
          break label153;
      }
      label153: for (boolean bool = true; ; bool = false)
      {
        localHashMap.put(str2, Boolean.valueOf(bool));
        j++;
        break;
        str4 = "android.intent.action.VIEW";
        break label100;
      }
    }
    a.a(paramWebView, localHashMap);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bw
 * JD-Core Version:    0.6.2
 */