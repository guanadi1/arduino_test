package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

class i extends Handler
{
  i(h paramh)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      super.handleMessage(paramMessage);
    case 1:
      do
        return;
      while (!this.a.f);
      this.a.a(false);
      return;
    case 2:
    }
    this.a.a();
    this.a.b.e();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.i
 * JD-Core Version:    0.6.2
 */