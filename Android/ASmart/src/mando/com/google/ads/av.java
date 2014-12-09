package com.google.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.e.i;
import java.lang.ref.WeakReference;
import java.util.Date;

class av
  implements Runnable
{
  private final WeakReference a;
  private final SharedPreferences.Editor b;

  public av(Activity paramActivity)
  {
    this(paramActivity, null);
  }

  av(Activity paramActivity, SharedPreferences.Editor paramEditor)
  {
    this.a = new WeakReference(paramActivity);
    this.b = paramEditor;
  }

  private SharedPreferences.Editor a(Context paramContext)
  {
    if (this.b == null)
      return PreferenceManager.getDefaultSharedPreferences(paramContext.getApplicationContext()).edit();
    return this.b;
  }

  public void run()
  {
    while (true)
    {
      SharedPreferences.Editor localEditor;
      try
      {
        Activity localActivity = (Activity)this.a.get();
        if (localActivity == null)
        {
          i.a("Activity was null while making a doritos cookie request.");
          return;
        }
        Cursor localCursor = localActivity.getContentResolver().query(as.a, as.b, null, null, null);
        if ((localCursor != null) && (localCursor.moveToFirst()) && (localCursor.getColumnNames().length > 0))
        {
          str = localCursor.getString(localCursor.getColumnIndex(localCursor.getColumnName(0)));
          localEditor = a(localActivity);
          if (TextUtils.isEmpty(str))
            break label157;
          localEditor.putString("drt", str);
          localEditor.putLong("drt_ts", new Date().getTime());
          localEditor.commit();
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        i.d("An unknown error occurred while sending a doritos request.", localThrowable);
        return;
      }
      i.a("Google+ app not installed, not storing doritos cookie");
      String str = null;
      continue;
      label157: localEditor.putString("drt", "");
      localEditor.putLong("drt_ts", 0L);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.av
 * JD-Core Version:    0.6.2
 */