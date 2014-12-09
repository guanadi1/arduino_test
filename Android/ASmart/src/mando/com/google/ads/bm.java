package com.google.ads;

import android.app.Activity;
import com.google.ads.b.ac;
import com.google.ads.c.a;
import com.google.ads.c.b;
import com.google.ads.c.c;
import com.google.ads.c.e;
import com.google.ads.c.j;
import com.google.ads.e.i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class bm
  implements Runnable
{
  private final bk a;
  private final String b;
  private final d c;
  private final HashMap d;
  private final boolean e;
  private final WeakReference f;

  public bm(bk parambk, Activity paramActivity, String paramString, d paramd, HashMap paramHashMap)
  {
    this.a = parambk;
    this.b = paramString;
    this.f = new WeakReference(paramActivity);
    this.c = paramd;
    this.d = new HashMap(paramHashMap);
    this.e = a(this.d);
  }

  private void a(b paramb)
  {
    Activity localActivity = (Activity)this.f.get();
    if (localActivity == null)
      throw new bn("Activity became null while trying to instantiate adapter.");
    this.a.a(paramb);
    Class localClass1 = paramb.c();
    com.google.ads.c.g localg2;
    if (localClass1 != null)
    {
      localg2 = (com.google.ads.c.g)localClass1.newInstance();
      localg2.a(this.d);
    }
    for (com.google.ads.c.g localg1 = localg2; ; localg1 = null)
    {
      Class localClass2 = paramb.b();
      if (localClass2 != null);
      for (j localj = (j)this.c.a(localClass2); ; localj = null)
      {
        a locala = new a(this.c, localActivity, this.e);
        if (this.a.a.a())
        {
          if (!(paramb instanceof e))
            throw new bn("Adapter " + this.b + " doesn't support the MediationInterstitialAdapter" + " interface.");
          ((e)paramb).a(new bp(this.a), localActivity, localg1, locala, localj);
        }
        while (true)
        {
          this.a.g();
          return;
          if (!(paramb instanceof c))
            throw new bn("Adapter " + this.b + " doesn't support the MediationBannerAdapter interface");
          c localc = (c)paramb;
          bo localbo = new bo(this.a);
          g localg = this.a.a.c();
          localc.a(localbo, localActivity, localg1, localg, locala, localj);
        }
      }
    }
  }

  private void a(String paramString, Throwable paramThrowable, bj parambj)
  {
    i.b(paramString, paramThrowable);
    this.a.a(false, parambj);
  }

  private static boolean a(Map paramMap)
  {
    String str = (String)paramMap.remove("gwhirl_share_location");
    if ("1".equals(str))
      return true;
    if ((str != null) && (!"0".equals(str)))
      i.b("Received an illegal value, '" + str + "', for the special share location parameter from mediation server" + " (expected '0' or '1'). Will not share the location.");
    return false;
  }

  public void run()
  {
    try
    {
      i.a("Trying to instantiate: " + this.b);
      a((b)bi.a(this.b, b.class));
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      a("Cannot find adapter class '" + this.b + "'. Did you link the ad network's mediation adapter? Skipping ad network.", localClassNotFoundException, bj.e);
      return;
    }
    catch (Throwable localThrowable)
    {
      a("Error while creating adapter and loading ad from ad network. Skipping ad network.", localThrowable, bj.f);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bm
 * JD-Core Version:    0.6.2
 */