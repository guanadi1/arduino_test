package com.google.ads;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.b.ab;
import com.google.ads.b.w;
import com.google.ads.e.af;
import com.google.ads.e.ag;
import com.google.ads.e.i;
import java.util.HashMap;
import java.util.Locale;

public class bx
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("u");
    if (str1 == null)
    {
      i.e("Could not get URL from click gmsg.");
      return;
    }
    ab localab = paramw.m();
    if (localab != null)
    {
      Uri localUri4 = Uri.parse(str1);
      String str2 = localUri4.getHost();
      if ((str2 != null) && (str2.toLowerCase(Locale.US).endsWith(".admob.com")))
      {
        String str3 = localUri4.getPath();
        String str4 = null;
        if (str3 != null)
        {
          String[] arrayOfString = str3.split("/");
          int i = arrayOfString.length;
          str4 = null;
          if (i >= 4)
            str4 = arrayOfString[2] + "/" + arrayOfString[3];
        }
        localab.a(str4);
      }
    }
    bt localbt = paramw.h();
    Context localContext = (Context)localbt.f.a();
    Uri localUri1 = Uri.parse(str1);
    try
    {
      ak localak = (ak)localbt.s.a();
      if ((localak != null) && (localak.a(localUri1)))
      {
        Uri localUri3 = localak.a(localUri1, localContext);
        localUri2 = localUri3;
        new Thread(new o(localUri2.toString(), localContext)).start();
        return;
      }
    }
    catch (al localal)
    {
      while (true)
      {
        i.e("Unable to append parameter to URL: " + str1);
        Uri localUri2 = localUri1;
      }
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bx
 * JD-Core Version:    0.6.2
 */