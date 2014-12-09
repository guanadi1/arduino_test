package com.raon.aremotefreegalaxy;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class AddDeviceActivity extends Activity
  implements View.OnClickListener
{
  private void a(View paramView)
  {
    for (int i = 0; ; i++)
    {
      try
      {
        if (i < ((ViewGroup)paramView).getChildCount())
        {
          View localView = ((ViewGroup)paramView).getChildAt(i);
          if ((localView instanceof ImageButton))
          {
            if (localView.getTag() != null)
              ((ImageButton)localView).setOnClickListener(this);
          }
          else
            a(localView);
        }
      }
      catch (Exception localException)
      {
      }
      return;
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == 1)
    {
      setResult(paramInt2);
      finish();
    }
  }

  public void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if (localObject != null)
    {
      int i = Integer.parseInt(localObject.toString());
      Intent localIntent = new Intent(this, SelectBrandActivity.class);
      localIntent.putExtra("categoryid", i);
      startActivityForResult(localIntent, 0);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903063);
    if (getResources().getBoolean(2131099654))
      setRequestedOrientation(1);
    a(findViewById(2131230801));
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.AddDeviceActivity
 * JD-Core Version:    0.6.2
 */