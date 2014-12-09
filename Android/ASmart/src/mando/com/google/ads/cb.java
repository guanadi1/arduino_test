package com.google.ads;

import android.webkit.WebView;
import com.google.ads.b.n;
import com.google.ads.b.w;
import com.google.ads.e.i;
import java.util.HashMap;

public class cb
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("type");
    String str2 = (String)paramHashMap.get("errors");
    i.e("Invalid " + str1 + " request error: " + str2);
    n localn = paramw.j();
    if (localn != null)
      localn.a(e.a);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.cb
 * JD-Core Version:    0.6.2
 */