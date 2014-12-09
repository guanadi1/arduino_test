package com.raon.aremotefreegalaxy;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

class x
  implements CompoundButton.OnCheckedChangeListener
{
  x(MainActivity paramMainActivity)
  {
  }

  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    this.a.n.e = paramBoolean;
    this.a.n.l();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.x
 * JD-Core Version:    0.6.2
 */