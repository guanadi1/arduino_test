package com.raon.aremotefreegalaxy;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Toast;
import com.raon.remotelib.b;
import com.raon.remotelib.c;

class h
  implements View.OnTouchListener
{
  h(g paramg)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = 2;
    Object localObject = paramView.getTag();
    int j;
    if (localObject != null)
    {
      if (paramMotionEvent.getAction() != 0)
        break label325;
      paramView.setPressed(true);
      j = Integer.parseInt(localObject.toString());
      if ((!this.a.Q.d()) || (this.a.Q.c.a) || (j == p.G.bA))
        break label93;
      Toast.makeText(this.a.b(), 2131427345, i).show();
    }
    label93: label353: 
    while (true)
    {
      return true;
      if (j == p.G.bA)
        i = 1;
      while (true)
      {
        if (i == -1)
          break label353;
        b.a(this.a.Q, i, this.a.Q.c);
        this.a.R.a(this.a.Q, j);
        g.a(this.a);
        return true;
        if (j != p.bw.bA)
          if (j == p.bx.bA)
          {
            i = 3;
          }
          else if (j == p.bq.bA)
          {
            i = 4;
          }
          else if (j == p.br.bA)
          {
            i = 8;
          }
          else if (j == p.bu.bA)
          {
            i = 16;
          }
          else if (j == p.bt.bA)
          {
            i = 32;
          }
          else if (j == p.bv.bA)
          {
            i = 64;
          }
          else if (j == p.bs.bA)
          {
            i = 128;
          }
          else if (j == p.by.bA)
          {
            i = 256;
          }
          else
          {
            if (j == p.bz.bA)
            {
              i = 512;
              continue;
              if (paramMotionEvent.getAction() != 1)
                break;
              this.a.R.m();
              paramView.setPressed(false);
              return true;
            }
            i = -1;
          }
      }
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.h
 * JD-Core Version:    0.6.2
 */