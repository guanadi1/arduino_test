package com.google.ads;

import android.webkit.WebView;
import com.google.ads.b.e;
import com.google.ads.b.w;
import com.google.ads.e.i;
import java.util.HashMap;

public class bz
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    if ((paramWebView instanceof e))
    {
      ((e)paramWebView).setCustomClose("1".equals(paramHashMap.get("custom_close")));
      return;
    }
    i.b("Trying to set a custom close icon on a WebView that isn't an AdWebView");
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bz
 * JD-Core Version:    0.6.2
 */