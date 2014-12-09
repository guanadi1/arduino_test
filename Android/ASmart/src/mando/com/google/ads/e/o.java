package com.google.ads.e;

import android.os.Build;

class o
{
  static final o d = new o();
  static final o e = new o("unknown", "generic", "generic");
  static final o f = new o("unknown", "generic_x86", "Android");
  public final String a;
  public final String b;
  public final String c;

  o()
  {
    this.a = Build.BOARD;
    this.b = Build.DEVICE;
    this.c = Build.BRAND;
  }

  o(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
  }

  private static boolean a(String paramString1, String paramString2)
  {
    if (paramString1 != null)
      return paramString1.equals(paramString2);
    return paramString1 == paramString2;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof o));
    o localo;
    do
    {
      return false;
      localo = (o)paramObject;
    }
    while ((!a(this.a, localo.a)) || (!a(this.b, localo.b)) || (!a(this.c, localo.c)));
    return true;
  }

  public int hashCode()
  {
    String str = this.a;
    int i = 0;
    if (str != null)
      i = 0 + this.a.hashCode();
    if (this.b != null)
      i += this.b.hashCode();
    if (this.c != null)
      i += this.c.hashCode();
    return i;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.o
 * JD-Core Version:    0.6.2
 */