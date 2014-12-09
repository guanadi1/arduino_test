package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

class bz
  implements Comparator
{
  public int a(View paramView1, View paramView2)
  {
    bs localbs1 = (bs)paramView1.getLayoutParams();
    bs localbs2 = (bs)paramView2.getLayoutParams();
    if (localbs1.a != localbs2.a)
    {
      if (localbs1.a)
        return 1;
      return -1;
    }
    return localbs1.e - localbs2.e;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bz
 * JD-Core Version:    0.6.2
 */