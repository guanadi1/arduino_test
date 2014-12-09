package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.j;
import android.view.View;

class e extends b
{
  public j a(Object paramObject, View paramView)
  {
    Object localObject = k.a(paramObject, paramView);
    if (localObject != null)
      return new j(localObject);
    return null;
  }

  public Object a(a parama)
  {
    return k.a(new f(this, parama));
  }

  public boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return k.a(paramObject, paramView, paramInt, paramBundle);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.e
 * JD-Core Version:    0.6.2
 */