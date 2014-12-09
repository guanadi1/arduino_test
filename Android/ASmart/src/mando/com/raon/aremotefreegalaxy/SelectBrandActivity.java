package com.raon.aremotefreegalaxy;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class SelectBrandActivity extends Activity
{
  Globals a;
  ListView b;
  ArrayList c;

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == 1)
    {
      setResult(paramInt2);
      finish();
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903065);
    if (getResources().getBoolean(2131099654))
      setRequestedOrientation(1);
    this.a = ((Globals)getApplication());
    int i = getIntent().getExtras().getInt("categoryid");
    this.c = this.a.c(i);
    an localan = new an(this, 2130903071, this.c);
    this.b = ((ListView)findViewById(2131230851));
    this.b.setAdapter(localan);
    this.b.setOnItemClickListener(new af(this, i));
    EditText localEditText = (EditText)findViewById(2131230850);
    localEditText.addTextChangedListener(new ag(this));
    localEditText.clearFocus();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.SelectBrandActivity
 * JD-Core Version:    0.6.2
 */