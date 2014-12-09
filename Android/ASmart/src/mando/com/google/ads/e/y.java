package com.google.ads.e;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class y
  implements DialogInterface.OnClickListener
{
  y(JsPromptResult paramJsPromptResult)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.cancel();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.y
 * JD-Core Version:    0.6.2
 */