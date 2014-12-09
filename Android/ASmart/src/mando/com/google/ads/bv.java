package com.google.ads;

import android.webkit.WebView;
import com.google.ads.b.w;
import com.google.ads.e.i;
import java.util.HashMap;

public class bv
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("name");
    if (str == null)
    {
      i.b("Error: App event with no name parameter.");
      return;
    }
    paramw.a(str, (String)paramHashMap.get("info"));
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bv
 * JD-Core Version:    0.6.2
 */