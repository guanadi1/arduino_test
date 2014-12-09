package com.raon.aremotefreegalaxy;

import android.app.Dialog;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class d extends Dialog
{
  Context a;
  f b;

  public d(Context paramContext, int paramInt, boolean paramBoolean, String paramString)
  {
    super(paramContext, 2131493001);
    setContentView(2130903068);
    this.a = paramContext;
    ((TextView)findViewById(2131230899)).setText(paramInt);
    EditText localEditText = (EditText)findViewById(2131230900);
    if (!paramBoolean)
      localEditText.setVisibility(8);
    while (true)
    {
      ((Button)findViewById(2131230901)).setOnClickListener(new e(this, paramBoolean, localEditText));
      return;
      localEditText.setVisibility(0);
      localEditText.setText(paramString);
    }
  }

  public void a(f paramf)
  {
    this.b = paramf;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.d
 * JD-Core Version:    0.6.2
 */