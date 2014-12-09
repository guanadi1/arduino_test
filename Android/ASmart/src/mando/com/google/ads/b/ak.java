package com.google.ads.b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class ak
  implements DialogInterface.OnClickListener
{
  ak(ah paramah, String paramString)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ah.b(this.b).startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.a), "Share via"));
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.ak
 * JD-Core Version:    0.6.2
 */