package com.google.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

final class au
  implements Runnable
{
  au(Context paramContext)
  {
  }

  public void run()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(this.a.getApplicationContext()).edit();
    localEditor.putString("drt", "");
    localEditor.putLong("drt_ts", 0L);
    localEditor.commit();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.au
 * JD-Core Version:    0.6.2
 */