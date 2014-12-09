package com.raon.aremotefreegalaxy;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import com.raon.remotelib.g;

public class ap
  implements View.OnTouchListener
{
  Globals a;
  g b;

  public void a(View paramView)
  {
    for (int i = 0; ; i++)
    {
      try
      {
        if (i < ((ViewGroup)paramView).getChildCount())
        {
          View localView = ((ViewGroup)paramView).getChildAt(i);
          if (((localView instanceof ImageButton)) || ((localView instanceof Button)))
          {
            if (Integer.parseInt(localView.getTag().toString()) < 99999)
              localView.setOnTouchListener(this);
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

  public void b(View paramView)
  {
    int i = 0;
    try
    {
      while (i < ((ViewGroup)paramView).getChildCount())
      {
        View localView = ((ViewGroup)paramView).getChildAt(i);
        if (((localView instanceof ImageButton)) || ((localView instanceof Button)))
        {
          if (localView.getTag() != null)
          {
            int j = Integer.parseInt(localView.getTag().toString());
            if ((!this.b.a(j)) && ((j < 37) || (j > 40)) && (j < 99999))
            {
              localView.setEnabled(false);
              localView.setAlpha(0.4F);
            }
            else
            {
              localView.setEnabled(true);
              localView.setAlpha(1.0F);
            }
          }
        }
        else
          b(localView);
        i++;
      }
    }
    catch (Exception localException)
    {
    }
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    Object localObject = paramView.getTag();
    if (localObject != null)
    {
      if (paramMotionEvent.getAction() != 0)
        break label58;
      paramView.setPressed(true);
      this.a.a(true);
      i = Integer.parseInt(localObject.toString());
      if (i > 0)
        this.a.a(this.b, i);
    }
    label58: 
    while (paramMotionEvent.getAction() != 1)
    {
      int i;
      return true;
    }
    this.a.m();
    paramView.setPressed(false);
    this.a.a(false);
    return true;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.ap
 * JD-Core Version:    0.6.2
 */