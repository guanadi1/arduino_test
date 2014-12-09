package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.google.ads.b.ab;
import com.google.ads.b.ac;
import com.google.ads.b.w;
import com.google.ads.e.af;
import com.google.ads.e.ah;
import com.google.ads.e.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class bd
{
  private final w a;
  private bk b = null;
  private final Object c = new Object();
  private Thread d = null;
  private final Object e = new Object();
  private boolean f = false;
  private final Object g = new Object();

  protected bd()
  {
    this.a = null;
  }

  public bd(w paramw)
  {
    com.google.ads.e.g.a(paramw);
    this.a = paramw;
  }

  public static boolean a(ba paramba, w paramw)
  {
    if (paramba.j() == null)
      return true;
    if (paramw.h().b())
    {
      if (!paramba.j().a())
      {
        i.e("InterstitialAd received a mediation response corresponding to a non-interstitial ad. Make sure you specify 'interstitial' as the ad-type in the mediation UI.");
        return false;
      }
      return true;
    }
    g localg1 = ((ac)paramw.h().g.a()).c();
    if (paramba.j().a())
    {
      i.e("AdView received a mediation response corresponding to an interstitial ad. Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView  (" + localg1 + ") in the ad-type field in the mediation UI.");
      return false;
    }
    g localg2 = paramba.j().c();
    if (localg2 != localg1)
    {
      i.e("Mediation server returned ad size: '" + localg2 + "', while the AdView was created with ad size: '" + localg1 + "'. Using the ad-size passed to the AdView on creation.");
      return false;
    }
    return true;
  }

  private boolean a(String paramString, Activity paramActivity, d paramd, bh parambh, HashMap paramHashMap, long paramLong)
  {
    synchronized (new bk(this, (ac)this.a.h().g.a(), parambh, paramString, paramd, paramHashMap))
    {
      ???.a(paramActivity);
      try
      {
        while ((!???.b()) && (paramLong > 0L))
        {
          long l1 = SystemClock.elapsedRealtime();
          ???.wait(paramLong);
          long l2 = SystemClock.elapsedRealtime();
          paramLong -= l2 - l1;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        i.a("Interrupted while waiting for ad network to load ad using adapter class: " + paramString);
        this.a.m().a(???.d());
        if ((???.b()) && (???.c()))
        {
          if (this.a.h().b());
          for (View localView = null; ; localView = ???.e())
          {
            ((Handler)br.a().c.a()).post(new bg(this, ???, localView, parambh));
            return true;
          }
        }
        if (!???.b())
          i.a("Timeout occurred in adapter class: " + ???.f());
        ???.a();
        return false;
      }
    }
  }

  private void b(ba paramba, d paramd)
  {
    label242: 
    do
    {
      long l;
      HashMap localHashMap;
      bh localbh;
      String str4;
      Activity localActivity;
      do
      {
        while (true)
        {
          synchronized (this.e)
          {
            com.google.ads.e.g.a(Thread.currentThread(), this.d);
            List localList1 = paramba.f();
            if (paramba.a())
            {
              l = paramba.b();
              Iterator localIterator1 = localList1.iterator();
              if (!localIterator1.hasNext())
                break label293;
              k localk = (k)localIterator1.next();
              i.a("Looking to fetch ads from network: " + localk.b());
              List localList2 = localk.c();
              localHashMap = localk.e();
              localList3 = localk.d();
              String str1 = localk.a();
              String str2 = localk.b();
              String str3 = paramba.c();
              if (localList3 == null)
                break label242;
              localbh = new bh(str1, str2, str3, localList3, paramba.h(), paramba.i());
              Iterator localIterator2 = localList2.iterator();
              if (!localIterator2.hasNext())
                continue;
              str4 = (String)localIterator2.next();
              localActivity = (Activity)this.a.h().c.a();
              if (localActivity != null)
                break;
              i.a("Activity is null while mediating.  Terminating mediation thread.");
              return;
            }
          }
          l = 10000L;
          continue;
          List localList3 = paramba.g();
        }
        this.a.m().c();
      }
      while (a(str4, localActivity, paramd, localbh, localHashMap, l));
    }
    while (!b());
    i.a("GWController.destroy() called. Terminating mediation thread.");
    return;
    label293: ((Handler)br.a().c.a()).post(new bf(this, paramba));
  }

  private boolean b()
  {
    synchronized (this.g)
    {
      boolean bool = this.f;
      return bool;
    }
  }

  private boolean b(bk parambk)
  {
    synchronized (this.g)
    {
      if (b())
      {
        parambk.a();
        return true;
      }
      return false;
    }
  }

  public void a(ba paramba, d paramd)
  {
    while (true)
    {
      synchronized (this.e)
      {
        if (a())
        {
          i.c("Mediation thread is not done executing previous mediation  request. Ignoring new mediation request");
          return;
        }
        if (paramba.d())
        {
          this.a.a(paramba.e());
          if (!this.a.r())
            this.a.f();
          a(paramba, this.a);
          this.d = new Thread(new be(this, paramba, paramd));
          this.d.start();
          return;
        }
      }
      if (this.a.r())
        this.a.e();
    }
  }

  public void a(bk parambk)
  {
    synchronized (this.c)
    {
      if (this.b != parambk)
      {
        if (this.b != null)
          this.b.a();
        this.b = parambk;
      }
      return;
    }
  }

  public boolean a()
  {
    while (true)
    {
      synchronized (this.e)
      {
        if (this.d != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bd
 * JD-Core Version:    0.6.2
 */