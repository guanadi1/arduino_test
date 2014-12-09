package com.raon.aremotefreegalaxy;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

class e
  implements View.OnClickListener
{
  e(d paramd, boolean paramBoolean, EditText paramEditText)
  {
  }

  public void onClick(View paramView)
  {
    if ((this.a) && (this.b.getText().toString().trim().length() < 1))
      Toast.makeText(this.c.a, 2131427369, 2).show();
    this.c.b.a(this.b.getText().toString());
    this.c.dismiss();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.e
 * JD-Core Version:    0.6.2
 */