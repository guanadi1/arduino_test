package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.b.w;
import com.google.ads.e.af;
import com.google.ads.e.i;
import java.util.HashMap;

public class ca
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("u");
    if (TextUtils.isEmpty(str))
    {
      i.e("Could not get URL from track gmsg.");
      return;
    }
    new Thread(new o(str, (Context)paramw.h().f.a())).start();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.ca
 * JD-Core Version:    0.6.2
 */