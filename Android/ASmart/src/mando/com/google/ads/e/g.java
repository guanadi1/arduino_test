package com.google.ads.e;

import android.text.TextUtils;
import android.util.Log;

public class g
{
  private static boolean a = Log.isLoggable("GoogleAdsAssertion", 3);

  public static void a(Object paramObject)
  {
    if (paramObject != null);
    for (boolean bool = true; ; bool = false)
    {
      c(bool, "Assertion that an object is not null failed.");
      return;
    }
  }

  public static void a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2);
    for (boolean bool = true; ; bool = false)
    {
      c(bool, "Assertion that 'a' and 'b' refer to the same object failed.a: " + paramObject1 + ", b: " + paramObject2);
      return;
    }
  }

  public static void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString));
    for (boolean bool = true; ; bool = false)
    {
      c(bool, "Expected a non empty string, got: " + paramString);
      return;
    }
  }

  public static void a(boolean paramBoolean)
  {
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      c(bool, "Assertion failed.");
      return;
    }
  }

  public static void a(boolean paramBoolean, String paramString)
  {
    c(paramBoolean, paramString);
  }

  public static void b(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      c(bool, paramString);
      return;
    }
  }

  private static void c(boolean paramBoolean, String paramString)
  {
    if ((!Log.isLoggable("GoogleAdsAssertion", 3)) && (!a));
    while (paramBoolean)
      return;
    h localh = new h(paramString);
    Log.d("GoogleAdsAssertion", paramString, localh);
    throw localh;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.g
 * JD-Core Version:    0.6.2
 */