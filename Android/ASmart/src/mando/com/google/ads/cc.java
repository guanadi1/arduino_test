package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.b.n;
import com.google.ads.b.u;
import com.google.ads.b.w;
import com.google.ads.e.a;
import com.google.ads.e.ag;
import com.google.ads.e.ah;
import com.google.ads.e.i;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;

public class cc
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("url");
    String str2 = (String)paramHashMap.get("type");
    String str3 = (String)paramHashMap.get("afma_notify_dt");
    String str4 = (String)paramHashMap.get("activation_overlay_url");
    String str5 = (String)paramHashMap.get("check_packages");
    boolean bool1 = "1".equals(paramHashMap.get("drt_include"));
    String str6 = (String)paramHashMap.get("request_scenario");
    boolean bool2 = "1".equals(paramHashMap.get("use_webview_loadurl"));
    u localu;
    if (u.d.e.equals(str6))
      localu = u.d;
    BigInteger localBigInteger2;
    while (true)
    {
      i.c("Received ad url: <url: \"" + str1 + "\" type: \"" + str2 + "\" afmaNotifyDt: \"" + str3 + "\" activationOverlayUrl: \"" + str4 + "\" useWebViewLoadUrl: \"" + bool2 + "\">");
      if ((TextUtils.isEmpty(str5)) || (TextUtils.isEmpty(str1)))
        break label386;
      BigInteger localBigInteger1 = new BigInteger(new byte[1]);
      String[] arrayOfString = str5.split(",");
      int i = 0;
      localBigInteger2 = localBigInteger1;
      while (i < arrayOfString.length)
      {
        if (a.a((Context)paramw.h().c.a(), arrayOfString[i]))
          localBigInteger2 = localBigInteger2.setBit(i);
        i++;
      }
      if (u.c.e.equals(str6))
        localu = u.c;
      else if (u.a.e.equals(str6))
        localu = u.a;
      else
        localu = u.b;
    }
    String str7 = String.format(Locale.US, "%X", new Object[] { localBigInteger2 });
    str1 = str1.replaceAll("%40installed_markets%40", str7);
    br.a().a.a(str7);
    i.c("Ad url modified to " + str1);
    label386: n localn = paramw.j();
    if (localn != null)
    {
      localn.d(bool1);
      localn.a(localu);
      localn.e(bool2);
      localn.e(str4);
      localn.d(str1);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.cc
 * JD-Core Version:    0.6.2
 */