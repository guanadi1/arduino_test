package com.raon.aremotefreegalaxy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

class z extends BroadcastReceiver
{
  z(MainActivity paramMainActivity)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = paramIntent.getExtras().getBoolean("isshow");
    View localView = this.a.findViewById(2131230823);
    if (bool)
    {
      localView.setVisibility(0);
      return;
    }
    localView.setVisibility(4);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.z
 * JD-Core Version:    0.6.2
 */