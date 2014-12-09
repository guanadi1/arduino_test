package android.support.v4.app;

import android.view.View;

class e
  implements m
{
  e(Fragment paramFragment)
  {
  }

  public View a(int paramInt)
  {
    if (this.a.I == null)
      throw new IllegalStateException("Fragment does not have a view");
    return this.a.I.findViewById(paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.e
 * JD-Core Version:    0.6.2
 */