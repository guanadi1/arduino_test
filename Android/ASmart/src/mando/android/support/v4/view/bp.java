package android.support.v4.view;

class bp
  implements Runnable
{
  bp(ViewPager paramViewPager)
  {
  }

  public void run()
  {
    ViewPager.a(this.a, 0);
    this.a.c();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bp
 * JD-Core Version:    0.6.2
 */