package com.raon.aremotefreegalaxy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.h;
import android.view.View;

public class am extends Fragment
{
  Globals R;

  public void a(View paramView)
  {
    this.R.c.a(paramView);
  }

  public void b(View paramView)
  {
    this.R.c.b(paramView);
  }

  public void c(Bundle paramBundle)
  {
    if (this.R == null)
      this.R = ((Globals)b().getApplication());
    super.c(paramBundle);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.am
 * JD-Core Version:    0.6.2
 */