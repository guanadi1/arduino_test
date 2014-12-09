package android.support.v4.widget;

import android.widget.Scroller;

class s
  implements r
{
  public void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ((Scroller)paramObject).startScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  public boolean a(Object paramObject)
  {
    return ((Scroller)paramObject).isFinished();
  }

  public int b(Object paramObject)
  {
    return ((Scroller)paramObject).getCurrX();
  }

  public int c(Object paramObject)
  {
    return ((Scroller)paramObject).getCurrY();
  }

  public boolean d(Object paramObject)
  {
    return ((Scroller)paramObject).computeScrollOffset();
  }

  public void e(Object paramObject)
  {
    ((Scroller)paramObject).abortAnimation();
  }

  public int f(Object paramObject)
  {
    return ((Scroller)paramObject).getFinalX();
  }

  public int g(Object paramObject)
  {
    return ((Scroller)paramObject).getFinalY();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.s
 * JD-Core Version:    0.6.2
 */