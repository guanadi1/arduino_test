package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.b.w;
import com.google.ads.e.af;
import com.google.ads.e.ag;
import com.google.ads.e.ah;

public class bt extends com.google.ads.e.ac
{
  public final af a;
  public final af b;
  public final ah c;
  public final af d;
  public final af e;
  public final af f;
  public final af g;
  public final af h;
  public final af i;
  public final af j;
  public final af k;
  public final ag l = new ag(this, "currentAd", null);
  public final ag m = new ag(this, "nextAd", null);
  public final ag n;
  public final ag o = new ag(this, "adListener");
  public final ag p = new ag(this, "appEventListener");
  public final ag q = new ag(this, "swipeableEventListener");
  public final ag r = new ag(this, "spamSignals", null);
  public final ag s = new ag(this, "spamSignalsUtil", null);
  public final ag t = new ag(this, "usesManualImpressions", Boolean.valueOf(false));

  public bt(br parambr, a parama, AdView paramAdView, i parami, String paramString, Activity paramActivity, Context paramContext, ViewGroup paramViewGroup, com.google.ads.b.ac paramac, w paramw)
  {
    this.d = new af(this, "appState", parambr);
    this.a = new af(this, "ad", parama);
    this.j = new af(this, "adView", paramAdView);
    this.g = new af(this, "adType", paramac);
    this.h = new af(this, "adUnitId", paramString);
    this.c = new ah(this, "activity", paramActivity);
    this.k = new af(this, "interstitialAd", parami);
    this.i = new af(this, "bannerContainer", paramViewGroup);
    this.f = new af(this, "applicationContext", paramContext);
    this.n = new ag(this, "adSizes", null);
    this.b = new af(this, "adManager", paramw);
    com.google.ads.b.a locala = null;
    if (paramac != null)
    {
      boolean bool = paramac.b();
      locala = null;
      if (bool)
        locala = new com.google.ads.b.a(this);
    }
    this.e = new af(this, "activationOverlay", locala);
  }

  public boolean a()
  {
    return !b();
  }

  public boolean b()
  {
    return ((com.google.ads.b.ac)this.g.a()).a();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bt
 * JD-Core Version:    0.6.2
 */