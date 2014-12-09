package com.google.ads.e;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

final class x
  implements DialogInterface.OnCancelListener
{
  x(JsPromptResult paramJsPromptResult)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.cancel();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.x
 * JD-Core Version:    0.6.2
 */