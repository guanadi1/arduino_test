package com.google.ads.b;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.bu;
import com.google.ads.e.a;
import com.google.ads.e.q;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class h
{
  public static final q a = new j();
  public static final Map b = Collections.unmodifiableMap(new k());
  public static final Map c = Collections.unmodifiableMap(new l());
  public static final Map d = Collections.unmodifiableMap(new i());
  private static final h e = new h();

  public String a(Uri paramUri, HashMap paramHashMap)
  {
    if (c(paramUri))
    {
      String str = paramUri.getHost();
      if (str == null)
      {
        com.google.ads.e.i.e("An error occurred while parsing the AMSG parameters.");
        return null;
      }
      if (str.equals("launch"))
      {
        paramHashMap.put("a", "intent");
        paramHashMap.put("u", paramHashMap.get("url"));
        paramHashMap.remove("url");
        return "/open";
      }
      if (str.equals("closecanvas"))
        return "/close";
      if (str.equals("log"))
        return "/log";
      com.google.ads.e.i.e("An error occurred while parsing the AMSG: " + paramUri.toString());
      return null;
    }
    if (b(paramUri))
      return paramUri.getPath();
    com.google.ads.e.i.e("Message was neither a GMSG nor an AMSG.");
    return null;
  }

  public void a(WebView paramWebView)
  {
    a(paramWebView, "onshow", "{'version': 'afma-sdk-a-v6.4.1'}");
  }

  public void a(WebView paramWebView, String paramString)
  {
    com.google.ads.e.i.a("Sending JS to a WebView: " + paramString);
    paramWebView.loadUrl("javascript:" + paramString);
  }

  public void a(WebView paramWebView, String paramString1, String paramString2)
  {
    if (paramString2 != null)
    {
      a(paramWebView, "AFMA_ReceiveMessage" + "('" + paramString1 + "', " + paramString2 + ");");
      return;
    }
    a(paramWebView, "AFMA_ReceiveMessage" + "('" + paramString1 + "');");
  }

  public void a(WebView paramWebView, Map paramMap)
  {
    a(paramWebView, "openableURLs", new JSONObject(paramMap).toString());
  }

  public void a(w paramw, Map paramMap, Uri paramUri, WebView paramWebView)
  {
    HashMap localHashMap = a.b(paramUri);
    if (localHashMap == null)
    {
      com.google.ads.e.i.e("An error occurred while parsing the message parameters.");
      return;
    }
    String str = a(paramUri, localHashMap);
    if (str == null)
    {
      com.google.ads.e.i.e("An error occurred while parsing the message.");
      return;
    }
    bu localbu = (bu)paramMap.get(str);
    if (localbu == null)
    {
      com.google.ads.e.i.e("No AdResponse found, <message: " + str + ">");
      return;
    }
    localbu.a(paramw, localHashMap, paramWebView);
  }

  public boolean a(Uri paramUri)
  {
    if ((paramUri == null) || (!paramUri.isHierarchical()));
    while ((!b(paramUri)) && (!c(paramUri)))
      return false;
    return true;
  }

  public void b(WebView paramWebView)
  {
    a(paramWebView, "onhide", null);
  }

  public boolean b(Uri paramUri)
  {
    String str1 = paramUri.getScheme();
    if ((str1 == null) || (!str1.equals("gmsg")));
    String str2;
    do
    {
      return false;
      str2 = paramUri.getAuthority();
    }
    while ((str2 == null) || (!str2.equals("mobileads.google.com")));
    return true;
  }

  public boolean c(Uri paramUri)
  {
    String str = paramUri.getScheme();
    return (str != null) && (str.equals("admob"));
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.h
 * JD-Core Version:    0.6.2
 */