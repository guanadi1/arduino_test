package com.google.ads.b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aj
  implements DialogInterface.OnClickListener
{
  aj(ah paramah)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    new Thread(new ae(ah.a(this.a).c(), ah.b(this.a).getApplicationContext())).start();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.aj
 * JD-Core Version:    0.6.2
 */