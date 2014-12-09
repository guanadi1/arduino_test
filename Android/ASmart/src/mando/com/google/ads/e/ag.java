package com.google.ads.e;

public final class ag extends ae
{
  private boolean e = false;

  public ag(ac paramac, String paramString)
  {
    super(paramac, paramString, null);
  }

  public ag(ac paramac, String paramString, Object paramObject)
  {
    super(paramac, paramString, paramObject, null);
  }

  public Object a()
  {
    try
    {
      Object localObject2 = this.a;
      return localObject2;
    }
    finally
    {
      localObject1 = finally;
      throw localObject1;
    }
  }

  public void a(Object paramObject)
  {
    try
    {
      i.d("State changed - " + this.d.toString() + "." + this.b + ": '" + paramObject + "' <-- '" + this.a + "'.");
      this.a = paramObject;
      this.e = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append(super.toString());
    if (this.e);
    for (String str = " (*)"; ; str = "")
      return str;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.ag
 * JD-Core Version:    0.6.2
 */