package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.ads.b.h;
import com.google.ads.e.q;
import java.util.Date;

public final class at
{
  private static final h a = (h)h.a.b();

  public static void a(Activity paramActivity)
  {
    new Thread(new av(paramActivity)).start();
  }

  public static boolean a(Context paramContext, long paramLong)
  {
    if (!a(paramContext, paramLong, PreferenceManager.getDefaultSharedPreferences(paramContext.getApplicationContext())))
      return false;
    new Thread(new au(paramContext)).start();
    return true;
  }

  static boolean a(Context paramContext, long paramLong, SharedPreferences paramSharedPreferences)
  {
    return (!paramSharedPreferences.contains("drt")) || (!paramSharedPreferences.contains("drt_ts")) || (paramSharedPreferences.getLong("drt_ts", 0L) < new Date().getTime() - paramLong);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.at
 * JD-Core Version:    0.6.2
 */