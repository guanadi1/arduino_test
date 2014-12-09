package android.support.v7.internal.widget;

class q
  implements Runnable
{
  private q(k paramk)
  {
  }

  public void run()
  {
    if (this.a.u)
    {
      if (this.a.e() != null)
        this.a.post(this);
      return;
    }
    k.b(this.a);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.q
 * JD-Core Version:    0.6.2
 */