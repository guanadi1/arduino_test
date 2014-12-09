package com.google.ads;

import android.webkit.WebView;
import com.google.ads.b.w;
import com.google.ads.b.x;
import com.google.ads.e.i;
import java.util.HashMap;

public class cf
  implements bu
{
  private b a;

  public cf()
  {
    this(new b());
  }

  public cf(b paramb)
  {
    this.a = paramb;
  }

  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("a");
    if (str == null)
    {
      i.a("Could not get the action parameter for open GMSG.");
      return;
    }
    if (str.equals("webapp"))
    {
      this.a.a(paramw, new x("webapp", paramHashMap));
      return;
    }
    if (str.equals("expand"))
    {
      this.a.a(paramw, new x("expand", paramHashMap));
      return;
    }
    this.a.a(paramw, new x("intent", paramHashMap));
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.cf
 * JD-Core Version:    0.6.2
 */