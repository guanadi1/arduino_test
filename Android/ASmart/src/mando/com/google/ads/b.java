package com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.ads.b.w;
import com.google.ads.b.x;
import com.google.ads.e.ah;
import com.google.ads.e.i;

public class b
{
  public void a(w paramw, x paramx)
  {
    Activity localActivity;
    synchronized (AdActivity.d())
    {
      if (AdActivity.g() == null)
        AdActivity.b(paramw);
      while (AdActivity.g() == paramw)
      {
        localActivity = (Activity)paramw.h().c.a();
        if (localActivity != null)
          break;
        i.e("activity was null while launching an AdActivity.");
        return;
      }
      i.b("Tried to launch a new AdActivity with a different AdManager.");
      return;
    }
    Intent localIntent = new Intent(localActivity.getApplicationContext(), AdActivity.class);
    localIntent.putExtra("com.google.ads.AdOpener", paramx.a());
    try
    {
      i.a("Launching AdActivity.");
      localActivity.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      i.b("Activity not found.", localActivityNotFoundException);
    }
  }

  public boolean a()
  {
    while (true)
    {
      synchronized (AdActivity.d())
      {
        if (AdActivity.e() != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }

  public boolean b()
  {
    while (true)
    {
      synchronized (AdActivity.d())
      {
        if (AdActivity.f() != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b
 * JD-Core Version:    0.6.2
 */