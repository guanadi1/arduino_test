package com.google.ads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.google.ads.a.b;
import com.google.ads.c.j;
import com.google.ads.e.i;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class d
{
  public static final String a;
  private static final SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd");
  private static Method c = null;
  private static Method d = null;
  private f e = null;
  private Date f = null;
  private Set g = null;
  private Map h = null;
  private final Map i = new HashMap();
  private Location j = null;
  private boolean k = false;
  private boolean l = false;
  private Set m = null;

  static
  {
    while (true)
    {
      int i1;
      try
      {
        Method[] arrayOfMethod = Class.forName("com.google.analytics.tracking.android.AdMobInfo").getMethods();
        int n = arrayOfMethod.length;
        i1 = 0;
        if (i1 < n)
        {
          Method localMethod = arrayOfMethod[i1];
          if ((localMethod.getName().equals("getInstance")) && (localMethod.getParameterTypes().length == 0))
            c = localMethod;
          else if ((localMethod.getName().equals("getJoinIds")) && (localMethod.getParameterTypes().length == 0))
            d = localMethod;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        i.a("No Google Analytics: Library Not Found.");
        a = com.google.ads.e.a.b("emulator");
        return;
        if ((c != null) && (d != null))
          continue;
        c = null;
        d = null;
        i.e("No Google Analytics: Library Incompatible.");
        continue;
      }
      catch (Throwable localThrowable)
      {
        i.a("No Google Analytics: Error Loading Library");
        continue;
      }
      i1++;
    }
  }

  public d a(j paramj)
  {
    if (paramj != null)
      this.i.put(paramj.getClass(), paramj);
    return this;
  }

  public d a(Set paramSet)
  {
    this.g = paramSet;
    return this;
  }

  public Object a(Class paramClass)
  {
    return this.i.get(paramClass);
  }

  public Map a(Context paramContext)
  {
    HashMap localHashMap = new HashMap();
    if (this.g != null)
      localHashMap.put("kw", this.g);
    if (this.e != null)
      localHashMap.put("cust_gender", Integer.valueOf(this.e.ordinal()));
    if (this.f != null)
      localHashMap.put("cust_age", b.format(this.f));
    if (this.j != null)
      localHashMap.put("uule", com.google.ads.e.a.a(this.j));
    if (this.k)
      localHashMap.put("testing", Integer.valueOf(1));
    if (b(paramContext))
      localHashMap.put("adtest", "on");
    while (true)
    {
      com.google.ads.c.a.a locala = (com.google.ads.c.a.a)a(com.google.ads.c.a.a.class);
      b localb = (b)a(b.class);
      if ((localb != null) && (localb.d() != null) && (!localb.d().isEmpty()))
      {
        localHashMap.put("extras", localb.d());
        label204: if (localb != null)
        {
          String str2 = localb.a();
          if (!TextUtils.isEmpty(str2))
            localHashMap.put("ppid", str2);
        }
        if (this.h != null)
          localHashMap.put("mediation_extras", this.h);
      }
      try
      {
        if (c != null)
        {
          Object localObject = c.invoke(null, new Object[0]);
          Map localMap = (Map)d.invoke(localObject, new Object[0]);
          if ((localMap != null) && (localMap.size() > 0))
            localHashMap.put("analytics_join_id", localMap);
        }
        return localHashMap;
        if (!this.l)
        {
          if (com.google.ads.e.a.c());
          for (String str1 = "AdRequest.TEST_EMULATOR"; ; str1 = "\"" + com.google.ads.e.a.a(paramContext) + "\"")
          {
            i.c("To get test ads on this device, call adRequest.addTestDevice(" + str1 + ");");
            this.l = true;
            break;
          }
          if ((locala == null) || (locala.d() == null) || (locala.d().isEmpty()))
            break label204;
          localHashMap.put("extras", locala.d());
        }
      }
      catch (Throwable localThrowable)
      {
        i.c("Internal Analytics Error:", localThrowable);
      }
    }
    return localHashMap;
  }

  public d b(Set paramSet)
  {
    this.m = paramSet;
    return this;
  }

  public boolean b(Context paramContext)
  {
    String str;
    if (this.m != null)
    {
      str = com.google.ads.e.a.a(paramContext);
      if (str != null)
        break label18;
    }
    label18: 
    while (!this.m.contains(str))
      return false;
    return true;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.d
 * JD-Core Version:    0.6.2
 */