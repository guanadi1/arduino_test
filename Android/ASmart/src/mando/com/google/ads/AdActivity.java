package com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.ads.b.ad;
import com.google.ads.b.c;
import com.google.ads.b.e;
import com.google.ads.b.h;
import com.google.ads.b.w;
import com.google.ads.b.x;
import com.google.ads.e.a;
import com.google.ads.e.af;
import com.google.ads.e.ag;
import com.google.ads.e.i;
import com.google.ads.e.p;
import com.google.ads.e.q;
import com.google.ads.e.r;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdActivity extends Activity
  implements View.OnClickListener
{
  private static final h a = (h)h.a.b();
  private static final Object b = new Object();
  private static AdActivity c = null;
  private static w d = null;
  private static AdActivity e = null;
  private static AdActivity f = null;
  private static final b g = new b();
  private e h;
  private FrameLayout i;
  private int j;
  private ViewGroup k = null;
  private boolean l;
  private long m;
  private RelativeLayout n;
  private AdActivity o = null;
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean s;
  private c t;

  public static void a(w paramw, x paramx)
  {
    g.a(paramw, paramx);
  }

  private void a(String paramString)
  {
    i.b(paramString);
    finish();
  }

  private void a(String paramString, Throwable paramThrowable)
  {
    i.b(paramString, paramThrowable);
    finish();
  }

  public static boolean b()
  {
    return g.a();
  }

  private RelativeLayout.LayoutParams c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(paramInt3, paramInt4);
    localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
    localLayoutParams.addRule(10);
    localLayoutParams.addRule(9);
    return localLayoutParams;
  }

  public static boolean c()
  {
    return g.b();
  }

  private void h()
  {
    if (!this.l)
      if (this.h != null)
      {
        a.b(this.h);
        this.h.setAdActivity(null);
        this.h.setIsExpandedMraid(false);
        if ((!this.q) && (this.n != null) && (this.k != null))
        {
          if ((!this.r) || (this.s))
            break label238;
          i.a("Disabling hardware acceleration on collapsing MRAID WebView.");
          this.h.g();
        }
      }
    while (true)
    {
      this.n.removeView(this.h);
      this.k.addView(this.h);
      if (this.t != null)
      {
        this.t.e();
        this.t = null;
      }
      if (this == c)
        c = null;
      f = this.o;
      synchronized (b)
      {
        if ((d != null) && (this.q) && (this.h != null))
        {
          if (this.h == d.k())
            d.a();
          this.h.stopLoading();
        }
        if (this == e)
        {
          e = null;
          if (d != null)
          {
            d.s();
            d = null;
          }
        }
        else
        {
          this.l = true;
          i.a("AdActivity is closing.");
          return;
          label238: if ((this.r) || (!this.s))
            continue;
          i.a("Re-enabling hardware acceleration on collapsing MRAID WebView.");
          this.h.h();
          continue;
        }
        i.e("currentAdManager is null while trying to destroy AdActivity.");
      }
    }
  }

  protected View a(int paramInt, boolean paramBoolean)
  {
    this.j = ((int)TypedValue.applyDimension(1, paramInt, getResources().getDisplayMetrics()));
    this.i = new FrameLayout(getApplicationContext());
    this.i.setMinimumWidth(this.j);
    this.i.setMinimumHeight(this.j);
    this.i.setOnClickListener(this);
    a(paramBoolean);
    return this.i;
  }

  public c a()
  {
    return this.t;
  }

  protected c a(Activity paramActivity)
  {
    return new c(paramActivity, this.h);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.t != null)
    {
      this.t.setLayoutParams(c(paramInt1, paramInt2, paramInt3, paramInt4));
      this.t.requestLayout();
    }
  }

  protected void a(e parame, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3)
  {
    requestWindowFeature(1);
    Window localWindow = getWindow();
    localWindow.setFlags(1024, 1024);
    if (a.a >= 11)
    {
      if (!this.r)
        break label105;
      i.a("Enabling hardware acceleration on the AdActivity window.");
      r.a(localWindow);
    }
    while (true)
    {
      ViewParent localViewParent = parame.getParent();
      if (localViewParent != null)
      {
        if (!paramBoolean2)
          break label126;
        if (!(localViewParent instanceof ViewGroup))
          break;
        this.k = ((ViewGroup)localViewParent);
        this.k.removeView(parame);
      }
      if (parame.i() == null)
        break label134;
      a("Interstitial created with an AdWebView that is already in use by another AdActivity.");
      return;
      label105: i.a("Disabling hardware acceleration on the AdActivity WebView.");
      parame.g();
    }
    a("MRAID banner was not a child of a ViewGroup.");
    return;
    label126: a("Interstitial created with an AdWebView that has a parent.");
    return;
    label134: setRequestedOrientation(paramInt);
    parame.setAdActivity(this);
    int i1;
    label153: View localView;
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramBoolean2)
    {
      i1 = 50;
      localView = a(i1, paramBoolean3);
      this.n.addView(parame, -1, -1);
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      if (!paramBoolean2)
        break label264;
      localLayoutParams.addRule(10);
      localLayoutParams.addRule(11);
    }
    while (true)
    {
      this.n.addView(localView, localLayoutParams);
      this.n.setKeepScreenOn(true);
      setContentView(this.n);
      this.n.getRootView().setBackgroundColor(-16777216);
      if (!paramBoolean1)
        break;
      a.a(parame);
      return;
      i1 = 32;
      break label153;
      label264: localLayoutParams.addRule(10);
      localLayoutParams.addRule(9);
    }
  }

  protected void a(w paramw)
  {
    this.h = null;
    this.m = SystemClock.elapsedRealtime();
    this.p = true;
    synchronized (b)
    {
      if (c == null)
      {
        c = this;
        paramw.u();
      }
      return;
    }
  }

  protected void a(HashMap paramHashMap, w paramw)
  {
    int i1 = 0;
    if (paramHashMap == null)
    {
      a("Could not get the paramMap in launchIntent()");
      return;
    }
    Intent localIntent = new Intent();
    String str1 = (String)paramHashMap.get("u");
    String str2 = (String)paramHashMap.get("m");
    String str3 = (String)paramHashMap.get("i");
    String str4 = (String)paramHashMap.get("p");
    String str5 = (String)paramHashMap.get("c");
    String str6 = (String)paramHashMap.get("f");
    String str7 = (String)paramHashMap.get("e");
    int i2;
    if (!TextUtils.isEmpty(str1))
      i2 = 1;
    while (true)
    {
      int i3;
      if (!TextUtils.isEmpty(str2))
      {
        i3 = 1;
        label129: if ((i2 == 0) || (i3 == 0))
          break label439;
        localIntent.setDataAndType(Uri.parse(str1), str2);
        label152: if (TextUtils.isEmpty(str3))
          break label474;
        localIntent.setAction(str3);
        label168: if ((!TextUtils.isEmpty(str4)) && (a.a >= 4))
          p.a(localIntent, str4);
        if (!TextUtils.isEmpty(str5))
        {
          String[] arrayOfString = str5.split("/");
          if (arrayOfString.length < 2)
            i.e("Warning: Could not parse component name from open GMSG: " + str5);
          localIntent.setClassName(arrayOfString[0], arrayOfString[1]);
        }
        if (TextUtils.isEmpty(str6));
      }
      try
      {
        int i6 = Integer.parseInt(str6);
        i5 = i6;
        localIntent.addFlags(i5);
        if (TextUtils.isEmpty(str7));
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
        {
          String str8;
          JSONObject localJSONObject2;
          try
          {
            int i5;
            JSONObject localJSONObject1 = new JSONObject(str7);
            JSONArray localJSONArray = localJSONObject1.names();
            if (i1 < localJSONArray.length())
            {
              str8 = localJSONArray.getString(i1);
              localJSONObject2 = localJSONObject1.getJSONObject(str8);
              int i4 = localJSONObject2.getInt("t");
              switch (i4)
              {
              default:
                i.e("Warning: Unknown type in extras from open GMSG: " + str8 + " (type: " + i4 + ")");
                i1++;
                continue;
                i2 = 0;
                break;
                i3 = 0;
                break label129;
                if (i2 != 0)
                {
                  localIntent.setData(Uri.parse(str1));
                  break label152;
                }
                if (i3 == 0)
                  break label152;
                localIntent.setType(str2);
                break label152;
                if (i2 == 0)
                  break label168;
                localIntent.setAction("android.intent.action.VIEW");
                break label168;
                localNumberFormatException = localNumberFormatException;
                i.e("Warning: Could not parse flags from open GMSG: " + str6);
                i5 = 0;
                break;
              case 1:
                label439: label474: localIntent.putExtra(str8, localJSONObject2.getBoolean("v"));
                continue;
              case 2:
              case 3:
              case 4:
              case 5:
              }
            }
          }
          catch (JSONException localJSONException)
          {
            i.e("Warning: Could not parse extras from open GMSG: " + str7);
          }
          if (!localIntent.filterEquals(new Intent()))
            break label667;
          a("Tried to launch empty intent.");
          return;
          localIntent.putExtra(str8, localJSONObject2.getDouble("v"));
          continue;
          localIntent.putExtra(str8, localJSONObject2.getInt("v"));
          continue;
          localIntent.putExtra(str8, localJSONObject2.getLong("v"));
          continue;
          localIntent.putExtra(str8, localJSONObject2.getString("v"));
        }
        try
        {
          label667: i.a("Launching an intent from AdActivity: " + localIntent);
          startActivity(localIntent);
          a(paramw);
          return;
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          a(localActivityNotFoundException.getMessage(), localActivityNotFoundException);
        }
      }
    }
  }

  public void a(boolean paramBoolean)
  {
    if (this.i != null)
    {
      this.i.removeAllViews();
      if (!paramBoolean)
      {
        ImageButton localImageButton = new ImageButton(this);
        localImageButton.setImageResource(17301527);
        localImageButton.setBackgroundColor(0);
        localImageButton.setOnClickListener(this);
        localImageButton.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.j, this.j, 17);
        this.i.addView(localImageButton, localLayoutParams);
      }
    }
  }

  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.t == null)
    {
      this.t = a(this);
      this.n.addView(this.t, 0, c(paramInt1, paramInt2, paramInt3, paramInt4));
      synchronized (b)
      {
        if (d == null)
        {
          i.e("currentAdManager was null while trying to get the opening AdWebView.");
          return;
        }
        d.l().b(false);
        return;
      }
    }
  }

  public void onClick(View paramView)
  {
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.l = false;
    w localw;
    boolean bool1;
    Bundle localBundle;
    while (true)
    {
      synchronized (b)
      {
        if (d != null)
        {
          localw = d;
          if (e == null)
          {
            e = this;
            localw.t();
          }
          if ((this.o == null) && (f != null))
            this.o = f;
          f = this;
          if (((localw.h().a()) && (e == this)) || ((localw.h().b()) && (this.o == e)))
            localw.v();
          bool1 = localw.q();
          bs localbs = (bs)((br)localw.h().d.a()).b.a();
          if (a.a >= ((Integer)localbs.b.a()).intValue())
          {
            bool2 = true;
            this.s = bool2;
            if (a.a < ((Integer)localbs.d.a()).intValue())
              break label268;
            bool3 = true;
            this.r = bool3;
            this.n = null;
            this.p = false;
            this.q = true;
            this.t = null;
            localBundle = getIntent().getBundleExtra("com.google.ads.AdOpener");
            if (localBundle != null)
              break;
            a("Could not get the Bundle used to create AdActivity.");
          }
        }
        else
        {
          a("Could not get currentAdManager.");
          return;
        }
      }
      boolean bool2 = false;
      continue;
      label268: boolean bool3 = false;
    }
    x localx = new x(localBundle);
    String str1 = localx.b();
    HashMap localHashMap = localx.c();
    if (str1.equals("intent"))
    {
      a(localHashMap, localw);
      return;
    }
    this.n = new RelativeLayout(getApplicationContext());
    if (str1.equals("webapp"))
    {
      this.h = new e(localw.h(), null);
      Map localMap = h.d;
      boolean bool7;
      String str3;
      String str4;
      label466: String str5;
      int i2;
      label495: e locale;
      if (!bool1)
      {
        bool7 = true;
        ad localad = ad.a(localw, localMap, true, bool7);
        localad.d(true);
        if (bool1)
          localad.a(true);
        this.h.setWebViewClient(localad);
        String str2 = (String)localHashMap.get("u");
        str3 = (String)localHashMap.get("baseurl");
        str4 = (String)localHashMap.get("html");
        if (str2 == null)
          break label546;
        this.h.loadUrl(str2);
        str5 = (String)localHashMap.get("o");
        if (!"p".equals(str5))
          break label580;
        i2 = a.b();
        locale = this.h;
        if ((localHashMap == null) || (!"1".equals(localHashMap.get("custom_close"))))
          break label622;
      }
      label546: label580: label622: for (boolean bool8 = true; ; bool8 = false)
      {
        a(locale, false, i2, bool1, bool8);
        return;
        bool7 = false;
        break;
        if (str4 != null)
        {
          this.h.loadDataWithBaseURL(str3, str4, "text/html", "utf-8", null);
          break label466;
        }
        a("Could not get the URL or HTML parameter to show a web app.");
        return;
        if ("l".equals(str5))
        {
          i2 = a.a();
          break label495;
        }
        if (this == e)
        {
          i2 = localw.n();
          break label495;
        }
        i2 = -1;
        break label495;
      }
    }
    int i1;
    boolean bool5;
    boolean bool4;
    if ((str1.equals("interstitial")) || (str1.equals("expand")))
    {
      this.h = localw.k();
      i1 = localw.n();
      if (str1.equals("expand"))
      {
        this.h.setIsExpandedMraid(true);
        this.q = false;
        bool5 = false;
        if (localHashMap != null)
        {
          boolean bool6 = "1".equals(localHashMap.get("custom_close"));
          bool5 = false;
          if (bool6)
            bool5 = true;
        }
        if ((!this.r) || (this.s))
          break label816;
        i.a("Re-enabling hardware acceleration on expanding MRAID WebView.");
        this.h.h();
        bool4 = bool5;
      }
    }
    while (true)
    {
      a(this.h, true, i1, bool1, bool4);
      return;
      bool4 = this.h.j();
      continue;
      a("Unknown AdOpener, <action: " + str1 + ">");
      return;
      label816: bool4 = bool5;
    }
  }

  public void onDestroy()
  {
    if (this.n != null)
      this.n.removeAllViews();
    if (isFinishing())
    {
      h();
      if ((this.q) && (this.h != null))
      {
        this.h.stopLoading();
        this.h.destroy();
        this.h = null;
      }
    }
    super.onDestroy();
  }

  public void onPause()
  {
    if (isFinishing())
      h();
    super.onPause();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if ((this.p) && (paramBoolean) && (SystemClock.elapsedRealtime() - this.m > 250L))
    {
      i.d("Launcher AdActivity got focus and is closing.");
      finish();
    }
    super.onWindowFocusChanged(paramBoolean);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.AdActivity
 * JD-Core Version:    0.6.2
 */