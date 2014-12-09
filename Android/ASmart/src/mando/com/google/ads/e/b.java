package com.google.ads.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class b extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.USER_PRESENT"))
      a.a(true);
    while (!paramIntent.getAction().equals("android.intent.action.SCREEN_OFF"))
      return;
    a.a(false);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.b
 * JD-Core Version:    0.6.2
 */