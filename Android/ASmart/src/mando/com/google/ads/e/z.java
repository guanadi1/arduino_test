package com.google.ads.e;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class z
  implements DialogInterface.OnClickListener
{
  z(JsPromptResult paramJsPromptResult, EditText paramEditText)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.confirm(this.b.getText().toString());
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.z
 * JD-Core Version:    0.6.2
 */