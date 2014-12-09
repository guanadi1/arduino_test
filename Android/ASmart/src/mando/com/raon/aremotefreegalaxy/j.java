package com.raon.aremotefreegalaxy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.raon.remotelib.d;
import com.raon.remotelib.f;

public class j extends am
{
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    String str = this.R.g().c.c.toLowerCase();
    View localView;
    if (str.equals("canon"))
      localView = paramLayoutInflater.inflate(2130903078, paramViewGroup, false);
    while (true)
    {
      if (localView != null)
        a(localView);
      return localView;
      if (str.equals("nikon"))
      {
        localView = paramLayoutInflater.inflate(2130903080, paramViewGroup, false);
      }
      else if (str.equals("sony"))
      {
        localView = paramLayoutInflater.inflate(2130903085, paramViewGroup, false);
      }
      else if (str.equals("fuji"))
      {
        localView = paramLayoutInflater.inflate(2130903079, paramViewGroup, false);
      }
      else if (str.equals("olympus"))
      {
        localView = paramLayoutInflater.inflate(2130903081, paramViewGroup, false);
      }
      else if (str.equals("pentax"))
      {
        localView = paramLayoutInflater.inflate(2130903082, paramViewGroup, false);
      }
      else
      {
        boolean bool = str.equals("samsung");
        localView = null;
        if (bool)
          localView = paramLayoutInflater.inflate(2130903084, paramViewGroup, false);
      }
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.j
 * JD-Core Version:    0.6.2
 */