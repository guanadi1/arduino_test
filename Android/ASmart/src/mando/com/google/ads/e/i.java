package com.google.ads.e;

import android.util.Log;

public final class i
{
  public static k a = null;
  private static int b = 5;

  private static void a(j paramj, String paramString)
  {
    a(paramj, paramString, null);
  }

  private static void a(j paramj, String paramString, Throwable paramThrowable)
  {
    if (a != null)
      a.a(paramj, paramString, paramThrowable);
  }

  public static void a(String paramString)
  {
    if (a("Ads", 3))
      Log.d("Ads", paramString);
    a(j.b, paramString);
  }

  public static void a(String paramString, Throwable paramThrowable)
  {
    if (a("Ads", 3))
      Log.d("Ads", paramString, paramThrowable);
    a(j.b, paramString, paramThrowable);
  }

  private static boolean a(int paramInt)
  {
    return paramInt >= b;
  }

  public static boolean a(String paramString, int paramInt)
  {
    return (a(paramInt)) || (Log.isLoggable(paramString, paramInt));
  }

  public static void b(String paramString)
  {
    if (a("Ads", 6))
      Log.e("Ads", paramString);
    a(j.e, paramString);
  }

  public static void b(String paramString, Throwable paramThrowable)
  {
    if (a("Ads", 6))
    {
      Log.e("Ads", paramString);
      Log.i("Ads", "The following was caught and handled:", paramThrowable);
    }
    a(j.e, paramString, paramThrowable);
  }

  public static void c(String paramString)
  {
    if (a("Ads", 4))
      Log.i("Ads", paramString);
    a(j.c, paramString);
  }

  public static void c(String paramString, Throwable paramThrowable)
  {
    if (a("Ads", 4))
      Log.i("Ads", paramString, paramThrowable);
    a(j.c, paramString, paramThrowable);
  }

  public static void d(String paramString)
  {
    if (a("Ads", 2))
      Log.v("Ads", paramString);
    a(j.a, paramString);
  }

  public static void d(String paramString, Throwable paramThrowable)
  {
    if (a("Ads", 5))
    {
      Log.w("Ads", paramString);
      Log.i("Ads", "The following was caught and handled:", paramThrowable);
    }
    a(j.d, paramString, paramThrowable);
  }

  public static void e(String paramString)
  {
    if (a("Ads", 5))
      Log.w("Ads", paramString);
    a(j.d, paramString);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.i
 * JD-Core Version:    0.6.2
 */