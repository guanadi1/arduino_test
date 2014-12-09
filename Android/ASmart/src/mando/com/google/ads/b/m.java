package com.google.ads.b;

import com.google.ads.e.i;

public final class m extends Exception
{
  public final boolean a;

  public m(String paramString, boolean paramBoolean)
  {
    super(paramString);
    this.a = paramBoolean;
  }

  public m(String paramString, boolean paramBoolean, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    this.a = paramBoolean;
  }

  public void a(String paramString)
  {
    i.b(c(paramString));
    i.a(null, this);
  }

  public void b(String paramString)
  {
    String str = c(paramString);
    if (this.a);
    while (true)
    {
      throw new RuntimeException(str, this);
      this = null;
    }
  }

  public String c(String paramString)
  {
    if (this.a)
      paramString = paramString + ": " + getMessage();
    return paramString;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.m
 * JD-Core Version:    0.6.2
 */