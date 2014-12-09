package com.raon.aremotefreegalaxy;

import android.content.Context;
import android.support.v4.view.am;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.raon.remotelib.d;

class ao extends am
{
  Context a;
  int[] b;
  d c;

  ao(Context paramContext, int[] paramArrayOfInt, d paramd)
  {
    this.a = paramContext;
    this.b = paramArrayOfInt;
    this.c = paramd;
  }

  public int a()
  {
    return this.b.length;
  }

  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(2130903073, null);
    ((TextView)localView.findViewById(2131230906)).setText("Model " + (paramInt + 1));
    ((TextView)localView.findViewById(2131230907)).setText(a.a(this.c.b) + " : " + this.c.c);
    ((TextView)localView.findViewById(2131230908)).setText("" + (paramInt + 1) + "/" + a());
    paramViewGroup.addView(localView, 0);
    return localView;
  }

  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup.removeView((View)paramObject);
  }

  public boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.ao
 * JD-Core Version:    0.6.2
 */