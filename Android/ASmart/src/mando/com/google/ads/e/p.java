package com.google.ads.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.util.DisplayMetrics;

@TargetApi(4)
public final class p
{
  private static int a(Context paramContext, float paramFloat, int paramInt)
  {
    if ((0x2000 & paramContext.getApplicationInfo().flags) != 0)
      paramInt = (int)(paramInt / paramFloat);
    return paramInt;
  }

  public static int a(Context paramContext, DisplayMetrics paramDisplayMetrics)
  {
    return a(paramContext, paramDisplayMetrics.density, paramDisplayMetrics.heightPixels);
  }

  public static void a(Intent paramIntent, String paramString)
  {
    paramIntent.setPackage(paramString);
  }

  public static int b(Context paramContext, DisplayMetrics paramDisplayMetrics)
  {
    return a(paramContext, paramDisplayMetrics.density, paramDisplayMetrics.widthPixels);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.p
 * JD-Core Version:    0.6.2
 */