package com.google.ads.e;

import java.lang.ref.WeakReference;

public final class ah extends ae
{
  public ah(ac paramac, String paramString, Object paramObject)
  {
    super(paramac, paramString, new WeakReference(paramObject), null);
  }

  public Object a()
  {
    return ((WeakReference)this.a).get();
  }

  public String toString()
  {
    return this.d.toString() + "." + this.b + " = " + a() + " (?)";
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.ah
 * JD-Core Version:    0.6.2
 */