package android.support.v7.internal.widget;

class ae
  implements Runnable
{
  private int b;
  private int c;
  private boolean d;

  ae(ProgressBarICS paramProgressBarICS, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBoolean;
  }

  public void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBoolean;
  }

  public void run()
  {
    ProgressBarICS.a(this.a, this.b, this.c, this.d, true);
    ProgressBarICS.a(this.a, this);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ae
 * JD-Core Version:    0.6.2
 */