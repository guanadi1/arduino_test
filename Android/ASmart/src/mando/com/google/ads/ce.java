package com.google.ads;

import android.webkit.WebView;
import com.google.ads.b.w;
import com.google.ads.e.i;
import java.util.HashMap;

public class ce
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("string");
    String str2 = (String)paramHashMap.get("afma_notify_dt");
    i.c("Received log message: <\"string\": \"" + str1 + "\", \"afmaNotifyDt\": \"" + str2 + "\">");
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.ce
 * JD-Core Version:    0.6.2
 */