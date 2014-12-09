package com.google.ads.b;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.google.ads.AdActivity;
import com.google.ads.AdView;
import com.google.ads.at;
import com.google.ads.az;
import com.google.ads.ba;
import com.google.ads.bc;
import com.google.ads.bd;
import com.google.ads.bh;
import com.google.ads.bi;
import com.google.ads.bk;
import com.google.ads.bq;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import com.google.ads.d;
import com.google.ads.e.af;
import com.google.ads.e.ag;
import com.google.ads.e.ah;
import com.google.ads.g;
import com.google.ads.j;
import com.google.ads.o;
import com.google.ads.p;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class w
{
  private static final Object a = new Object();
  private String A = null;
  private String B = null;
  private final bt b;
  private n c;
  private d d;
  private ab e;
  private e f;
  private ad g;
  private boolean h = false;
  private long i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private SharedPreferences o;
  private long p;
  private p q;
  private boolean r;
  private LinkedList s;
  private LinkedList t;
  private LinkedList u;
  private int v = -1;
  private Boolean w;
  private bc x;
  private bd y;
  private bh z;

  public w(com.google.ads.a parama, Activity paramActivity, g paramg, String paramString, ViewGroup paramViewGroup, boolean paramBoolean)
  {
    this.r = paramBoolean;
    this.e = new ab();
    this.c = null;
    this.d = null;
    this.k = false;
    this.p = 60000L;
    this.l = false;
    this.n = false;
    this.m = true;
    ac localac;
    br localbr2;
    AdView localAdView2;
    if (paramg == null)
    {
      localac = ac.a;
      if ((parama instanceof com.google.ads.a.c))
        localac.a(true);
      if (paramActivity != null)
        break label188;
      localbr2 = br.a();
      if (!(parama instanceof AdView))
        break label176;
      localAdView2 = (AdView)parama;
      label122: if (!(parama instanceof com.google.ads.i))
        break label182;
    }
    label176: label182: for (com.google.ads.i locali2 = (com.google.ads.i)parama; ; locali2 = null)
    {
      this.b = new bt(localbr2, parama, localAdView2, locali2, paramString, null, null, paramViewGroup, localac, this);
      return;
      localac = ac.a(paramg, paramActivity.getApplicationContext());
      break;
      localAdView2 = null;
      break label122;
    }
    while (true)
    {
      synchronized (a)
      {
        label188: this.o = paramActivity.getApplicationContext().getSharedPreferences("GoogleAdMobAdsPrefs", 0);
        if (paramBoolean)
        {
          long l1 = this.o.getLong("Timeout" + paramString, -1L);
          if (l1 < 0L)
          {
            this.i = 5000L;
            br localbr1 = br.a();
            if (!(parama instanceof AdView))
              break label453;
            localAdView1 = (AdView)parama;
            if (!(parama instanceof com.google.ads.i))
              break label459;
            locali1 = (com.google.ads.i)parama;
            this.b = new bt(localbr1, parama, localAdView1, locali1, paramString, paramActivity, paramActivity.getApplicationContext(), paramViewGroup, localac, this);
            this.q = new p(this);
            this.s = new LinkedList();
            this.t = new LinkedList();
            this.u = new LinkedList();
            a();
            com.google.ads.e.a.h((Context)this.b.f.a());
            this.x = new bc();
            this.y = new bd(this);
            this.w = null;
            this.z = null;
            return;
          }
          this.i = l1;
        }
      }
      this.i = 60000L;
      continue;
      label453: AdView localAdView1 = null;
      continue;
      label459: com.google.ads.i locali1 = null;
    }
  }

  private void a(bh parambh, Boolean paramBoolean)
  {
    Object localObject = parambh.d();
    if (localObject == null)
    {
      localObject = new ArrayList();
      ((List)localObject).add("http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@&adt=@gw_adt@&aec=@gw_aec@");
    }
    String str = parambh.b();
    a((List)localObject, parambh.a(), str, parambh.c(), paramBoolean, this.e.d(), this.e.e());
  }

  private void a(List paramList, String paramString)
  {
    Object localObject;
    if (paramList == null)
    {
      localObject = new ArrayList();
      ((List)localObject).add("http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&adt=@gw_adt@&aec=@gw_aec@");
    }
    while (true)
    {
      a((List)localObject, null, null, paramString, null, this.e.d(), this.e.e());
      return;
      localObject = paramList;
    }
  }

  private void a(List paramList, String paramString1, String paramString2, String paramString3, Boolean paramBoolean, String paramString4, String paramString5)
  {
    String str1 = com.google.ads.e.a.a((Context)this.b.f.a());
    az localaz = az.a();
    String str2 = localaz.b().toString();
    String str3 = localaz.c().toString();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      new Thread(new o(bi.a((String)localIterator.next(), (String)this.b.h.a(), paramBoolean, str1, paramString1, paramString2, paramString3, str2, str3, paramString4, paramString5), (Context)this.b.f.a())).start();
    this.e.b();
  }

  public LinkedList A()
  {
    return this.t;
  }

  public void a()
  {
    try
    {
      g localg = ((ac)this.b.g.a()).c();
      if (com.google.ads.e.a.a >= 14);
      for (Object localObject2 = new com.google.ads.e.e(this.b, localg); ; localObject2 = new e(this.b, localg))
      {
        this.f = ((e)localObject2);
        this.f.setVisibility(8);
        this.g = ad.a(this, h.d, true, this.b.b());
        this.f.setWebViewClient(this.g);
        bs localbs = (bs)((br)this.b.d.a()).b.a();
        if ((com.google.ads.e.a.a < ((Integer)localbs.b.a()).intValue()) && (!((ac)this.b.g.a()).a()))
        {
          com.google.ads.e.i.a("Disabling hardware acceleration for a banner.");
          this.f.g();
        }
        return;
      }
    }
    finally
    {
    }
  }

  public void a(float paramFloat)
  {
    try
    {
      long l1 = this.p;
      this.p = (()(1000.0F * paramFloat));
      if ((r()) && (this.p != l1))
      {
        e();
        f();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(int paramInt)
  {
    try
    {
      this.v = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a locala = (a)this.b.e.a();
    Context localContext1 = (Context)this.b.f.a();
    int i1;
    FrameLayout.LayoutParams localLayoutParams;
    int i3;
    if (paramInt3 < 0)
    {
      i1 = ((ac)this.b.g.a()).c().a();
      int i2 = com.google.ads.e.a.a(localContext1, i1);
      Context localContext2 = (Context)this.b.f.a();
      if (paramInt4 < 0)
        paramInt4 = ((ac)this.b.g.a()).c().b();
      localLayoutParams = new FrameLayout.LayoutParams(i2, com.google.ads.e.a.a(localContext2, paramInt4));
      if (paramInt3 >= 0)
        break label279;
      i3 = 0;
    }
    for (int i4 = 0; ; i4 = paramInt1)
    {
      if (i4 < 0);
      for (int i5 = ((a)this.b.e.a()).d(); ; i5 = i4)
      {
        if (i3 < 0)
          i3 = ((a)this.b.e.a()).c();
        ((a)this.b.e.a()).setXPosition(i5);
        ((a)this.b.e.a()).setYPosition(i3);
        localLayoutParams.setMargins(com.google.ads.e.a.a((Context)this.b.f.a(), i5), com.google.ads.e.a.a((Context)this.b.f.a(), i3), 0, 0);
        locala.setLayoutParams(localLayoutParams);
        return;
        i1 = paramInt3;
        break;
      }
      label279: i3 = paramInt2;
    }
  }

  public void a(long paramLong)
  {
    synchronized (a)
    {
      SharedPreferences.Editor localEditor = this.o.edit();
      localEditor.putLong("Timeout" + this.b.h, paramLong);
      localEditor.commit();
      if (this.r)
        this.i = paramLong;
      return;
    }
  }

  public void a(View paramView)
  {
    ((ViewGroup)this.b.i.a()).setVisibility(0);
    ((ViewGroup)this.b.i.a()).removeAllViews();
    ((ViewGroup)this.b.i.a()).addView(paramView);
    if (((ac)this.b.g.a()).b())
    {
      ((w)this.b.b.a()).a((bq)this.b.l.a(), false, -1, -1, -1, -1);
      if (((a)this.b.e.a()).a())
        ((ViewGroup)this.b.i.a()).addView((View)this.b.e.a(), com.google.ads.e.a.a((Context)this.b.f.a(), ((ac)this.b.g.a()).c().a()), com.google.ads.e.a.a((Context)this.b.f.a(), ((ac)this.b.g.a()).c().b()));
    }
  }

  public void a(View paramView, bk parambk, bh parambh, boolean paramBoolean)
  {
    try
    {
      com.google.ads.e.i.a("AdManager.onReceiveGWhirlAd() called.");
      this.k = true;
      this.z = parambh;
      if (this.b.a())
      {
        a(paramView);
        a(parambh, Boolean.valueOf(paramBoolean));
      }
      this.y.a(parambk);
      com.google.ads.c localc = (com.google.ads.c)this.b.o.a();
      if (localc != null)
        localc.a((com.google.ads.a)this.b.a.a());
      return;
    }
    finally
    {
    }
  }

  public void a(ba paramba)
  {
    try
    {
      this.c = null;
      this.y.a(paramba, this.d);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(bq parambq, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a locala = (a)this.b.e.a();
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      locala.setOverlayActivated(bool);
      a(paramInt1, paramInt2, paramInt3, paramInt4);
      if (this.b.q.a() != null)
      {
        if (!paramBoolean)
          break;
        ((j)this.b.q.a()).a((com.google.ads.a)this.b.a.a());
      }
      return;
    }
    ((j)this.b.q.a()).b((com.google.ads.a)this.b.a.a());
  }

  public void a(d paramd)
  {
    while (true)
    {
      try
      {
        com.google.ads.e.i.d("v6.4.1 RC00");
        if (this.h)
        {
          com.google.ads.e.i.e("loadAd called after ad was destroyed.");
          return;
        }
        if (p())
        {
          com.google.ads.e.i.e("loadAd called while the ad is already loading, so aborting.");
          continue;
        }
      }
      finally
      {
      }
      if (AdActivity.b())
      {
        com.google.ads.e.i.e("loadAd called while an interstitial or landing page is displayed, so aborting");
      }
      else if ((com.google.ads.e.a.c((Context)this.b.f.a())) && (com.google.ads.e.a.b((Context)this.b.f.a())))
      {
        long l1 = this.o.getLong("GoogleAdMobDoritosLife", 60000L);
        if (at.a((Context)this.b.f.a(), l1))
          at.a((Activity)this.b.c.a());
        this.k = false;
        this.s.clear();
        this.t.clear();
        this.d = paramd;
        if (this.x.a())
        {
          this.y.a(this.x.b(), paramd);
        }
        else
        {
          bq localbq = new bq(this.b);
          this.b.m.a(localbq);
          this.c = ((n)localbq.b.a());
          this.c.a(paramd);
        }
      }
    }
  }

  public void a(com.google.ads.e parame)
  {
    try
    {
      this.c = null;
      if (parame == com.google.ads.e.c)
      {
        a(60.0F);
        if (!r())
          g();
      }
      if (this.b.b())
      {
        if (parame != com.google.ads.e.b)
          break label126;
        this.e.B();
      }
      while (true)
      {
        com.google.ads.e.i.c("onFailedToReceiveAd(" + parame + ")");
        com.google.ads.c localc = (com.google.ads.c)this.b.o.a();
        if (localc != null)
          localc.a((com.google.ads.a)this.b.a.a(), parame);
        return;
        label126: if (parame == com.google.ads.e.c)
          this.e.z();
      }
    }
    finally
    {
    }
  }

  public void a(String paramString)
  {
    this.B = paramString;
    Uri localUri = new Uri.Builder().encodedQuery(paramString).build();
    StringBuilder localStringBuilder = new StringBuilder();
    HashMap localHashMap = com.google.ads.e.a.b(localUri);
    Iterator localIterator = localHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localStringBuilder.append(str).append(" = ").append((String)localHashMap.get(str)).append("\n");
    }
    this.A = localStringBuilder.toString().trim();
    if (TextUtils.isEmpty(this.A))
      this.A = null;
  }

  public void a(String paramString1, String paramString2)
  {
    try
    {
      com.google.ads.h localh = (com.google.ads.h)this.b.p.a();
      if (localh != null)
        localh.a((com.google.ads.a)this.b.a.a(), paramString1, paramString2);
      return;
    }
    finally
    {
    }
  }

  protected void a(LinkedList paramLinkedList)
  {
    try
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        com.google.ads.e.i.a("Adding a click tracking URL: " + str);
      }
    }
    finally
    {
    }
    this.u = paramLinkedList;
  }

  public void a(boolean paramBoolean)
  {
    try
    {
      this.j = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public String b()
  {
    return this.A;
  }

  public void b(long paramLong)
  {
    if (paramLong > 0L);
    try
    {
      this.o.edit().putLong("GoogleAdMobDoritosLife", paramLong).commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void b(ba paramba)
  {
    try
    {
      com.google.ads.e.i.a("AdManager.onGWhirlNoFill() called.");
      a(paramba.i(), paramba.c());
      com.google.ads.c localc = (com.google.ads.c)this.b.o.a();
      if (localc != null)
        localc.a((com.google.ads.a)this.b.a.a(), com.google.ads.e.b);
      return;
    }
    finally
    {
    }
  }

  protected void b(String paramString)
  {
    try
    {
      com.google.ads.e.i.a("Adding a tracking URL: " + paramString);
      this.s.add(paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void b(boolean paramBoolean)
  {
    this.w = Boolean.valueOf(paramBoolean);
  }

  public String c()
  {
    return this.B;
  }

  protected void c(String paramString)
  {
    try
    {
      com.google.ads.e.i.a("Adding a manual tracking URL: " + paramString);
      A().add(paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void d()
  {
    try
    {
      this.m = false;
      com.google.ads.e.i.a("Refreshing is no longer allowed on this AdView.");
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void e()
  {
    try
    {
      if (this.l)
      {
        com.google.ads.e.i.a("Disabling refreshing.");
        ((Handler)br.a().c.a()).removeCallbacks(this.q);
        this.l = false;
      }
      while (true)
      {
        return;
        com.google.ads.e.i.a("Refreshing is already disabled.");
      }
    }
    finally
    {
    }
  }

  public void f()
  {
    while (true)
    {
      try
      {
        this.n = false;
        if (!this.b.a())
          break label118;
        if (this.m)
        {
          if (!this.l)
          {
            com.google.ads.e.i.a("Enabling refreshing every " + this.p + " milliseconds.");
            ((Handler)br.a().c.a()).postDelayed(this.q, this.p);
            this.l = true;
            return;
          }
          com.google.ads.e.i.a("Refreshing is already enabled.");
          continue;
        }
      }
      finally
      {
      }
      com.google.ads.e.i.a("Refreshing disabled on this AdView");
      continue;
      label118: com.google.ads.e.i.a("Tried to enable refreshing on something other than an AdView.");
    }
  }

  public void g()
  {
    f();
    this.n = true;
  }

  public bt h()
  {
    return this.b;
  }

  public bc i()
  {
    try
    {
      bc localbc = this.x;
      return localbc;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public n j()
  {
    try
    {
      n localn = this.c;
      return localn;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public e k()
  {
    try
    {
      e locale = this.f;
      return locale;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public ad l()
  {
    try
    {
      ad localad = this.g;
      return localad;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public ab m()
  {
    return this.e;
  }

  public int n()
  {
    try
    {
      int i1 = this.v;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public long o()
  {
    return this.i;
  }

  public boolean p()
  {
    try
    {
      n localn = this.c;
      if (localn != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public boolean q()
  {
    try
    {
      boolean bool = this.j;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean r()
  {
    try
    {
      boolean bool = this.l;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void s()
  {
    try
    {
      this.e.C();
      com.google.ads.e.i.c("onDismissScreen()");
      com.google.ads.c localc = (com.google.ads.c)this.b.o.a();
      if (localc != null)
        localc.c((com.google.ads.a)this.b.a.a());
      return;
    }
    finally
    {
    }
  }

  public void t()
  {
    try
    {
      com.google.ads.e.i.c("onPresentScreen()");
      com.google.ads.c localc = (com.google.ads.c)this.b.o.a();
      if (localc != null)
        localc.b((com.google.ads.a)this.b.a.a());
      return;
    }
    finally
    {
    }
  }

  public void u()
  {
    try
    {
      com.google.ads.e.i.c("onLeaveApplication()");
      com.google.ads.c localc = (com.google.ads.c)this.b.o.a();
      if (localc != null)
        localc.d((com.google.ads.a)this.b.a.a());
      return;
    }
    finally
    {
    }
  }

  public void v()
  {
    this.e.f();
    y();
  }

  public void w()
  {
    try
    {
      Activity localActivity = (Activity)this.b.c.a();
      if (localActivity == null)
        com.google.ads.e.i.e("activity was null while trying to ping tracking URLs.");
      while (true)
      {
        return;
        Iterator localIterator = this.s.iterator();
        while (localIterator.hasNext())
          new Thread(new o((String)localIterator.next(), localActivity.getApplicationContext())).start();
      }
    }
    finally
    {
    }
  }

  public void x()
  {
    while (true)
    {
      try
      {
        boolean bool = this.h;
        if (bool)
          return;
        if (this.d == null)
          break label134;
        if (!this.b.a())
          break label125;
        if ((((AdView)this.b.j.a()).isShown()) && (com.google.ads.e.a.d()))
        {
          com.google.ads.e.i.c("Refreshing ad.");
          a(this.d);
          if (!this.n)
            break label98;
          e();
          continue;
        }
      }
      finally
      {
      }
      com.google.ads.e.i.a("Not refreshing because the ad is not visible.");
      continue;
      label98: ((Handler)br.a().c.a()).postDelayed(this.q, this.p);
      continue;
      label125: com.google.ads.e.i.a("Tried to refresh an ad that wasn't an AdView.");
      continue;
      label134: com.google.ads.e.i.a("Tried to refresh before calling loadAd().");
    }
  }

  protected void y()
  {
    try
    {
      Activity localActivity = (Activity)this.b.c.a();
      if (localActivity == null)
        com.google.ads.e.i.e("activity was null while trying to ping click tracking URLs.");
      while (true)
      {
        return;
        Iterator localIterator = this.u.iterator();
        while (localIterator.hasNext())
          new Thread(new o((String)localIterator.next(), localActivity.getApplicationContext())).start();
      }
    }
    finally
    {
    }
  }

  protected void z()
  {
    try
    {
      this.c = null;
      this.k = true;
      this.f.setVisibility(0);
      if (this.b.a())
        a(this.f);
      this.e.g();
      if (this.b.a())
        w();
      com.google.ads.e.i.c("onReceiveAd()");
      com.google.ads.c localc = (com.google.ads.c)this.b.o.a();
      if (localc != null)
        localc.a((com.google.ads.a)this.b.a.a());
      this.b.l.a(this.b.m.a());
      this.b.m.a(null);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.w
 * JD-Core Version:    0.6.2
 */