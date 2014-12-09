package com.google.ads;

import android.webkit.WebView;
import com.google.ads.b.e;
import com.google.ads.b.w;
import com.google.ads.e.i;
import java.util.HashMap;

public class by
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    if ((paramWebView instanceof e))
    {
      ((e)paramWebView).f();
      return;
    }
    i.b("Trying to close WebView that isn't an AdWebView");
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.by
 * JD-Core Version:    0.6.2
 */