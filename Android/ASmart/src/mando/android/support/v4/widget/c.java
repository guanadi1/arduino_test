package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

class c extends ContentObserver
{
  public c(a parama)
  {
    super(new Handler());
  }

  public boolean deliverSelfNotifications()
  {
    return true;
  }

  public void onChange(boolean paramBoolean)
  {
    this.a.b();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.c
 * JD-Core Version:    0.6.2
 */