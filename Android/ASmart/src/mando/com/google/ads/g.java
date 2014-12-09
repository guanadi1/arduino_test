package com.google.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class g
{
  public static final g a = new g(-1, -2, "mb");
  public static final g b = new g(320, 50, "mb");
  public static final g c = new g(300, 250, "as");
  public static final g d = new g(468, 60, "as");
  public static final g e = new g(728, 90, "as");
  public static final g f = new g(160, 600, "as");
  private final int g;
  private final int h;
  private boolean i;
  private boolean j;
  private boolean k;
  private String l;

  public g(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, null);
    if (f())
    {
      this.k = false;
      this.l = "mb";
      return;
    }
    this.k = true;
  }

  private g(int paramInt1, int paramInt2, String paramString)
  {
    this.g = paramInt1;
    this.h = paramInt2;
    this.l = paramString;
    boolean bool2;
    if (paramInt1 == -1)
    {
      bool2 = bool1;
      this.i = bool2;
      if (paramInt2 != -2)
        break label61;
    }
    while (true)
    {
      this.j = bool1;
      this.k = false;
      return;
      bool2 = false;
      break;
      label61: bool1 = false;
    }
  }

  private static int a(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    return (int)(localDisplayMetrics.widthPixels / localDisplayMetrics.density);
  }

  public static g a(g paramg, Context paramContext)
  {
    if ((paramContext == null) || (!paramg.f()))
    {
      if (paramg.f())
        paramg = b;
      return paramg;
    }
    int m;
    if (paramg.i)
    {
      m = a(paramContext);
      if (!paramg.j)
        break label101;
    }
    label101: for (int n = b(paramContext); ; n = paramg.b())
    {
      g localg = new g(m, n, paramg.l);
      localg.j = paramg.j;
      localg.i = paramg.i;
      localg.k = paramg.k;
      return localg;
      m = paramg.a();
      break;
    }
  }

  private static int b(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    int m = (int)(localDisplayMetrics.heightPixels / localDisplayMetrics.density);
    if (m <= 400)
      return 32;
    if (m <= 720)
      return 50;
    return 90;
  }

  private boolean f()
  {
    return (this.g < 0) || (this.h < 0);
  }

  public int a()
  {
    if (this.g < 0)
      throw new UnsupportedOperationException("Ad size was not set before getWidth() was called.");
    return this.g;
  }

  public int b()
  {
    if (this.h < 0)
      throw new UnsupportedOperationException("Ad size was not set before getHeight() was called.");
    return this.h;
  }

  public boolean c()
  {
    return this.i;
  }

  public boolean d()
  {
    return this.j;
  }

  public boolean e()
  {
    return this.k;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof g));
    g localg;
    do
    {
      return false;
      localg = (g)paramObject;
    }
    while ((this.g != localg.g) || (this.h != localg.h));
    return true;
  }

  public int hashCode()
  {
    return Integer.valueOf(this.g).hashCode() << 16 | 0xFFFF & Integer.valueOf(this.h).hashCode();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append(a()).append("x").append(b());
    if (this.l == null);
    for (String str = ""; ; str = "_" + this.l)
      return str;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.g
 * JD-Core Version:    0.6.2
 */