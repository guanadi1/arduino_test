package com.google.ads.e;

public abstract class ae
{
  protected Object a;
  protected final String b;

  private ae(ac paramac, String paramString)
  {
    this(paramac, paramString, null);
  }

  private ae(ac paramac, String paramString, Object paramObject)
  {
    this.b = paramString;
    ac.a(paramac, this);
    this.a = paramObject;
  }

  public String toString()
  {
    return this.c.toString() + "." + this.b + " = " + this.a;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.ae
 * JD-Core Version:    0.6.2
 */